package entidade;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Venda {

    private int numeroVenda;
    private String nomeItem;
    private int quantidade;
    private double preco;
    private FormaPagamento formaPagamento;

    public Venda(int numeroVenda, String nomeItem, int quantidade, double preco, FormaPagamento formaPagamento) {
        this.numeroVenda = numeroVenda;
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
        this.preco = preco;
        this.formaPagamento = formaPagamento;
    }

    public void gravarEmArquivo(Path caminho) {

        try (BufferedWriter writer = Files.newBufferedWriter(
                caminho,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND)) {

            String linha = numeroVenda + "," +
                    nomeItem + "," +
                    quantidade + "," +
                    preco + "," +
                    formaPagamento;

            writer.write(linha);
            writer.newLine();

        } catch (IOException e) {
            System.out.println("Erro ao gravar venda no arquivo: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Venda [numeroVenda=" + numeroVenda +
                ", nomeItem=" + nomeItem +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", formaPagamento=" + formaPagamento.getDescricao() + "]";
    }
}
