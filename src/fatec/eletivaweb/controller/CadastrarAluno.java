package fatec.eletivaweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.AlunoDAO;
import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.models.Aluno;

public class CadastrarAluno implements Action{

	public String run(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Cadastrando Aluno");
		
		String nome = request.getParameter("nomeAluno");
		String turma = request.getParameter("turmaAluno");
		
		Aluno aluno = new Aluno(nome, turma);
		
		System.out.println("Acessando banco...");
		try {
			DAO<Aluno> alunoDAO = new AlunoDAO();
			alunoDAO.create(aluno);
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar: " + e);
		}
		
		
		request.setAttribute("aluno", aluno.getNome());
		
		return "redirect:entrada?action=ShowAlunos";
		
	}
}
