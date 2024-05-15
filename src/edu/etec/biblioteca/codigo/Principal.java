package edu.etec.biblioteca.codigo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Giovanni", 1,"DS");
        System.out.println(pessoa1.nome);
        System.out.println(pessoa1.registro);
        System.out.println(pessoa1.curso);
    }
}