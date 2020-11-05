package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Curso;

public class EditCurso implements Action{

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterando Curso");
		
		String nome = request.getParameter("nomeCurso");
		String periodo = request.getParameter("periodoCurso");
		String descricao = request.getParameter("descricaoCurso");
		int id = Integer.parseInt(request.getParameter("idCurso"));
		
		Banco banco = new Banco();
		Curso curso = banco.buscaCursoId(id);
		curso.setNome(nome);
		curso.setPeriodicidade(periodo);
		curso.setDescricao(descricao);
		
		return "redirect:entrada?action=ShowCursos";
	}

}
