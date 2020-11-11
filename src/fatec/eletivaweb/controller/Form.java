package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("form");
		
		switch(nome) {
			case "aluno":
				return "forward:formAluno.jsp";
			case "professor":
				return "forward:formProfessor.jsp";
			case "curso":
				return "forward:formCurso.jsp";
			case "disciplina":
				return "forward:formDisciplina.jsp";
			case "turma":
				return "forward:formTurma.jsp";
		}
		return null;
	}

}
