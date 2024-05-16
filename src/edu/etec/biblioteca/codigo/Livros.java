package edu.etec.biblioteca.codigo;

public class Livros {

    String titulo;
    String autor;
    int isnb;
    int registro;


    public Livros(String titulo, String autor, int isnb, int registro) {
        this.titulo = titulo;
        this.autor = autor;
        this.isnb = isnb;
        this.registro = registro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsnb() {
        return isnb;
    }

    public void setIsnb(int isnb) {
        this.isnb = isnb;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public void imprimirTudo(){
        System.out.println("Titulo:" + titulo);
        System.out.println("Autor:" + autor);
        System.out.println("Isnb:" + isnb);
        System.out.println("REgistro:" + registro);
    }
}
