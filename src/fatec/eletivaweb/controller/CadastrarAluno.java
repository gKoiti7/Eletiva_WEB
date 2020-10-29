package fatec.eletivaweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Aluno;
import fatec.eletivaweb.models.Banco;

public class CadastrarAluno implements Action{

	public String run(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Cadastrando Aluno");
		
		String nome = request.getParameter("nomeAluno");
		String turma = request.getParameter("turmaAluno");
		
		Aluno aluno = new Aluno(nome, turma);
		
		//Dao dao = new Dao();
		//dao.cadastrar(aluno);
		
		Banco banco = new Banco();
		banco.addAluno(aluno);
		
		request.setAttribute("aluno", aluno.getNome());
		
		return "redirect:entrada?action=ShowAlunos";
		
	}
}
