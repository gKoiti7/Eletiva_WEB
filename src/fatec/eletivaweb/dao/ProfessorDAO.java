package fatec.eletivaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fatec.eletivaweb.connection.DbUtil;
import fatec.eletivaweb.models.Professor;

public class ProfessorDAO implements DAO<Professor> {

	private Connection connection;
	
	public ProfessorDAO() {
        connection = DbUtil.getConnection();
    }
	
	@Override
	public void create(Professor user) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into professor(nome, titulacao) values (?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getTitulacao());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public List<Professor> read() {
		List<Professor> listaDeUsuario = new ArrayList<Professor>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from professor");
            while (rs.next()) {
                Professor user = new Professor();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setTitulacao(rs.getString("titulacao"));
                listaDeUsuario.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeUsuario;
	}

	@Override
	public void update(Professor user) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update professor set nome=?, titulacao=?" +
                            "where id=?");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getTitulacao());
            preparedStatement.setInt(3, user.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public void delete(int userId) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from professor where id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public Professor getUserById(int userId) {
		Professor user = new Professor();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from professor where id=?");
            preparedStatement.setInt(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setTitulacao(rs.getString("titulacao"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
	}

	

}
