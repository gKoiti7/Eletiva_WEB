package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Turma;

public class EditTurma implements Action{

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterando Turma");
		
		String nome = request.getParameter("nomeTurma");
		String descricao = request.getParameter("descricaoTurma");
		int id = Integer.parseInt(request.getParameter("idTurma"));
		
		Banco banco = new Banco();
		Turma turma = banco.buscaTurmaId(id);
		turma.setNome(nome);
		turma.setDescricao(descricao);
		
		return "redirect:entrada?action=ShowTurmas";
	}

}
