package edu.etec.biblioteca.codigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Operacoes {

    public static void Livro(Livros livro) {
        String sql = "INSERT INTO tabelalivros (id, titulo, autor, isbn, registro) VALUES (?, ?, ?, ?, ?)";
        try (Connection conexao = Conexao.conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, livro.getId());
            pstmt.setString(2, livro.getTitulo());
            pstmt.setString(3, livro.getAutor());
            pstmt.setInt(4, livro.getIsnb());
            pstmt.setInt(5, livro.getRegistro());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
