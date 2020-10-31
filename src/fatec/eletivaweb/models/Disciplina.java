package fatec.eletivaweb.models;

public class Disciplina {

	private int id;
	private String nome;
	private int cargaHoraria;
	private String ementa;
	
	public Disciplina(String nome, int cargaHoraria, String ementa) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.ementa = ementa;
	}
	
	public Disciplina() {
		
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

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	
}
