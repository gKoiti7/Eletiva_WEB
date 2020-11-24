package fatec.eletivaweb.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.CursoDAO;
import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.models.Curso;


public class ShowCursos implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando Cursos");
		
		DAO<Curso> cursoDAO = new CursoDAO();
		List<Curso> lista = new ArrayList<Curso>();
		lista = cursoDAO.read();
			
		request.setAttribute("cursos", lista);
		
		return "forward:listaCursos.jsp";
	}

}
