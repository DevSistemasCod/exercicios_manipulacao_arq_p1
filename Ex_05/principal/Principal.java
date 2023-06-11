package principal;

import entidades.Aluno;
import entidades.Turma;

public class Principal {
	public static void main(String[] args) {
		Turma turma = new Turma();

		Aluno aluno1 = new Aluno("Carlos", 1, 21);
		Aluno aluno2 = new Aluno("Ana", 2, 22);

		turma.adicionarAluno(aluno1);
		turma.adicionarAluno(aluno2);

		System.out.println("Alunos na turma:");
		turma.listarAlunos();

		turma.removerAluno(aluno2);


		System.out.println("Alunos na turma após remoção:");
		turma.listarAlunos();

		turma.salvarEmArquivo("alunos.csv");
	}
}
