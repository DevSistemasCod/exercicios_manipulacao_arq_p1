package entidade;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Venda {
	private int numeroVenda;
    private String nomeItem;
    private int quantidade;
    private double preco;
    private FormaPagamento formaPagamento;

    //Construtor
    public Venda(int numeroVenda, String nomeItem, int quantidade, double preco, FormaPagamento formaPagamento) {
        this.numeroVenda = numeroVenda;
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
        this.preco = preco;
        this.formaPagamento = formaPagamento;
    }

    public void gravarDadosEmArquivo() {
        try {
            FileWriter writer = new FileWriter("arquivo.csv", true); 
            writer.write(numeroVenda + "," + nomeItem + "," + quantidade + "," + preco + "," + formaPagamento + "\n");

            writer.close(); 
        } catch (FileNotFoundException e) {
			System.out.println("Erro ao gerar arquivo: "+e.getMessage());
		} catch (IOException e) {
			System.out.println("Excecao: "+e.getMessage()); }

    }

    // Métodos getters e setters
    public int getNumeroVenda() {
        return numeroVenda;
    }

    public void setNumeroVenda(int numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

	@Override
	public String toString() {
		return "Venda [numeroVenda=" + numeroVenda + ", nomeItem=" + nomeItem + ", quantidade=" + quantidade
				+ ", preco=" + preco + ", formaPagamento=" + formaPagamento + "]";
	}
}
