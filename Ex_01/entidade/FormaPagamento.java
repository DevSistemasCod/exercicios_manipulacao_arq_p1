package entidade;

public enum FormaPagamento {
	DINHEIRO("Pagamento em dinheiro"),
	PIX("Pagamento em PIX"),
	CREDITO("Pagamento em Cartao de Credito"),
	DEBITO("Pagamento em Cartao de Debito");
	
	private String descricao;

    private FormaPagamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}