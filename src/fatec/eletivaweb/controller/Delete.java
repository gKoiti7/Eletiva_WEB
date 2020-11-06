package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;

public class Delete implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Removendo");
		
		String nome = request.getParameter("nome");
		int id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		
		switch(nome) {
			case "aluno":
				banco.removeAluno(id);
				return "redirect:entrada?action=ShowAlunos";
			case "professor":
				banco.removeProfessor(id);
				return "redirect:entrada?action=ShowProfessores";
			case "curso":
				banco.removeCurso(id);
				return "redirect:entrada?action=ShowCursos";
			case "disciplina":
				banco.removeDisciplina(id);
				return "redirect:entrada?action=ShowDisciplinas";
			case "turma":
				banco.removeTurma(id);
				return "redirect:entrada?action=ShowTurmas";
		}
		return null;
	}

}
