package principal;

import entidades.CadastroLivros;
import entidades.Classificacao;
import entidades.Livro;

public class Principal {
	 public static void main(String[] args) {
		 CadastroLivros cadastro = new CadastroLivros();
	     Livro livro1 = new Livro(1, "Iracema", 120, "Jose de Alencar", "Editora Brasil", Classificacao.ROMANCE);
	     Livro livro2 = new Livro(2, "A ilha Perdida", 190, "Maria José Dupre", "Editora Vagalume", Classificacao.AVENTURA);
	        
	     cadastro.adicionarLivro(livro1);
	     cadastro.adicionarLivro(livro2);
	     cadastro.salvarEmArquivo("livros.csv");

	     CadastroLivros cadastroLido = new CadastroLivros();
	     cadastroLido.lerArquivo("livros.csv");
    
	     cadastroLido.listarLivros();
	 }
}
