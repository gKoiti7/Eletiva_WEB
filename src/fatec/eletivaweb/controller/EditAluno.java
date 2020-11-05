package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Aluno;
import fatec.eletivaweb.models.Banco;

public class EditAluno implements Action{

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterando Aluno");
		
		String nome = request.getParameter("nomeAluno");
		String turma = request.getParameter("turmaAluno");
		int id = Integer.parseInt(request.getParameter("idAluno"));
		
		Banco banco = new Banco();
		Aluno aluno = banco.buscaAlunoId(id);
		aluno.setNome(nome);
		aluno.setTurma(turma);
		
		return "redirect:entrada?action=ShowAlunos";
	}

}
