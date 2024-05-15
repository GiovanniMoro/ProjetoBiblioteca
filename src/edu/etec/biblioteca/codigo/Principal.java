package edu.etec.biblioteca.codigo;
public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Giovanni", 1,"DS");
        pessoa1.setNome("Marcio");
        System.out.println(pessoa1.getNome());
    }
}