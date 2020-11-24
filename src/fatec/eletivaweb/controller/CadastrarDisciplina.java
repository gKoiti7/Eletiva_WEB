package fatec.eletivaweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.DisciplinaDAO;
import fatec.eletivaweb.models.Disciplina;

public class CadastrarDisciplina implements Action{

	public String run(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Cadastrando Disciplina");
		
		String nome = request.getParameter("nomeDisciplina");
		int cargaHoraria = Integer.parseInt(request.getParameter("cargaDisciplina"));
		String ementa = request.getParameter("ementaDisciplina");
		
		Disciplina disciplina = new Disciplina(nome, cargaHoraria, ementa);
		
		System.out.println("Acessando banco...");
		try {
			DAO<Disciplina> disciplinaDAO = new DisciplinaDAO();
			disciplinaDAO.create(disciplina);
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar: " + e);
		}
		
		request.setAttribute("disciplina", disciplina.getNome());
		
		return "redirect:entrada?action=ShowDisciplinas";
		
	}
}
