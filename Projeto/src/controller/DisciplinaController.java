package controller;

import dao.DisciplinaDao;
import model.Disciplina;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Disciplinas", urlPatterns = {"/DisciplinaController"})
public class DisciplinaController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/disciplina.jsp";
    private static String LIST_USER = "/listDisciplina.jsp";
    private DisciplinaDao dao;

    public DisciplinaController() {
        super();
        dao = new DisciplinaDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int userId = Integer.parseInt(request.getParameter("id"));
            dao.deleteUser(userId);
            forward = LIST_USER;
            request.setAttribute("users", dao.getAllUsers());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int userId = Integer.parseInt(request.getParameter("id"));
            Disciplina user = dao.getUserById(userId);
            request.setAttribute("user", user);
        } else if (action.equalsIgnoreCase("listUser")){
            forward = LIST_USER;
            request.setAttribute("users", dao.getAllUsers());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	    		
    		Disciplina user = new Disciplina();
            user.setNome(request.getParameter("nome"));
            String carga = request.getParameter("carga");
            user.setCargaHoraria(Integer.parseInt(carga));
            user.setEmenta(request.getParameter("ementa"));
            String userid = request.getParameter("id");
            if(userid == null || userid.isEmpty())
            {
                dao.addUser(user);
            }
            else
            {
                user.setId(Integer.parseInt(userid));
                dao.updateUser(user);
            }
            RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
            request.setAttribute("users", dao.getAllUsers());
            view.forward(request, response);
    }
}
