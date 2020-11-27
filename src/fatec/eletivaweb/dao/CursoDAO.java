package fatec.eletivaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fatec.eletivaweb.connection.DbUtil;
import fatec.eletivaweb.models.Curso;


public class CursoDAO implements DAO<Curso> {

	private Connection connection;
	
	public CursoDAO() {
		connection = DbUtil.getConnection();
	}
	
	@Override
	public void create(Curso user) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into curso(nome, periodicidade, descricao) values (?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getPeriodicidade());
            preparedStatement.setString(3, user.getDescricao());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public List<Curso> read() {
		List<Curso> listaDeUsuario = new ArrayList<Curso>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from curso");
            while (rs.next()) {
                Curso user = new Curso();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setPeriodicidade(rs.getString("periodicidade"));
                user.setDescricao(rs.getString("descricao"));
                listaDeUsuario.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeUsuario;
	}

	@Override
	public void update(Curso user) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update curso set nome=?, periodicidade=?, descricao=?" +
                            "where id=?");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getPeriodicidade());
            preparedStatement.setString(3, user.getDescricao());
            preparedStatement.setInt(4, user.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void delete(int userId) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from curso where id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public Curso getUserById(int userId) {
		Curso user = new Curso();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from curso where id=?");
            preparedStatement.setInt(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setPeriodicidade(rs.getString("periodicidade"));
                user.setDescricao(rs.getString("descricao"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
	}

	
}
