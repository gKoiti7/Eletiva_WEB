package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.AlunoDAO;
import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.models.Aluno;

public class SelectAluno implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Mostrando Aluno selecionado");
		
		int userId = Integer.parseInt(request.getParameter("id"));
		
		Aluno aluno = new Aluno();
		
		System.out.println("Acessando banco...");
		
		DAO<Aluno> alunoDAO = new AlunoDAO();
		aluno = alunoDAO.getUserById(userId);
		
		System.out.println("Aluno selecionado");
		
		request.setAttribute("aluno", aluno);
		
		return "forward:formEditAluno.jsp";
	}

}
