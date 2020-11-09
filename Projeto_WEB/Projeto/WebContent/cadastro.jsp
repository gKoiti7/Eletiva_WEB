<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    
	import="java.sql.*"

%>

<%@ page language="java" import="Conexao_BD.conexao" %>

<%
	String nome = request.getParameter("nome");
	String rg = request.getParameter("rg");
	String cpf = request.getParameter("cpf");
	String email = request.getParameter("e-mail");
	String nascimento = request.getParameter("nascimento");
	String curso = request.getParameter("aval");
	
	try{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO cadastro(nome, rg, cpf, email, nascimento, curso) VALUE(?, ?, ?, ?, ?, ?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.setString(2, rg);
		stmt.setString(3, cpf);
		stmt.setString(4, email);
		stmt.setString(5, nascimento);
		stmt.setString(6, curso);
		stmt.execute();
		stmt.close();
		con.close();
		out.print("Deu certo!");
	}catch(Exception e){
		out.print("Deu erro! " + e);
	}
%>