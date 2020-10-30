package fatec.eletivaweb.models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Aluno> listaAlunos = new ArrayList<>();
	private static List<Professor> listaProfessores = new ArrayList<>();
	private static List<Curso> listaCursos = new ArrayList<>();
	
	public void addAluno(Aluno aluno) {
		Banco.listaAlunos.add(aluno);
	}
	
	public List<Aluno> getAluno() {
		return Banco.listaAlunos;
	}
	
	public void addProfessor(Professor professor) {
		Banco.listaProfessores.add(professor);
	}
	
	public List<Professor> getProfessor() {
		return Banco.listaProfessores;
	}
	
	public void addCurso(Curso curso) {
		Banco.listaCursos.add(curso);
	}
	
	public List<Curso> getCurso() {
		return Banco.listaCursos;
	}
	
}
