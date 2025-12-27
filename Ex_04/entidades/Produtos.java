package entidades;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;

public class Produtos {

	private ArrayList<Produto> listaProdutos;

	public Produtos() {
		listaProdutos = new ArrayList<>();
	}

	public void adicionar(Produto produto) {
		listaProdutos.add(produto);
	}

	public void listar() {
		if (listaProdutos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
		} else {
			for (Produto p : listaProdutos) {
				System.out.println(p);
			}
		}
	}

	public void remover(int codigo) {
		Iterator<Produto> iterator = listaProdutos.iterator();

		while (iterator.hasNext()) {
			Produto p = iterator.next();
			if (p.getCodigo() == codigo) {
				iterator.remove();
				System.out.println("Produto removido com sucesso.");
				return;
			}
		}

		System.out.println("Produto com código " + codigo + " não encontrado.");
	}

	public void salvarEmArquivo(Path caminho) {

		try (BufferedWriter writer = Files.newBufferedWriter(caminho)) {

			for (Produto p : listaProdutos) {
				String linha = p.getCodigo() + "," +
						p.getNome() + "," +
						p.getPreco();
				writer.write(linha);
				writer.newLine();
			}

			System.out.println("Produtos salvos em arquivo com sucesso.");

		} catch (IOException e) {
			System.out.println("Erro ao salvar produtos no arquivo: " + e.getMessage());
		}
	}
}