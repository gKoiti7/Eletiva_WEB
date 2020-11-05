package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Curso;

public class SelectCurso implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Mostrando Curso selecionado");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		Curso curso = banco.buscaCursoId(id);
		
		System.out.println(curso.getNome());
		
		request.setAttribute("curso", curso);
		
		return "forward:formEditCurso.jsp";
	}

}
