<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>Cursos Cadastrados</title>
    </head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>Id</th>
                <th>Nome</th>
                <th>Periodicidade</th>
                <th>Descri��o</th>
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${cursos}" var="curso">
                <tr>
                    <td><c:out value="${curso.id}" /></td>
                    <td><c:out value="${curso.nome}" /></td>
                    <td><c:out value="${curso.periodicidade}" /></td>
                    <td><c:out value="${curso.descricao}" /></td>
                    <td><a href="CursoController?action=edit&id=<c:out value="${curso.id}"/>">Update</a></td>
                    <td><a href="CursoController?action=delete&id=<c:out value="${curso.id}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p><a href="CursoController?action=insert">Novo Curso</a></p>
</body>
</html>