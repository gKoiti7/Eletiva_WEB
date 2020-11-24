package fatec.eletivaweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.TurmaDAO;
import fatec.eletivaweb.models.Turma;

public class CadastrarTurma implements Action{

	public String run(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Cadastrando Turma");
		
		String nome = request.getParameter("nomeTurma");
		String descricao = request.getParameter("descricaoTurma");
		
		Turma turma = new Turma(nome, descricao);
		
		System.out.println("Acessando banco...");
		try {
			DAO<Turma> turmaDAO = new TurmaDAO();
			turmaDAO.create(turma);
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar: " + e);
		}
		
		request.setAttribute("turma", turma.getNome());
		
		return "redirect:entrada?action=ShowTurmas";
		
	}
}
