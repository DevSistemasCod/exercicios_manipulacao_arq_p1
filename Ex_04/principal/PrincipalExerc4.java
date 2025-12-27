package principal;



import entidades.Produto;
import entidades.Produtos;

import java.nio.file.Path;

public class PrincipalExerc4 {

    public static void main(String[] args) {

        Produtos produtos = new Produtos();

        // Adicionando produtos
        produtos.adicionar(new Produto("Mouse", 1, 79.90));
        produtos.adicionar(new Produto("Teclado", 2, 149.90));
        produtos.adicionar(new Produto("Monitor", 3, 899.00));

        // Listando produtos
        System.out.println("=== LISTA DE PRODUTOS ===");
        produtos.listar();

        // Removendo um produto
        produtos.remover(2);

        // Listando novamente
        System.out.println("\n=== LISTA ATUALIZADA ===");
        produtos.listar();

        // Salvando em arquivo
        Path caminho = Path.of("produtos.csv");
        produtos.salvarEmArquivo(caminho);
    }
}
