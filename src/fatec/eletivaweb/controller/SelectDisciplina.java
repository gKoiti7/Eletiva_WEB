package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Disciplina;

public class SelectDisciplina implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Mostrando Disciplina selecionada");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		Disciplina disciplina = banco.buscaDisciplinaId(id);
		
		System.out.println(disciplina.getNome());
		
		request.setAttribute("disciplina", disciplina);
		
		return "forward:formEditDisciplina.jsp";
	}

}
