package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.dao.DisciplinaDAO;
import fatec.eletivaweb.models.Disciplina;

public class EditDisciplina implements Action{

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterando Disciplina");
		
		String nome = request.getParameter("nomeDisciplina");
		int carga = Integer.parseInt(request.getParameter("cargaDisciplina"));
		String ementa = request.getParameter("ementaDisciplina");
		int id = Integer.parseInt(request.getParameter("idDisciplina"));
		
		Disciplina user = new Disciplina(id, nome, carga, ementa);
		
		System.out.println("Acessando banco...");
		
		DAO<Disciplina> disciplinaDAO = new DisciplinaDAO();
		disciplinaDAO.update(user);
		
		System.out.println("Alteração realizada");
		
		return "redirect:entrada?action=ShowDisciplinas";
	}

}
