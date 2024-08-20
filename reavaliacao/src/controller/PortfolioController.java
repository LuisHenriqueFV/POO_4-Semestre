package controller;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class PortfolioController {
    public static void main(String[] args) {
        // --------------------Questão B--------------------
        // Criação de duas instâncias da classe Casa
        Casa casa1 = new Casa(
                "Rua", "Flores da Cunha", 789, "Casa A",
                "Jardim América", "97050-100", "Santa Maria",
                250.0, 750000.0, 700000.0, 350.0
        );

        Casa casa2 = new Casa(
                "Travessa", "Castro Alves", 321, "Casa B",
                "São José", "97500-200", "Uruguaiana",
                180.0, 580000.0, 540000.0, 280.0
        );

        // Criação de duas instâncias da classe Apartamento
        Apartamento apto1 = new Apartamento(
                "Avenida", "Independência", 567, "Apto 302",
                "Moinhos de Vento", "90035-200", "Porto Alegre",
                85.0, 320000.0, 310000.0, "Edifício Bela Vista"
        );

        Apartamento apto2 = new Apartamento(
                "Rua", "General Câmara", 123, "Apto 104",
                "Centro Histórico", "90010-300", "Porto Alegre",
                95.0, 410000.0, 400000.0, "Condomínio Imperial"
        );

        // Criação de uma instância da classe UnidadePelotas
        UnidadePelotas unidadePelotas = new UnidadePelotas(
                "Imobiliária Litoral", "47.123.456/0001-12",
                1200000.0, 4.5
        );

        // Criação de uma instância da classe UnidadePortoAlegre
        UnidadePortoAlegre unidadePortoAlegre = new UnidadePortoAlegre(
                "Imobiliária Capital", "87.654.321/0001-34",
                2500000.0, 5.8
        );

        // --------------------Questão C--------------------
        // Exibindo as instâncias criadas
        System.out.println("Casas:");
        System.out.println(casa1);
        System.out.println(casa2);

        System.out.println("\nApartamentos:");
        System.out.println(apto1);
        System.out.println(apto2);

        System.out.println("\nUnidades da Imobiliária:");
        System.out.println(unidadePelotas);
        System.out.println(unidadePortoAlegre);

        // --------------------Questão D--------------------
        // Criando uma única coleção do tipo List<Portfolio>
        List<Portfolio> listaPortfolio = new ArrayList<>();

        // Adicionando os objetos na coleção
        listaPortfolio.add(casa1);
        listaPortfolio.add(casa2);
        listaPortfolio.add(apto1);
        listaPortfolio.add(apto2);
        listaPortfolio.add(unidadePelotas);
        listaPortfolio.add(unidadePortoAlegre);

        // Imprimindo a coleção
        System.out.println("\nColeção de Portfolio:");
        for (Portfolio item : listaPortfolio) {
            System.out.println(item);
        }
    }
}

