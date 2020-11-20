package dao;

import model.Aluno;
import util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlunoDao {

    private Connection connection;

    public AlunoDao() {
        connection = DbUtil.getConnection();
    }

    public void addUser(Aluno user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into aluno(nome, turma) values (?, ?)");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getTurma());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(int userId) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from aluno where id=?");
            // Parameters start with 1
            preparedStatement.setInt(1, userId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(Aluno user) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update aluno set nome=?, turma=?" +
                            "where id=?");
            // Parameters start with 1
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getTurma());
            preparedStatement.setInt(3, user.getId());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Aluno> getAllUsers() {
        List<Aluno> listaDeUsuario = new ArrayList<Aluno>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("select * from aluno");
            while (rs.next()) {
                Aluno user = new Aluno();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setTurma(rs.getString("turma"));
                listaDeUsuario.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listaDeUsuario;
    }

    public Aluno getUserById(int userId) {
        Aluno user = new Aluno();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from aluno where id=?");
            preparedStatement.setInt(1, userId);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setTurma(rs.getString("turma"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
