package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numerosList;

    public SomaNumeros() {

        this.numerosList = new ArrayList<>();
    }

    public List<Integer> getNumerosList() {

        return numerosList;
    }

    public void adicionarNumero(int numero) {
        numerosList.add(numero);
    }

    public int calcularSoma() {
        int totalSoma = 0;
        for (int t : numerosList) {
            totalSoma += t;
        }
        return totalSoma;
    }

    public int encontraMaiorNumero() {
        int numeroMaior = 0;
        if (!numerosList.isEmpty()) {
            for (int numero : numerosList) {
                if (numero > numeroMaior) {
                    numeroMaior = numero;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
        return numeroMaior;
    }

    public int encontraMenorNumero() {
        int numeroMenor = Integer.MAX_VALUE;
        if (!numerosList.isEmpty()) {
            for (int numero : numerosList) {
                if (numero <= numeroMenor) {
                    numeroMenor = numero;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
        return numeroMenor;
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia.");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(-7);
        System.out.println("O valor total é: " + somaNumeros.calcularSoma());
        System.out.println("O maior número é: " + somaNumeros.encontraMaiorNumero());
        System.out.println("O menor número é: " + somaNumeros.encontraMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
