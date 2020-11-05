package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Professor;

public class EditProfessor implements Action{

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterando Professor");
		
		String nome = request.getParameter("nomeProfessor");
		String titulacao = request.getParameter("titulacaoProfessor");
		int id = Integer.parseInt(request.getParameter("idProfessor"));
		
		Banco banco = new Banco();
		Professor professor = banco.buscaProfessorId(id);
		professor.setNome(nome);
		professor.setTitulacao(titulacao);
		
		return "redirect:entrada?action=ShowProfessores";
	}

}
