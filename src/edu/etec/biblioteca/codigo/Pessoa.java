package edu.etec.biblioteca.codigo;

public class Pessoa {
    //Atributos
    String nome;
    int registro;
    String curso;
    boolean cadastro;

    //Metodo construtor - serve para definir o que precisa ser passado ao instanciar
    public Pessoa(String parametroNome, int parametroRegistro, String parametroCurso){
        this.nome = parametroNome;
        this.registro = parametroRegistro;
        this.curso = parametroCurso;
    }



    //Getters (pegar)

    public String getNome() {
        return nome;
    }

    public int getRegistro() {
        return registro;
    }

    public String getCurso() {
        return curso;
    }



    //Setters (inserir)

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
