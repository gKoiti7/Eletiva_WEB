package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.CursoDAO;
import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.models.Curso;

public class SelectCurso implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Mostrando Curso selecionado");
		
		int userId = Integer.parseInt(request.getParameter("id"));
		
		Curso curso = new Curso();
		
		System.out.println("Acessando banco...");
		
		DAO<Curso> cursoDAO = new CursoDAO();
		curso = cursoDAO.getUserById(userId);
		
		System.out.println("Curso selecionado");
		
		request.setAttribute("curso", curso);
		
		return "forward:formEditCurso.jsp";
	}

}
