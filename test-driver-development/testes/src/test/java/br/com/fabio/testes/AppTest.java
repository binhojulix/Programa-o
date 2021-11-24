package br.com.fabio.testes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void ordemDecrescente() {
    	CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));

        MaiorEMenor algoritimo = new MaiorEMenor();
        algoritimo.encontra(carrinho);

        assertEquals("jogo de prato", algoritimo.getMenor().getName());
        assertEquals("Geladeira", algoritimo.getMaior().getName());
    }
}
