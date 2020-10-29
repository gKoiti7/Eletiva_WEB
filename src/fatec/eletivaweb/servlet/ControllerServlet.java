package fatec.eletivaweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fatec.eletivaweb.controller.Action;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/entrada")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("action");
	
		String nomeDaClasse = "fatec.eletivaweb.controller." + paramAcao;
		
		String nome;
		try {
			Class classe = Class.forName(nomeDaClasse); // Carrega a classe com o nome da string => API Reflection
			Action acao = (Action) classe.newInstance();
			nome = acao.run(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}
		
		String[] tipoEndereco = nome.split(":");		
		if(tipoEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/" + tipoEndereco[1]);
			rd.forward(request, response);
		}else {
			response.sendRedirect(tipoEndereco[1]);
		}
	}	
}
