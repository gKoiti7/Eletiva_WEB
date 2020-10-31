package fatec.eletivaweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Disciplina;

public class CadastrarDisciplina implements Action{

	public String run(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Cadastrando Disciplina");
		
		String nome = request.getParameter("nomeDisciplina");
		int cargaHoraria = Integer.parseInt(request.getParameter("cargaDisciplina"));
		String ementa = request.getParameter("ementaDisciplina");
		
		Disciplina disciplina = new Disciplina(nome, cargaHoraria, ementa);
		
		//Dao dao = new Dao();
		//dao.cadastrar(aluno);
		
		Banco banco = new Banco();
		banco.addDisciplina(disciplina);
		
		request.setAttribute("disciplina", disciplina.getNome());
		
		return "redirect:entrada?action=ShowDisciplinas";
		
	}
}
