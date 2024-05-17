package edu.etec.biblioteca.codigo;
public class Principal {
    public static void main(String[] args) {

        Professores professor1 = new Professores("James", 1, "DS", 10_000.00f);
        Professores professor2 = new Professores("Nadia", 2, "DS", 10_000.00f);
        Professores professor3 = new Professores("Leandro", 3, "DS", 10_000.00f);

        Alunos aluno1 =  new Alunos("Giovanni", 1, "DS");
        Alunos aluno2 =  new Alunos("Henrique", 2, "DS");
        Alunos aluno3 =  new Alunos("Herbert", 3, "DS");
        Alunos aluno4 =  new Alunos("Gabriel", 4, "DS");


        aluno1.imprimirTudo();
        System.out.println();

        aluno2.imprimirTudo();
        System.out.println();

        aluno3.imprimirTudo();
        System.out.println();

        aluno4.imprimirTudo();
        System.out.println();

        Livros livro1 = new Livros("Dom Casmurro", "José de Alencar", 34256);
        Livros livro2 = new Livros("O pequeno principe", "Pedro", 34256);
        Livros livro3 = new Livros("Guardiões", "Arthur", 42536);

        //instancia do insert
        Operacoes op = new Operacoes();
        op.inserirLivro(livro2);

        op.selecionarLivros(2);

        //op.selecionarLivrosString();
    }
}