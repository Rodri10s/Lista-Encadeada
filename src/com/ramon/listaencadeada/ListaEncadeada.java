package com.ramon.listaencadeada;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);

        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public void adicionarPorPosicao(int posicao, String informacao) {

        No anterior = this.inicio;

        if (posicao > this.tamanho || posicao < 0) {

            throw new IllegalArgumentException("posição fora do intervalo válido");

        }

        for (int cont = 1; cont < posicao - 1; cont++) {

            anterior = anterior.getProximo();

        }

        No nova = new No(informacao, anterior.getProximo());
        anterior.setProximo(nova);
        this.tamanho++;
    }

    public void removerInicio() {

        No aux = this.inicio;

        this.inicio = aux.getProximo();

        aux.setProximo(null);

        this.tamanho--;

    }

    public void removerNoFinal() {
        No<T> anterior = this.inicio;

        if (this.tamanho == 1) {
            removerInicio();
        } else {
            for (int i = 1; i < this.tamanho; i++) {
                anterior = anterior.getProximo();
            }
            anterior.setElemento(null);
            this.ultimo = anterior;
        }
        this.tamanho--;
    }

    public void removerPorPosicao(int posicao) {
        No<T> anterior = this.inicio;

        if (posicao == 1) {
            removerInicio();
        } else {
            for (int i = 1; i < posicao - 1; i++) {
                anterior = anterior.getProximo();
            }
            anterior.setProximo(anterior.getProximo().getProximo());
        }

        this.tamanho--;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        return "ListaEncadeada [inicio=" + inicio + "]";
    }

}
