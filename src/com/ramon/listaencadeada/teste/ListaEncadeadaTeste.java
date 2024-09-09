package com.ramon.listaencadeada.teste;

import com.ramon.listaencadeada.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("Ramon");
        lista.adiciona("Rodrigues");
        lista.adiciona("Silva");

        System.out.println(lista);

        lista.removerPorPosicao(3);

        System.out.println(lista);

        lista.adicionarPorPosicao(3, "Amostradinho");

        System.out.println(lista);
    }
}
