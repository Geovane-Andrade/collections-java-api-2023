package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
        System.out.println("Item:" + nome + " adicionado ao carrinho!");
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!listaItens.isEmpty()) {
            for (Item t : listaItens) {
                if (t.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(t);
                }
            }
            listaItens.removeAll(itensParaRemover);
            System.out.println("Itens removidos!" + itensParaRemover);
        }else {
            System.out.println("A lista está vazia.");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0D;
        if (!listaItens.isEmpty()){
            for (Item t : listaItens) {
                double valorDoItem = t.getPreco() * t.getQuantidade();
                valorTotal += valorDoItem;
            }
        }else {
            throw new RuntimeException("A lista está vazia.");
        }
        return valorTotal;
    }

    public void exibirItens() {
        if(!listaItens.isEmpty()){
            System.out.println("Segue a lista com todos os itens: " + this.listaItens);
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Arroz", 4.99d, 3);
        carrinhoDeCompras.adicionarItem("Feijão", 7.99d, 2);
        carrinhoDeCompras.adicionarItem("Feijão", 7.99d, 2);
        carrinhoDeCompras.adicionarItem("Cuscuz", 1.79d, 2);

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Arroz");
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total em compras foi: " + carrinhoDeCompras.calcularValorTotal());
    }
}
