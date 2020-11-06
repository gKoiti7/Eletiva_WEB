package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Turma;

public class SelectTurma implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Mostrando Turma selecionada");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		Turma turma = banco.buscaTurmaId(id);
		
		System.out.println(turma.getNome());
		
		request.setAttribute("turma", turma);
		
		return "forward:formEditTurma.jsp";
	}

}
