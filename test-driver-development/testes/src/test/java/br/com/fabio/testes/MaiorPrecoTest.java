package br.com.fabio.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.fabio.carrinhoDeCompra.CarrinhoDeCompras;
import br.com.fabio.carrinhoDeCompra.Item;
import br.com.fabio.carrinhoDeCompra.MaiorPreco;

public class MaiorPrecoTest {
	
	private CarrinhoDeCompras carrinho;
	@BeforeEach
	public void inicializa() {
		this.carrinho = new CarrinhoDeCompras();
	}

	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		MaiorPreco algoritmo = new MaiorPreco();
		double valor = algoritmo.encontra(carrinho);
		assertEquals(0.0, valor, 0.0001);
	}

	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		MaiorPreco algoritmo = new MaiorPreco();
		double valor = algoritmo.encontra(carrinho);
		assertEquals(900.0, valor, 0.0001);
	}

	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		carrinho.adiciona(new Item("Fogão", 1, 1500.0));
		carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));
		MaiorPreco algoritmo = new MaiorPreco();
		double valor = algoritmo.encontra(carrinho);
		assertEquals(1500.0, valor, 0.0001);
	}

}
