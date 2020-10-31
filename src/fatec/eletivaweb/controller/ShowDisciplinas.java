package fatec.eletivaweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Disciplina;


public class ShowDisciplinas implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando Disciplinas");
		
		Banco banco = new Banco();
		List<Disciplina> lista = banco.getDisciplina();
			
		request.setAttribute("disciplinas", lista);
		
		return "forward:listaDisciplinas.jsp";
	}

}
