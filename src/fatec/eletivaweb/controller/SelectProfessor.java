package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.ProfessorDAO;
import fatec.eletivaweb.models.Professor;

public class SelectProfessor implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Mostrando Professor selecionado");
		
		int userId = Integer.parseInt(request.getParameter("id"));
		
		Professor professor = new Professor();
		
		System.out.println("Acessando banco...");
		
		DAO<Professor> professorDAO = new ProfessorDAO();
		professor = professorDAO.getUserById(userId);
		
		System.out.println("Professor selecionado");
		
		request.setAttribute("professor", professor);
		
		return "forward:formEditProfessor.jsp";
	}

}
