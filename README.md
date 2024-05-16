//¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|
//	0.	IMPORTAÇÕES										|
//______________________________________________________|

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|
//	1.	CRIAÇÃO DA CLASSE								|
//______________________________________________________|      

class Pessoa {
	
//¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|
//	2.	CRIAÇÃO DOS ATRIBUTOS							|
//______________________________________________________|  
	
	protected int atributoId;
    protected String atributoNome;
    protected String atributoAtivo;
    protected int atributoIdade;
    
//¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯|
//	3.	CRIAÇÃO DO MÉTODO CONSTRUTOR					|
//______________________________________________________| 
    
    public Pessoa(int parametroId, String parametroNome, String parametroAtivo, int parametroIdade) {
        this.atributoId = parametroId;
        this.atributoNome = parametroNome;
        this.atributoAtivo = parametroAtivo;
        this.atributoIdade = parametroIdade;
    }

    // Métodos getters e setters
    public int getId() {
        return atributoId;
    }

    public void setId(int id) {
        this.atributoId = id;
    }

    public String getNome() {
        return atributoNome;
    }

    public void setNome(String nome) {
        this.atributoNome = nome;
    }

    public String getAtivo() {
        return atributoAtivo;
    }

    public void setAtivo(String ativo) {
        this.atributoAtivo = ativo;
    }

    public int getIdade() {
        return atributoIdade;
    }

    public void setIdade(int idade) {
        this.atributoIdade = idade;
    }
}

// Classe Aluno que herda de Pessoa
class Aluno extends Pessoa {
    private int idCurso;

    public Aluno(int id, String nome, String ativo, int idade, int idCurso) {
        super(id, nome, ativo, idade);
        this.idCurso = idCurso;
    }

    // Método getter e setter para idCurso
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
}

// Classe Professor que herda de Pessoa
class Professor extends Pessoa {
    private int idCurso;

    public Professor(int id, String nome, String ativo, int idade, int idCurso) {
        super(id, nome, ativo, idade);
        this.idCurso = idCurso;
    }

    // Método getter e setter para idCurso
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
}

// Classe Curso
class Curso {
    private String nome;
    private String sigla;
    private int ano;

    public Curso(String nome, String sigla, int ano) {
        this.nome = nome;
        this.sigla = sigla;
        this.ano = ano;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

// Classe de conexão com o banco de dados
class ConexaoBanco {
    private static final String URL = "jdbc:mysql://localhost:3306/meubanco";
    private static final String USUARIO = "root";
    private static final String SENHA = "1234567";

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, SENHA);
    }

    public static void fechar(Connection conexao) {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

// Classe responsável por operações de inserção e seleção de alunos, professores e cursos
class OperacoesBanco {
    public static void inserirAluno(Aluno aluno) {
        String sql = "INSERT INTO tabelaalunos (id, nome, ativo, idade, tabelacursos_id) VALUES (?, ?, ?, ?, ?)";
        try (Connection conexao = ConexaoBanco.conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, aluno.getId());
            pstmt.setString(2, aluno.getNome());
            pstmt.setString(3, aluno.getAtivo());
            pstmt.setInt(4, aluno.getIdade());
            pstmt.setInt(5, aluno.getIdCurso());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserirProfessor(Professor professor) {
        String sql = "INSERT INTO tabelaprofessores (id, nome, ativo, idade, tabelacursos_id) VALUES (?, ?, ?, ?, ?)";
        try (Connection conexao = ConexaoBanco.conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, professor.getId());
            pstmt.setString(2, professor.getNome());
            pstmt.setString(3, professor.getAtivo());
            pstmt.setInt(4, professor.getIdade());
            pstmt.setInt(5, professor.getIdCurso());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserirCurso(Curso curso) {
        String sql = "INSERT INTO tabelacursos (nome, sigla, ano) VALUES (?, ?, ?)";
        try (Connection conexao = ConexaoBanco.conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, curso.getNome());
            pstmt.setString(2, curso.getSigla());
            pstmt.setInt(3, curso.getAno());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void selecionarAlunosPorCurso(int idCurso) {
        String sql = "SELECT * FROM tabelaalunos WHERE tabelacursos_id = ?";
        try (Connection conexao = ConexaoBanco.conectar();
             PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, idCurso);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String ativo = rs.getString("ativo");
                int idade = rs.getInt("idade");
                System.out.println("ID: " + id + ", Nome: " + nome + ", Ativo: " + ativo + ", Idade: " + idade);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

public class Principal {
    public static void main(String[] args) {
        // Exemplo de uso:
        // Criando um novo curso
        Curso curso = new Curso("Ciência da Computação", "CC", 2024);
        OperacoesBanco.inserirCurso(curso);

        // Criando um novo professor associado ao curso
        Professor professor = new Professor(5, "Ciclano", "Sim", 30, 1); // Supondo que o id do curso seja 1
        OperacoesBanco.inserirProfessor(professor);
        

        // Selecionando alunos de um curso específico
        OperacoesBanco.selecionarAlunosPorCurso(1); // Supondo que queremos os alunos do curso com id 1
    }
}
