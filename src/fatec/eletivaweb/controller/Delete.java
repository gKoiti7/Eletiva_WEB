package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.AlunoDAO;
import fatec.eletivaweb.dao.CursoDAO;
import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.DisciplinaDAO;
import fatec.eletivaweb.dao.ProfessorDAO;
import fatec.eletivaweb.dao.TurmaDAO;
import fatec.eletivaweb.models.Aluno;
import fatec.eletivaweb.models.Curso;
import fatec.eletivaweb.models.Disciplina;
import fatec.eletivaweb.models.Professor;
import fatec.eletivaweb.models.Turma;

public class Delete implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Removendo");
		
		String nome = request.getParameter("nome");
		int userId = Integer.parseInt(request.getParameter("id"));
		
		System.out.println("Acessando banco...");
		switch(nome) {
			case "aluno":
				DAO<Aluno> alunoDAO = new AlunoDAO();
				alunoDAO.delete(userId);
				System.out.println("Exclusão realizada");
				return "redirect:entrada?action=ShowAlunos";
			case "professor":
				DAO<Professor> professorDAO = new ProfessorDAO();
				professorDAO.delete(userId);
				System.out.println("Exclusão realizada");
				return "redirect:entrada?action=ShowProfessores";
			case "curso":
				DAO<Curso> cursoDAO = new CursoDAO();
				cursoDAO.delete(userId);
				System.out.println("Exclusão realizada");
				return "redirect:entrada?action=ShowCursos";
			case "disciplina":
				DAO<Disciplina> disciplinaDAO = new DisciplinaDAO();
				disciplinaDAO.delete(userId);
				System.out.println("Exclusão realizada");
				return "redirect:entrada?action=ShowDisciplinas";
			case "turma":
				DAO<Turma> turmaDAO = new TurmaDAO();
				turmaDAO.delete(userId);
				System.out.println("Exclusão realizada");
				return "redirect:entrada?action=ShowTurmas";
		}
		return null;
	}

}
