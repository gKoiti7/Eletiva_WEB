package dao;

import model.Disciplina;
import util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaDao {

    private Connection connection;

    public DisciplinaDao() {
        connection = DbUtil.getConnection();
    }

    public void addUser(Disciplina user) {
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

    public void deleteUser(int userId) {
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

    public void updateUser(Disciplina user) {
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

    public List<Disciplina> getAllUsers() {
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
