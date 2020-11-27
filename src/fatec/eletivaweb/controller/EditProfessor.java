package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.ProfessorDAO;
import fatec.eletivaweb.models.Professor;

public class EditProfessor implements Action{

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterando Professor");
		
		String nome = request.getParameter("nomeProfessor");
		String titulacao = request.getParameter("titulacaoProfessor");
		int id = Integer.parseInt(request.getParameter("idProfessor"));
		
		Professor user = new Professor(id, nome, titulacao);
		
		System.out.println("Acessando banco...");
		
		DAO<Professor> professorDAO = new ProfessorDAO();
		professorDAO.update(user);
		
		System.out.println("Alteração realizada");
		
		return "redirect:entrada?action=ShowProfessores";
	}

}
