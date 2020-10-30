package fatec.eletivaweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Professor;


public class ShowProfessores implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando Professores");
		
		Banco banco = new Banco();
		List<Professor> lista = banco.getProfessor();
			
		request.setAttribute("professores", lista);
		
		return "forward:listaProfessores.jsp";
	}

}
