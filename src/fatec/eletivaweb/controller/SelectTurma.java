package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.TurmaDAO;
import fatec.eletivaweb.models.Turma;

public class SelectTurma implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Mostrando Turma selecionada");
		
		int userId = Integer.parseInt(request.getParameter("id"));
		
		Turma turma = new Turma();
		
		System.out.println("Acessando banco...");
		
		DAO<Turma> turmaDAO = new TurmaDAO();
		turma = turmaDAO.getUserById(userId);
		
		System.out.println("Turma selecionada");
		
		request.setAttribute("turma", turma);
		
		return "forward:formEditTurma.jsp";
	}

}
