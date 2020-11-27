package fatec.eletivaweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.CursoDAO;
import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.models.Curso;

public class CadastrarCurso implements Action{

	public String run(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Cadastrando Curso");
		
		String nome = request.getParameter("nomeCurso");
		String periodo = request.getParameter("periodoCurso");
		String descricao = request.getParameter("descricaoCurso");
		
		Curso curso = new Curso(nome, periodo, descricao);
		
		System.out.println("Acessando banco...");
		try {
			DAO<Curso> cursoDAO = new CursoDAO();
			cursoDAO.create(curso);
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar: " + e);
		}
		
		request.setAttribute("curso", curso.getNome());
		
		return "redirect:entrada?action=ShowCursos";
		
	}
}
