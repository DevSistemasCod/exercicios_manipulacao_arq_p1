package principal;

import entidades.Aluno;
import entidades.Turma;

import java.nio.file.Path;

public class PrincipalExerc5 {

	public static void main(String[] args) {

		Turma turma = new Turma();

		// Adicionando alunos
		turma.adicionar(new Aluno("Clebinho", 1001, 20));
		turma.adicionar(new Aluno("Breno", 1002, 22));
		turma.adicionar(new Aluno("Carla", 1003, 19));

		// Listando alunos
		System.out.println("=== LISTA DE ALUNOS ===");
		turma.listar();

		// Removendo um aluno
		turma.remover(1002);

		// Listando novamente
		System.out.println("\n=== LISTA ATUALIZADA ===");
		turma.listar();

		// Salvando em arquivo
		Path caminho = Path.of("alunos.csv");
		turma.salvarEmArquivo(caminho);
	}
}