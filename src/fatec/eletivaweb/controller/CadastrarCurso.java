package fatec.eletivaweb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Curso;

public class CadastrarCurso implements Action{

	public String run(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Cadastrando Curso");
		
		String nome = request.getParameter("nomeCurso");
		String periodo = request.getParameter("periodoCurso");
		String descricao = request.getParameter("descricaoCurso");
		
		Curso curso = new Curso(nome, periodo, descricao);
		
		//Dao dao = new Dao();
		//dao.cadastrar(aluno);
		
		Banco banco = new Banco();
		banco.addCurso(curso);
		
		request.setAttribute("curso", curso.getNome());
		
		return "redirect:entrada?action=ShowCursos";
		
	}
}
