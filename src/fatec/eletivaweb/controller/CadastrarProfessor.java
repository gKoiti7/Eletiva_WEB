package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Professor;

public class CadastrarProfessor implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
System.out.println("Cadastrando Professor");
		
		String nome = request.getParameter("nomeProfessor");
		String titulacao = request.getParameter("titulacaoProfessor");
		
		Professor professor = new Professor(nome, titulacao);
		
		//Dao dao = new Dao();
		//dao.cadastrar(professor);
		
		Banco banco = new Banco();
		banco.addProfessor(professor);
		
		request.setAttribute("professor", professor.getNome());
		
		return "redirect:entrada?action=ShowProfessores";
	}

}
