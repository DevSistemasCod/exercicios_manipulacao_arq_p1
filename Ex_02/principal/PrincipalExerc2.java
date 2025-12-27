package principal;

import entidades.Classificacao;
import entidades.Livro;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrincipalExerc2 {

	public static void main(String[] args) {

		Path caminho = Path.of("livros.csv");

		// === Gravação ===
		Livro livro1 = new Livro(101, "Dom Casmurro", 256,
				"Machado de Assis", "Editora A", Classificacao.ROMANCE);

		Livro livro2 = new Livro(102, "O Hobbit", 310,
				"J.R.R. Tolkien", "Editora B", Classificacao.AVENTURA);

		Livro livro3 = new Livro(103, "Java Basico", 420,
				"Autor X", "Editora C", Classificacao.TECNICO);

		livro1.gravarEmArquivo(caminho);
		livro2.gravarEmArquivo(caminho);
		livro3.gravarEmArquivo(caminho);

		// === Leitura ===
		System.out.println("=== LEITURA DO ARQUIVO CSV ===");

		// Validação de existência do arquivo
		if (!Files.exists(caminho)) {
			System.out.println("Arquivo livros.csv não encontrado.");
			return;
		}

		try (BufferedReader reader = Files.newBufferedReader(caminho)) {

			String linha;
			while ((linha = reader.readLine()) != null) {

				String[] dados = linha.split(",");

				int codigo = Integer.parseInt(dados[0]);
				String titulo = dados[1];
				int paginas = Integer.parseInt(dados[2]);
				String autor = dados[3];
				String editora = dados[4];
				Classificacao classificacao = Classificacao.valueOf(dados[5]);

				Livro livro = new Livro(
						codigo,
						titulo,
						paginas,
						autor,
						editora,
						classificacao
				);

				System.out.println(livro);
			}

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
	}
}
