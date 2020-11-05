package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Professor;

public class SelectProfessor implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Mostrando Professor selecionado");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		Professor professor = banco.buscaProfessorId(id);
		
		System.out.println(professor.getNome());
		
		request.setAttribute("professor", professor);
		
		return "forward:formEditProfessor.jsp";
	}

}
