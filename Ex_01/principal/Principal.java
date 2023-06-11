package principal;

import entidade.FormaPagamento;
import entidade.Venda;

public class Principal {
	  public static void main(String[] args) {
	        Venda venda = new Venda(1, "Camiseta", 2, 39.90, FormaPagamento.CREDITO);
	        venda.gravarDadosEmArquivo();
	    }
}
