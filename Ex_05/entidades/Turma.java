package entidades;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Turma {
	private ArrayList<Aluno> listaDeAlunos;

	public Turma() {
		listaDeAlunos = new ArrayList<Aluno>();
	}

	public void adicionarAluno(Aluno aluno) {
		listaDeAlunos.add(aluno);
	}

	public void listarAlunos() {
		for (Aluno aluno : listaDeAlunos) {
			System.out.println(aluno.toString());
		}
	}

	public void removerAluno(Aluno aluno) {
		listaDeAlunos.remove(aluno);
	}

	public void salvarEmArquivo(String nomeArquivo) {
		try (FileWriter fileWriter = new FileWriter(nomeArquivo)) {
			for (Aluno aluno : listaDeAlunos) {
				fileWriter.write(aluno.getNome() + "," + aluno.getMatricula() + "," + aluno.getIdade() + "\n");
			}
			System.out.println("Dados dos alunos foram salvos no arquivo: " + nomeArquivo);
		} catch (IOException e) {
			System.out.println("Erro ao salvar os dados dos alunos no arquivo."+e.getMessage());
		}
	}
}