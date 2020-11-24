package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.TurmaDAO;
import fatec.eletivaweb.models.Turma;

public class EditTurma implements Action{

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterando Turma");
		
		String nome = request.getParameter("nomeTurma");
		String descricao = request.getParameter("descricaoTurma");
		int id = Integer.parseInt(request.getParameter("idTurma"));
		
		Turma user = new Turma(id, nome, descricao);
		
		System.out.println("Acessando banco...");
		
		DAO<Turma> turmaDAO = new TurmaDAO();
		turmaDAO.update(user);
		
		System.out.println("Alteração realizada");
		
		return "redirect:entrada?action=ShowTurmas";
	}

}
