package entidades;

public enum Classificacao {
	ROMANCE("Romance"),
	AVENTURA("Aventura"),
	FICCAO("Ficcao"),
	TECNICO("Conteudos Tecnicos");
	
	private String descricao;

    private Classificacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}