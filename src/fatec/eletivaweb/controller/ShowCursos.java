package fatec.eletivaweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Aluno;
import fatec.eletivaweb.models.Banco;


public class ShowCursos implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando empresas!");
		
		Banco banco = new Banco();
		List<Aluno> lista = banco.getAluno();
			
		request.setAttribute("alunos", lista);
		
		return "forward:listaAlunos.jsp";
	}

}
