package edu.etec.biblioteca.codigo;

public class Professores extends Pessoa{

    float salario;

    //Metodo Construtor
    public Professores(String parametroNome, int parametroRegistro, String parametroCurso, float parametroSalario){
        super(parametroNome, parametroRegistro, parametroCurso);
        this.salario = parametroSalario;
    }
}
