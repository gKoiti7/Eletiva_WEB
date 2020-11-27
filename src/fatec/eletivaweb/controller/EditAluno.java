package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.AlunoDAO;
import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.models.Aluno;

public class EditAluno implements Action{

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterando Aluno");
		
		String nome = request.getParameter("nomeAluno");
		String turma = request.getParameter("turmaAluno");
		int id = Integer.parseInt(request.getParameter("idAluno"));
		
		Aluno user = new Aluno(id, nome, turma);
		
		System.out.println("Acessando banco...");
		
		DAO<Aluno> alunoDAO = new AlunoDAO();
		alunoDAO.update(user);
		
		System.out.println("Alteração realizada");
		
		return "redirect:entrada?action=ShowAlunos";
	}

}
