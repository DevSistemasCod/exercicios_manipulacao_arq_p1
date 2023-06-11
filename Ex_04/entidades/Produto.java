package entidades;

public class Produto {
	  private String nome;
	    private int codigo;
	    private double preco;

	    public Produto(String nome, int codigo, double preco) {
	        this.nome = nome;
	        this.codigo = codigo;
	        this.preco = preco;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    @Override
	    public String toString() {
	        return "Produto["+ "nome: " + nome  +
	                ", codigo: " + codigo +
	                ", preco: " + preco + ']';
	    }
}
