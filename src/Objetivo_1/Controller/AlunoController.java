package Objetivo_1.Controller;

import Objetivo_1.Model.Aluno;

public class AlunoController {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno(1, 324345642, "Nome1", "Sobrenome1", "NomeSobrenome1@email.com" );
        Aluno aluno4 = new Aluno(2, 232455123, "Nome2", "Sobrenome2", "NomeSobrenome2@email.com" );
        Aluno aluno5 = new Aluno("Nome3", "Sobrenome3");
        Aluno aluno6 = new Aluno("Nome4", "Sobrenome4");

//1.a)
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);
        System.out.println(aluno6);
    }
}
