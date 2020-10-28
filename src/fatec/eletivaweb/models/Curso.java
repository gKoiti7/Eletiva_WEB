package fatec.eletivaweb.models;

public class Curso {

	private int id;
	private String nomeCurso;
	private int periodicidade;
	private String descricao;
	
	
	public Curso(String nome, int periodicidade, String descricao) {
		this.nomeCurso = nome;
		this.periodicidade = periodicidade;
		this.descricao = descricao;
	}
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public int getPeriodicidade() {
		return periodicidade;
	}
	public void setPeriodicidade(int periodicidade) {
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
	
	
}
