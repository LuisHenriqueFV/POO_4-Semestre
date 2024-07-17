package Objetivo_1.Controller;

import Objetivo_1.Model.Aluno;

public class AlunoController {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(); //construtor padrão
        Aluno aluno2 = new Aluno(); //construtor padrão
        Aluno aluno3 = new Aluno(1, 324345642, "Diogo", "Fonseca", "diogo@email.com" ); //construtor parametrizado com todos os atributos
        Aluno aluno4 = new Aluno(2, 232455123, "Tiago", "Petry", "tiago@email.com" ); //construtor parametrizado com todos os atributos
        Aluno aluno5 = new Aluno("Rafael", "Castro"); //construtor parametrizado com apenas dois atributos
        Aluno aluno6 = new Aluno("Emanuel", "Gonçalves"); //construtor parametrizado com apenas dois atributos

        //1.a)
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);
        System.out.println(aluno6);
        //1.b)
        aluno1.setId(10);
        aluno1.setCpf(35123);
        aluno1.setNome("Carlos");
        aluno1.setSobrenome("Nobre");
        aluno1.setEmail("carlos@email.com");

        aluno2.setId(20);
        aluno2.setCpf(354233);
        aluno2.setNome("Joao");
        aluno2.setSobrenome("Silva");
        aluno2.setEmail("joao@email.com");

        //Imprimir os atributos das instâncias modificadas usando getters
        System.out.println("Aluno1 \nID: " + aluno1.getId() + "\n" + "CPF: " + aluno1.getCpf() +"\n"+ "NOME: " + aluno1.getNome()+"\n" + "SOBRENOME: " + aluno1.getSobrenome()+"\n" + "E-MAIL: " + aluno1.getEmail());
        System.out.println("-----------------------------------");
        System.out.println("Aluno2 \nID: " + aluno2.getId() + "\n" + "CPF: " + aluno2.getCpf() +"\n"+ "NOME: " + aluno2.getNome()+"\n" + "SOBRENOME: " + aluno2.getSobrenome()+"\n" + "E-MAIL: " + aluno2.getEmail());

    }
}
