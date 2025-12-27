package entidades;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;

public class Turma {

	private ArrayList<Aluno> listaDeAlunos;

	public Turma() {
		listaDeAlunos = new ArrayList<>();
	}

	public void adicionar(Aluno aluno) {
		listaDeAlunos.add(aluno);
	}

	public void listar() {
		if (listaDeAlunos.isEmpty()) {
			System.out.println("Nenhum aluno cadastrado.");
		} else {
			for (Aluno a : listaDeAlunos) {
				System.out.println(a);
			}
		}
	}

	public void remover(int matricula) {
		Iterator<Aluno> iterator = listaDeAlunos.iterator();

		while (iterator.hasNext()) {
			Aluno a = iterator.next();
			if (a.getMatricula() == matricula) {
				iterator.remove();
				System.out.println("Aluno removido com sucesso.");
				return;
			}
		}

		System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
	}

	public void salvarEmArquivo(Path caminho) {

		try (BufferedWriter writer = Files.newBufferedWriter(caminho)) {

			for (Aluno a : listaDeAlunos) {
				String linha = a.getMatricula() + "," +
						a.getNome() + "," +
						a.getIdade();
				writer.write(linha);
				writer.newLine();
			}

			System.out.println("Alunos salvos em arquivo com sucesso.");

		} catch (IOException e) {
			System.out.println("Erro ao salvar alunos no arquivo: " + e.getMessage());
		}
	}
}
