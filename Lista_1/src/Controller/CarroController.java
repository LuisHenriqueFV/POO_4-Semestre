package Controller;

import Model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {
        Carro carro1 = new Carro(1, "Toyota", "Corolla", 2022);
        Carro carro2 = new Carro(2, "Ford", "Mustang", 2021);
        Carro carro3 = new Carro();
        Carro carro4 = new Carro();
        Carro carro5 = new Carro(5, "Tesla");
        Carro carro6 = new Carro(6, "Volkswagen");

        System.out.println("----- Carros Criados -----");
        System.out.println("Carro 1: " + carro1);
        System.out.println("Carro 2: " + carro2);
        System.out.println("Carro 3: " + carro3);
        System.out.println("Carro 4: " + carro4);
        System.out.println("Carro 5: " + carro5);
        System.out.println("Carro 6: " + carro6);

        // Modificando os objetos criados com o construtor padrão
        carro3.setId(3);
        carro3.setMarca("Mercedes-Benz");
        carro3.setModelo("A-Class");
        carro3.setAnoFabricacao(2020);

        carro4.setId(4);
        carro4.setMarca("Porsche");
        carro4.setModelo("Cayenne");
        carro4.setAnoFabricacao(2023);

        System.out.println("\n----- Carro 3 Modificado -----");
        System.out.println("ID: " + carro3.getId());
        System.out.println("Marca: " + carro3.getMarca());
        System.out.println("Modelo: " + carro3.getModelo());
        System.out.println("Ano de Fabricação: " + carro3.getAnoFabricacao());

        System.out.println("\n----- Carro 4 Modificado -----");
        System.out.println("ID: " + carro4.getId());
        System.out.println("Marca: " + carro4.getMarca());
        System.out.println("Modelo: " + carro4.getModelo());
        System.out.println("Ano de Fabricação: " + carro4.getAnoFabricacao());

        // Criando a lista de carros
        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(carro1);
        listaCarros.add(carro2);
        listaCarros.add(carro3);
        listaCarros.add(carro4);
        listaCarros.add(carro5);
        listaCarros.add(carro6);

        System.out.println("\n----- Lista de Carros -----");
        for (Carro carro : listaCarros) {
            System.out.println(carro);
        }

        // Ordenando a lista de carros em ordem decrescente
        listaCarros.sort(Comparator.comparing(Carro::getId).reversed());

        System.out.println("\n----- Lista de Carros (Ordem Decrescente) -----");
        for (Carro carro : listaCarros) {
            System.out.println(carro);
        }

        // Encontrando o carro com ID 3 na lista
        System.out.println("\n----- Carro com ID=3 na Lista -----");
        Carro carroEncontrado = listaCarros.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(carroEncontrado);

        // Criando o mapa de carros
        Map<Integer, Carro> mapaCarros = new HashMap<>();
        mapaCarros.put(carro1.getId(), carro1);
        mapaCarros.put(carro2.getId(), carro2);
        mapaCarros.put(carro3.getId(), carro3);
        mapaCarros.put(carro4.getId(), carro4);
        mapaCarros.put(carro5.getId(), carro5);
        mapaCarros.put(carro6.getId(), carro6);

        System.out.println("\n----- Mapa de Carros -----");
        for (Map.Entry<Integer, Carro> entry : mapaCarros.entrySet()) {
            System.out.println("Chave (ID): " + entry.getKey() + " - Valor (Carro): " + entry.getValue());
        }

        // Buscando carro com ID 3 no mapa
        System.out.println("\n----- Carro com ID=3 no Mapa -----");
        System.out.println(mapaCarros.get(3));
    }
}
