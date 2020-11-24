package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.DisciplinaDAO;
import fatec.eletivaweb.models.Disciplina;

public class SelectDisciplina implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Mostrando Disciplina selecionada");
		
		int userId = Integer.parseInt(request.getParameter("id"));
		
		Disciplina disciplina = new Disciplina();
		
		System.out.println("Acessando banco...");
		
		DAO<Disciplina> disciplinaDAO = new DisciplinaDAO();
		disciplina = disciplinaDAO.getUserById(userId);
		
		System.out.println("Disciplina selecionada");
		
		request.setAttribute("disciplina", disciplina);
		
		return "forward:formEditDisciplina.jsp";
	}

}
