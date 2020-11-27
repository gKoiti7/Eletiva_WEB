package fatec.eletivaweb.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.DisciplinaDAO;
import fatec.eletivaweb.models.Disciplina;


public class ShowDisciplinas implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando Disciplinas");
		
		DAO<Disciplina> disciplinaDAO = new DisciplinaDAO();
		List<Disciplina> lista = new ArrayList<Disciplina>();
		lista = disciplinaDAO.read();
			
		request.setAttribute("disciplinas", lista);
		
		return "forward:listaDisciplinas.jsp";
	}

}
