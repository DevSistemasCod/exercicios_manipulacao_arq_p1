package principal;

import java.util.Scanner;

import entidades.Produto;
import entidades.Produtos;

public class Principal {
	
	public static void menu() {
	     System.out.println("   ____ Menu ____");
         System.out.println("1 - Adicionar produto");
         System.out.println("2 - Remover produto");
         System.out.println("3 - Listar produtos");
         System.out.println("4 - Salvar");
         System.out.println("5 - Sair");
         System.out.print("\nEscolha uma opcao: ");
	}
	
	public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        Produtos gerenciador = new Produtos();

        try {
            int opcao = 0;
            while (opcao != 5) {
            	menu();
                opcao = lerDados.nextInt();

                switch (opcao) {
                    case 1:
                        lerDados.nextLine(); 
                        System.out.println("\nCadastro de Produto: ");
                        System.out.print("Nome: ");
                        String nome = lerDados.nextLine();

                        System.out.print("Codigo: ");
                        int codigo = lerDados.nextInt();

                        System.out.print("Preço: ");
                        double preco = lerDados.nextDouble();

                        Produto novoProduto = new Produto(nome, codigo, preco);
                        gerenciador.adicionarProduto(novoProduto);
                        break;

                    case 2:
                        System.out.println("\nRemocao de Produto: ");
                        System.out.print("Informe o codigo do produto a ser removido: ");
                        int codigo_Remover = lerDados.nextInt();
                        gerenciador.removerProduto(codigo_Remover);
                        break;
                        
                    case 3:
                        System.out.println("\nLista de Produtos");
                        gerenciador.listarProdutos();
                        break;

                    case 4:
                        System.out.print("\nDigite o nome do arquivo para salvar os dados dos produtos: ");
                        lerDados.nextLine(); 
                        String nomeArquivo = lerDados.nextLine();
                        String extensao = ".txt";
                        gerenciador.salvarEmArquivo(nomeArquivo+extensao);
                        break;
                        
                    case 5:
                        System.out.print("\nSaindo... ");
                        break;
                        
                    default:
                        System.out.println("Opcao invalida. Por favor, escolha uma opcao valida.");
                        break;
                }

                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a execucao do programa.");
        } finally {
            lerDados.close();
        }
    }
                        
                        
}
