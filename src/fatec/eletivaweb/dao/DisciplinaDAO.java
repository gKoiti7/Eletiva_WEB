package fatec.eletivaweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fatec.eletivaweb.connection.DbUtil;
import fatec.eletivaweb.models.Disciplina;


public class DisciplinaDAO implements DAO<Disciplina> {

	private Connection connection;

    public DisciplinaDAO() {
        connection = DbUtil.getConnection();
    }
    
	@Override
	public void create(Disciplina user) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into disciplina(nome, carga, ementa) values (?, ?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setInt(2, user.getCargaHoraria());
            preparedStatement.setString(3, user.getEmenta());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public List<Disciplina> read() {
		List<Disciplina> listaDeUsuario = new ArrayList<Disciplina>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from disciplina");
            while (rs.next()) {
                Disciplina user = new Disciplina();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setCargaHoraria(rs.getInt("carga"));
                user.setEmenta(rs.getString("ementa"));
                listaDeUsuario.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeUsuario;
	}

	@Override
	public void update(Disciplina user) {
		try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update disciplina set nome=?, carga=?, ementa=?" +
                            "where id=?");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setInt(2, user.getCargaHoraria());
            preparedStatement.setString(3, user.getEmenta());
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
                    .prepareStatement("delete from disciplina where id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public Disciplina getUserById(int userId) {
		Disciplina user = new Disciplina();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from disciplina where id=?");
            preparedStatement.setInt(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setCargaHoraria(rs.getInt("carga"));
                user.setEmenta(rs.getString("ementa"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
	}

	
}
