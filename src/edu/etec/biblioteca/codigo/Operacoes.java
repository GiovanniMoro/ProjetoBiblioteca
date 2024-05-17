package edu.etec.biblioteca.codigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Operacoes {

    public static void inserirLivro(Livros livro) {
        String sql = "INSERT INTO tabelalivros (titulo, autor, isbn, registro) VALUES (?, ?, ?, ?)";
        try (Connection conexao = Conexao.conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, livro.getTitulo());
            pstmt.setString(2, livro.getAutor());
            pstmt.setInt(3, livro.getIsnb());
            pstmt.setInt(4, livro.getRegistro());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selecionarLivros(int x) {

        String sql = "SELECT * FROM tabelalivros WHERE id = ?";

        try (Connection conexao = Conexao.conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, x);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("Titulo");
                String autor = rs.getString("Autor");
                int isbn = rs.getInt("Isbn");
                int registro = rs.getInt("Registro");
                System.out.println("ID: " + id + ", Titulo: " + titulo + ", Autor: " + autor + ", Isbn: " + isbn + ",Registro: " + registro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
