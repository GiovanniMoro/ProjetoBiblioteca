package edu.etec.biblioteca.codigo;

public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int registro;
    protected String curso;

    //Metodo construtor - serve para definir o que precisa ser passado ao instanciar
    public Pessoa(String Nome, int Registro, String Curso){
        this.nome = Nome;
        this.registro = Registro;
        this.curso = Curso;
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

    public void imprimirTudo(){
        System.out.println("Nome:" + nome);
        System.out.println("Registro:" + registro);
        System.out.println("Curso:" + curso);
    }
}
