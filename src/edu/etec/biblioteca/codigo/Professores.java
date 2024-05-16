package edu.etec.biblioteca.codigo;

public class Professores extends Pessoa{

    float salario;

    //Metodo Construtor
    public Professores(String Nome, int Registro, String Curso, float Salario){
        super(Nome, Registro, Curso);
        this.salario = Salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
