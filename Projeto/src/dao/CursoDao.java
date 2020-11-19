package dao;

import model.Curso;
import util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CursoDao {

    private Connection connection;

    public CursoDao() {
        connection = DbUtil.getConnection();
    }

    public void addUser(Curso user) {
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

    public void deleteUser(int userId) {
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

    public void updateUser(Curso user) {
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

    public List<Curso> getAllUsers() {
        List<Curso> listaDeUsuario = new ArrayList<Curso>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from curso");
            while (rs.next()) {
                Curso user = new Curso();
                user.setId(rs.getInt("userid"));
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

