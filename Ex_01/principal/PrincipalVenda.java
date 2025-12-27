package principal;

import entidade.FormaPagamento;
import entidade.Venda;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PrincipalVenda {

    public static void main(String[] args) {

        Path caminho = Path.of("vendas.csv");

        // === Gravação ===
        Venda v1 = new Venda(1, "Mouse", 2, 80.00, FormaPagamento.PIX);
        Venda v2 = new Venda(2, "Teclado", 1, 150.00, FormaPagamento.CREDITO);

        v1.gravarEmArquivo(caminho);
        v2.gravarEmArquivo(caminho);

        // === Leitura ===
        System.out.println("=== LEITURA DO ARQUIVO CSV ===");

        try (BufferedReader reader = Files.newBufferedReader(caminho)) {

            String linha;
            while ((linha = reader.readLine()) != null) {

                String[] dados = linha.split(",");

                int numeroVenda = Integer.parseInt(dados[0]);
                String nomeItem = dados[1];
                int quantidade = Integer.parseInt(dados[2]);
                double preco = Double.parseDouble(dados[3]);
                FormaPagamento formaPagamento = FormaPagamento.valueOf(dados[4]);

                Venda venda = new Venda(
                        numeroVenda,
                        nomeItem,
                        quantidade,
                        preco,
                        formaPagamento
                );

                System.out.println(venda);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
