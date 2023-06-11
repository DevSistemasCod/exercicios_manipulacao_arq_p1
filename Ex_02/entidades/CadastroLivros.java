package entidades;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CadastroLivros {
	private ArrayList<Livro> listaLivros;

	public CadastroLivros() {
		listaLivros = new ArrayList<>();
	}

	public void adicionarLivro(Livro livro) {
		listaLivros.add(livro);
	}

	public void salvarEmArquivo(String nomeArquivo) {
		try (FileWriter writer = new FileWriter(nomeArquivo)) {
			for (Livro livro : listaLivros) {
				writer.write(livro.toString() + "\n");
			}
			System.out.println("Dados dos livros foram salvos no arquivo: " + nomeArquivo);
		} catch (IOException e) {
			System.out.println("Erro ao salvar os dados dos livros no arquivo."+e.getMessage());
		}
	}

	public void lerArquivo(String nomeArquivo) {
		 try (FileReader reader = new FileReader(nomeArquivo)) {
		        int i;
		        String linha = "";

		        while ((i = reader.read()) != -1) {
		            if (i == '\n') {
		                processarLinha(linha);
		                linha = "";
		            } else {
		                linha = (linha + (char)i);
		            }
		        }

		        if (!linha.isEmpty()) {
		            processarLinha(linha);
		        }

		        System.out.println("Dados do arquivo foram lidos com sucesso!");
		    } catch (IOException e) {
		        System.err.println("Erro ao ler o arquivo.");
		    }
	}

	private void processarLinha(String linha) {
	    String[] dados = linha.split(",");
	    int codigo = Integer.parseInt(dados[0]);
	    String titulo = dados[1];
	    int numeroPaginas = Integer.parseInt(dados[2]);
	    String autor = dados[3];
	    String editora = dados[4];
	    Classificacao classificacao = Classificacao.valueOf(dados[5]);

	    Livro livro = new Livro(codigo, titulo, numeroPaginas, autor, editora, classificacao);
	    listaLivros.add(livro);
	}
	
	public void listarLivros() {
		for (Livro livro : listaLivros) {
			System.out.println(livro.toString());
		}
	}
}
