package Controller;

import Model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario(1,"Joao", 1.600);
        Funcionario func2 = new Funcionario(2,"Henrique", 2.000);
        Funcionario func3 = new Funcionario(3,"Samuel", 5.000);
        Funcionario func4 = new Funcionario(4, "Joaquim");
        Funcionario func5 = new Funcionario();
        Funcionario func6 = new Funcionario();

        System.out.println("----- toString -----");
        System.out.println(func1.toString());
        System.out.println(func2.toString());
        System.out.println(func3.toString());
        System.out.println(func4.toString());
        System.out.println(func5.toString());
        System.out.println(func6.toString());

        func1.setNome("Rafa");
        func2.setSalario(1.630);
        func3.setSalario(1.250);
        func4.setSalario(1.620);
        func5.setId(5);
        func5.setNome("Jorisclaide");
        func5.setId(6);
        func5.setNome("Maria");

        System.out.println(func1.getId());
        System.out.println(func1.getNome());
        System.out.println(func1.getSalario());

        System.out.println(func2.getId());
        System.out.println(func2.getNome());
        System.out.println(func2.getSalario());


        System.out.println(func3.getId());
        System.out.println(func3.getNome());
        System.out.println(func3.getSalario());

        System.out.println(func4.getId());
        System.out.println(func4.getNome());
        System.out.println(func4.getSalario());

        System.out.println(func5.getId());
        System.out.println(func5.getNome());


        System.out.println(func6.getId());
        System.out.println(func6.getNome());

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(func1);
        funcionarios.add(func2);
        funcionarios.add(func3);
        funcionarios.add(func4);
        funcionarios.add(func5);
        funcionarios.add(func6);

        System.out.println("Lista");
        System.out.println(funcionarios);

        System.out.println("Lista Decrescente");
        funcionarios.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println(funcionarios);

        System.out.println("Lista Objeto id=3");
        Funcionario funcFind = funcionarios.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(funcFind);

        Map<Integer, Funcionario> funcionariosMap = new HashMap<>();
        funcionariosMap.put(func1.getId(), func1);
        funcionariosMap.put(func2.getId(), func2);
        funcionariosMap.put(func3.getId(), func3);
        funcionariosMap.put(func4.getId(), func4);
        funcionariosMap.put(func5.getId(), func5);
        funcionariosMap.put(func6.getId(), func6);

        System.out.println("----Map ----");
        System.out.println(funcionariosMap);

        System.out.println("----Map não permite a ordenação ----");

        System.out.println("-----Map Objeto id=3-----");
        System.out.println(funcionariosMap.get(3));
    }
}