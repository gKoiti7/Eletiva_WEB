package dao;

import model.Professor;
import util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDao {

    private Connection connection;

    public ProfessorDao() {
        connection = DbUtil.getConnection();
    }

    public void addUser(Professor user) {
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

    public void deleteUser(int userId) {
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

    public void updateUser(Professor user) {
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

    public List<Professor> getAllUsers() {
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

