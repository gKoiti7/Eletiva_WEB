package fatec.eletivaweb.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.TurmaDAO;
import fatec.eletivaweb.models.Turma;


public class ShowTurmas implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando Turmas");
		
		DAO<Turma> turmaDAO = new TurmaDAO();
		List<Turma> lista = new ArrayList<Turma>();
		lista = turmaDAO.read();
			
		request.setAttribute("turmas", lista);
		
		return "forward:listaTurmas.jsp";
	}

}
