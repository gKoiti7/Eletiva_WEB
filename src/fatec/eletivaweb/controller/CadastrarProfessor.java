package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.ProfessorDAO;
import fatec.eletivaweb.models.Professor;

public class CadastrarProfessor implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("Cadastrando Professor");
		
		String nome = request.getParameter("nomeProfessor");
		String titulacao = request.getParameter("titulacaoProfessor");
		
		Professor professor = new Professor(nome, titulacao);
		
		System.out.println("Acessando banco...");
		try {
			DAO<Professor> professorDAO = new ProfessorDAO();
			professorDAO.create(professor);
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar: " + e);
		}
		
		request.setAttribute("professor", professor.getNome());
		
		return "redirect:entrada?action=ShowProfessores";
	}

}
