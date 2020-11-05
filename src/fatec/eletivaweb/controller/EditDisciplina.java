package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Disciplina;

public class EditDisciplina implements Action{

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterando Disciplina");
		
		String nome = request.getParameter("nomeDisciplina");
		int carga = Integer.parseInt(request.getParameter("cargaDisciplina"));
		String ementa = request.getParameter("ementaDisciplina");
		int id = Integer.parseInt(request.getParameter("idDisciplina"));
		
		Banco banco = new Banco();
		Disciplina disciplina = banco.buscaDisciplinaId(id);
		disciplina.setNome(nome);
		disciplina.setCargaHoraria(carga);
		disciplina.setEmenta(ementa);
		
		return "redirect:entrada?action=ShowDisciplinas";
	}

}
