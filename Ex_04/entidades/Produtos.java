package entidades;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Produtos {
	private ArrayList<Produto> listaProdutos;

	public Produtos() {
		listaProdutos = new ArrayList<Produto>();
	}

	public void adicionarProduto(Produto produto) {
		if (produto != null) {
			listaProdutos.add(produto);
		}
	}

	public void removerProduto(int codigo) {
		if (!listaProdutos.isEmpty()) {
			for (int i = 0; i < listaProdutos.size(); i++) {
				if (listaProdutos.get(i).getCodigo() == codigo) {
					listaProdutos.remove(listaProdutos.get(i));
				}
			}
		} else {
			System.out.println("Lista vazia !");
		}
	}

	public void listarProdutos() {
		for (Produto produto : listaProdutos) {
			System.out.println(produto.toString());
		}
	}

	public void salvarEmArquivo(String nomeArquivo) {
		try (FileWriter writer = new FileWriter(nomeArquivo)) {
			for (Produto produto : listaProdutos) {
				writer.write(produto.toString() + "\n");
			}
			System.out.println("Dados dos produtos foram salvos no arquivo: " + nomeArquivo);
		} catch (FileNotFoundException e) {
			System.err.println("Excecao Capturada: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Erro ao salvar os dados dos produtos no arquivo. " + e.getMessage());
		}
	}
}
