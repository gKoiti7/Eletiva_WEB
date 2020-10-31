package fatec.eletivaweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Turma;

public class CadastrarTurma implements Action{

	public String run(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Cadastrando Turma");
		
		String nome = request.getParameter("nomeTurma");
		String descricao = request.getParameter("descricaoTurma");
		
		Turma turma = new Turma(nome, descricao);
		
		//Dao dao = new Dao();
		//dao.cadastrar(aluno);
		
		Banco banco = new Banco();
		banco.addTurma(turma);
		
		request.setAttribute("turma", turma.getNome());
		
		return "redirect:entrada?action=ShowTurmas";
		
	}
}
