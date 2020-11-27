package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.CursoDAO;
import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.models.Curso;

public class EditCurso implements Action{

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterando Curso");
		
		String nome = request.getParameter("nomeCurso");
		String periodo = request.getParameter("periodoCurso");
		String descricao = request.getParameter("descricaoCurso");
		int id = Integer.parseInt(request.getParameter("idCurso"));
		
		Curso user = new Curso(id, nome, periodo, descricao);
		
		System.out.println("Acessando banco...");
		
		DAO<Curso> cursoDAO = new CursoDAO();
		cursoDAO.update(user);
		
		System.out.println("Alteração realizada");
		
		return "redirect:entrada?action=ShowCursos";
	}

}
