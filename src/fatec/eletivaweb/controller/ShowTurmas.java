package fatec.eletivaweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Turma;


public class ShowTurmas implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando Turmas");
		
		Banco banco = new Banco();
		List<Turma> lista = banco.getTurma();
			
		request.setAttribute("turmas", lista);
		
		return "forward:listaTurmas.jsp";
	}

}
