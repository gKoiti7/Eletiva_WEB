package fatec.eletivaweb.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.dao.AlunoDAO;
import fatec.eletivaweb.dao.DAO;
import fatec.eletivaweb.models.Aluno;


public class ShowAlunos implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Listando Alunos");
		
		DAO<Aluno> alunoDAO = new AlunoDAO();
		List<Aluno> lista = new ArrayList<Aluno>();
		lista = alunoDAO.read();
			
		request.setAttribute("alunos", lista);
		
		return "forward:listaAlunos.jsp";
	}

}
