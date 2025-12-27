package entidades;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Livro {

	private int codigo;
	private String titulo;
	private int numeroPaginas;
	private String autor;
	private String editora;
	private Classificacao classificacao;

	public Livro(int codigo, String titulo, int numeroPaginas,
				 String autor, String editora, Classificacao classificacao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.numeroPaginas = numeroPaginas;
		this.autor = autor;
		this.editora = editora;
		this.classificacao = classificacao;
	}

	public void gravarEmArquivo(Path caminho) {

		try (BufferedWriter writer = Files.newBufferedWriter(
				caminho,
				StandardOpenOption.CREATE,
				StandardOpenOption.APPEND)) {

			String linha = codigo + "," +
					titulo + "," +
					numeroPaginas + "," +
					autor + "," +
					editora + "," +
					classificacao;

			writer.write(linha);
			writer.newLine();

		} catch (IOException e) {
			System.out.println("Erro ao gravar livro no arquivo: " + e.getMessage());
		}
	}

	@Override
	public String toString() {
		return "Livro [codigo=" + codigo +
				", titulo=" + titulo +
				", paginas=" + numeroPaginas +
				", autor=" + autor +
				", editora=" + editora +
				", classificacao=" + classificacao.getDescricao() + "]";
	}
}
