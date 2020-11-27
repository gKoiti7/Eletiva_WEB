package fatec.eletivaweb.models;

public class Curso {

	private int id;
	private String nome;
	private String periodicidade;
	private String descricao;
	
	public Curso() {
		
	}
	
	public Curso(String nome, String periodicidade, String descricao) {
		this.nome = nome;
		this.periodicidade = periodicidade;
		this.descricao = descricao;
	}
	
	public Curso(int id, String nome, String periodo, String descricao) {
		this.id = id;
		this.nome = nome;
		this.periodicidade = periodo;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nomeCurso) {
		this.nome = nomeCurso;
	}
	
	public String getPeriodicidade() {
		return periodicidade;
	}
	
	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
}
