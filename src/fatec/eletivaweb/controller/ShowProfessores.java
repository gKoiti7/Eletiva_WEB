package fatec.eletivaweb.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.ProfessorDAO;
import fatec.eletivaweb.models.Professor;


public class ShowProfessores implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando Professores");
		
		DAO<Professor> professorDAO = new ProfessorDAO();
		List<Professor> lista = new ArrayList<Professor>();
		lista = professorDAO.read();
		
		request.setAttribute("professores", lista);
		
		return "forward:listaProfessores.jsp";
	}

}
