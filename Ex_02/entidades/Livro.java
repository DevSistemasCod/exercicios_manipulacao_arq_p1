package entidades;

public class Livro {
	private int codigo;
	private String titulo;
	private int numeroPaginas;
	private String autor;
	private String editora;
	private Classificacao classificacao;

	public Livro(int codigo, String titulo, int numeroPaginas, String autor, String editora,
			Classificacao classificacao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.numeroPaginas = numeroPaginas;
		this.autor = autor;
		this.editora = editora;
		this.classificacao = classificacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Classificacao getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}

	@Override
	public String toString() {
		return codigo + "," + titulo + "," + numeroPaginas + "," + autor + "," + editora + "," + classificacao;
	}
}