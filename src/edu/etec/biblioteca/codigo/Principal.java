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

    }
}