package fatec.eletivaweb.models;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Aluno> listaAlunos = new ArrayList<>();
	private static int idAluno = 1;
	private static List<Professor> listaProfessores = new ArrayList<>();
	private static int idProfessor = 1;
	private static List<Curso> listaCursos = new ArrayList<>();
	private static int idCurso = 1;
	private static List<Disciplina> listaDisciplina = new ArrayList<>();
	private static int idDisciplina = 1;
	private static List<Turma> listaTurma = new ArrayList<>();
	private static int idTurma = 1;
	
	public void addAluno(Aluno aluno) {
		aluno.setId(Banco.idAluno++);
		Banco.listaAlunos.add(aluno);
	}
	
	public List<Aluno> getAluno() {
		return Banco.listaAlunos;
	}
	
	public void addProfessor(Professor professor) {
		professor.setId(Banco.idProfessor++);
		Banco.listaProfessores.add(professor);
	}
	
	public List<Professor> getProfessor() {
		return Banco.listaProfessores;
	}
	
	public void addCurso(Curso curso) {
		curso.setId(Banco.idCurso++);
		Banco.listaCursos.add(curso);
	}
	
	public List<Curso> getCurso() {
		return Banco.listaCursos;
	}
	
	public void addDisciplina(Disciplina disciplina) {
		disciplina.setId(Banco.idDisciplina++);
		Banco.listaDisciplina.add(disciplina);
	}
	
	public List<Disciplina> getDisciplina(){
		return Banco.listaDisciplina;
	}
	
	public void addTurma(Turma turma) {
		turma.setId(Banco.idTurma++);
		Banco.listaTurma.add(turma);
	}
	
	public List<Turma> getTurma() {
		return Banco.listaTurma;
	}

	public Aluno buscaAlunoId(int id) {
		for (Aluno aluno : listaAlunos) {
			if(aluno.getId() == id) {
				return aluno;
			}
		}
		return null;
	}
	
	public Professor buscaProfessorId(int id) {
		for (Professor professor : listaProfessores) {
			if(professor.getId() == id) {
				return professor;
			}
		}
		return null;
	}

	public Curso buscaCursoId(int id) {
		for (Curso curso : listaCursos) {
			if(curso.getId() == id) {
				return curso;
			}
		}
		return null;
	}

	public Disciplina buscaDisciplinaId(int id) {
		for (Disciplina disciplina : listaDisciplina) {
			if(disciplina.getId() == id) {
				return disciplina;
			}
		}
		return null;
	}
	
}
