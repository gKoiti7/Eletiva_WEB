package fatec.eletivaweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.models.Banco;
import fatec.eletivaweb.models.Curso;

/**
 * Servlet implementation class novoCursoServlet
 */
@WebServlet("/novoCurso")
public class novoCursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomeCurso = request.getParameter("nomeCurso");
		int periodicidadeCurso = Integer.parseInt(request.getParameter("periodicidadeCurso"));
		String descricaoCurso = request.getParameter("descricaoCurso");
		
		Curso curso = new Curso(nomeCurso, periodicidadeCurso, descricaoCurso);
		
		Banco banco = new Banco();
		banco.adiciona(curso);
		
		request.setAttribute("curso", curso.getNomeCurso());
		
		//response.sendRedirect("listaCursos");
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaCursos.jsp");
		
		rd.forward(request, response);
	}

}
