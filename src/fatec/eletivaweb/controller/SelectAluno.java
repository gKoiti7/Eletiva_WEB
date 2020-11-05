package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Aluno;
import fatec.eletivaweb.models.Banco;

public class SelectAluno implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Mostrando Aluno selecionado");
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Banco banco = new Banco();
		Aluno aluno = banco.buscaAlunoId(id);
		
		System.out.println(aluno.getNome());
		
		request.setAttribute("aluno", aluno);
		
		return "forward:formEditAluno.jsp";
	}

}
