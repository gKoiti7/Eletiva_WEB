package controller;

import dao.CursoDao;
import model.Curso;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Cursos", urlPatterns = {"/CursoController"})
public class CursoController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/curso.jsp";
    private static String LIST_CURSO = "/listCurso.jsp";
    private CursoDao dao;

    public CursoController() {
        super();
        dao = new CursoDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String forward="";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")){
            int userId = Integer.parseInt(request.getParameter("id"));
            dao.deleteUser(userId);
            forward = LIST_CURSO;
            request.setAttribute("cursos", dao.getAllUsers());    
        } else if (action.equalsIgnoreCase("edit")){
            forward = INSERT_OR_EDIT;
            int userId = Integer.parseInt(request.getParameter("id"));
            Curso user = dao.getUserById(userId);
            request.setAttribute("cursos", user);
        } else if (action.equalsIgnoreCase("listUser")){
            forward = LIST_CURSO;
            request.setAttribute("cursos", dao.getAllUsers());
        } else {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Curso user = new Curso();
        user.setNome(request.getParameter("nome"));
        user.setPeriodicidade(request.getParameter("periodicidade"));
        user.setDescricao(request.getParameter("descricao"));
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
        RequestDispatcher view = request.getRequestDispatcher(LIST_CURSO);
        request.setAttribute("cursos", dao.getAllUsers());
        view.forward(request, response);
    }
}