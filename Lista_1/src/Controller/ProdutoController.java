package Controller;

import Model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "Livro", "Aventura", 50.00, 20);
        Produto produto2 = new Produto(2, "Copo", "Vidro", 15.00, 50);
        Produto produto3 = new Produto(3, "Tesoura", 5.00);
        Produto produto4 = new Produto(4, "Cola", 3.00);
        Produto produto5 = new Produto();
        Produto produto6 = new Produto();

        System.out.println("----- toString -----");
        System.out.println(produto1.toString());
        System.out.println(produto2.toString());
        System.out.println(produto3.toString());
        System.out.println(produto4.toString());
        System.out.println(produto5.toString());
        System.out.println(produto6.toString());

        produto1.setEstoque(25);
        produto2.setDescricao("Plástico");
        produto3.setDescricao("Pequena");
        produto4.setDescricao("Super Cola");
        produto5.setId(5);
        produto5.setNome("Régua");
        produto5.setDescricao("30 cm");
        produto5.setValor(2.00);
        produto5.setEstoque(100);
        produto6.setId(6);
        produto6.setNome("Mochila");
        produto6.setDescricao("Escolar");
        produto6.setValor(100.00);
        produto6.setEstoque(10);

        System.out.println("----- getters-produto1 -----");
        System.out.println(produto1.getId());
        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());

        System.out.println("----- getters-produto2 -----");
        System.out.println(produto2.getId());
        System.out.println(produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());

        System.out.println("----- getters-produto3 -----");
        System.out.println(produto3.getId());
        System.out.println(produto3.getNome());
        System.out.println(produto3.getDescricao());
        System.out.println(produto3.getValor());

        System.out.println("----- getters-produto4 -----");
        System.out.println(produto4.getId());
        System.out.println(produto4.getNome());
        System.out.println(produto4.getDescricao());
        System.out.println(produto4.getValor());

        System.out.println("----- getters-produto5 -----");
        System.out.println(produto5.getId());
        System.out.println(produto5.getNome());
        System.out.println(produto5.getDescricao());
        System.out.println(produto5.getValor());
        System.out.println(produto5.getEstoque());

        System.out.println("----- getters-produto6 -----");
        System.out.println(produto6.getId());
        System.out.println(produto6.getNome());
        System.out.println(produto6.getDescricao());
        System.out.println(produto6.getValor());
        System.out.println(produto6.getEstoque());

        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);
        listaProdutos.add(produto5);
        listaProdutos.add(produto6);

        System.out.println("-----Lista de Produtos-----");
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        System.out.println("-----Lista de Produtos Decrescente-----");
        listaProdutos.sort(Comparator.comparing(Produto::getId).reversed());
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        System.out.println("-----Produto com id=3 na Lista-----");
        Produto produtoEncontrado = listaProdutos.stream().filter(p -> p.getId() == 3).findAny().orElse(null);
        System.out.println(produtoEncontrado);

        Map<Integer, Produto> mapaProdutos = new HashMap<>();
        mapaProdutos.put(produto1.getId(), produto1);
        mapaProdutos.put(produto2.getId(), produto2);
        mapaProdutos.put(produto3.getId(), produto3);
        mapaProdutos.put(produto4.getId(), produto4);
        mapaProdutos.put(produto5.getId(), produto5);
        mapaProdutos.put(produto6.getId(), produto6);

        System.out.println("----Mapa de Produtos----");
        for (Map.Entry<Integer, Produto> entrada : mapaProdutos.entrySet()) {
            System.out.println(entrada.getValue());
        }

        System.out.println("----Map não permite a ordenação ----");

        System.out.println("-----Produto com id=3 no Mapa-----");
        System.out.println(mapaProdutos.get(3));
    }
}
