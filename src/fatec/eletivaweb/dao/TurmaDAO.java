package fatec.eletivaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fatec.eletivaweb.connection.DbUtil;
import fatec.eletivaweb.models.Turma;

public class TurmaDAO implements DAO<Turma> {

	private Connection connection;

    public TurmaDAO() {
        connection = DbUtil.getConnection();
    }

	@Override
	public void create(Turma user) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into turma(nome, descricao) values (?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getDescricao());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public List<Turma> read() {
		List<Turma> listaDeUsuario = new ArrayList<Turma>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from turma");
            while (rs.next()) {
                Turma user = new Turma();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setDescricao(rs.getString("descricao"));
                listaDeUsuario.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeUsuario;
	}

	@Override
	public void update(Turma user) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update turma set nome=?, descricao=?" +
                            "where id=?");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getDescricao());
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
                    .prepareStatement("delete from turma where id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public Turma getUserById(int userId) {
		Turma user = new Turma();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from turma where id=?");
            preparedStatement.setInt(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setDescricao(rs.getString("descricao"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
	}

}
