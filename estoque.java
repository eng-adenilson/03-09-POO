package estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
    private String nome;
    private int preco;
    private int quantidade;

    public Item(String nome, int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Quantidade: " + quantidade + ", Preço: R$ " + preco;
    }
}


class Estoque {
    private List<Item> itens;

    public Estoque() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void mostrarEstoque() {
        System.out.println("Itens no estoque:");
        for (Item item : itens) {
            System.out.println(item);
        }
    }
}
