package Controller;

import Model.Conta;
import Model.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

public class ContaPoupancaController {
    public static void main(String[] args) {
        // Crie 3 instâncias de ContaPoupanca, insira valores válidos nos atributos dessas instâncias, e imprima esses objetos
        ContaPoupanca contaPoupanca1 = new ContaPoupanca(1000);
        ContaPoupanca contaPoupanca2 = new ContaPoupanca(2000);
        ContaPoupanca contaPoupanca3 = new ContaPoupanca(3000);

        // Imprimindo os saldos individuais
        System.out.println("Saldo Conta Poupança 1: " + contaPoupanca1.getSaldo());
        System.out.println("Saldo Conta Poupança 2: " + contaPoupanca2.getSaldo());
        System.out.println("Saldo Conta Poupança 3: " + contaPoupanca3.getSaldo());

        // Adicionando as instâncias à lista de contas
        List<Conta> contaList = new ArrayList<>();
        contaList.add(contaPoupanca1);
        contaList.add(contaPoupanca2);
        contaList.add(contaPoupanca3);

        // Imprimindo a lista de contas
        System.out.println("Lista de Contas:");
        for (Conta conta : contaList) {
            System.out.println(conta);
        }
    }
}
