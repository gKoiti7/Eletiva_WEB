package fatec.eletivaweb.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormTurma implements Action {

public String run(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		return "forward:formTurma.jsp";
	}
}
