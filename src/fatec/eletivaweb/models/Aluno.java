package fatec.eletivaweb.models;

public class Aluno {

	private int id;
	private String nome;
	private String turma;
	
	public Aluno(String nome, String turma) {
		this.nome = nome;
		this.turma = turma;
	}
	
	public Aluno(int id, String nome, String turma) {
		this.id = id;
		this.nome = nome;
		this.turma = turma;
	}
	
	public Aluno() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	
}
