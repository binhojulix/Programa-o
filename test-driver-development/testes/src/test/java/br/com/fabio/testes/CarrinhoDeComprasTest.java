package br.com.fabio.testes;

import org.junit.jupiter.api.Test;

import br.com.fabio.carrinhoDeCompra.CarrinhoDeCompras;
import br.com.fabio.carrinhoDeCompra.Item;
import br.com.fabio.carrinhoDeCompra.MaiorPreco;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;


/**
 * Unit test for simple App.
 */
class CarrinhoDeComprasTest {
	/**
	 * Rigorous Test.
	 */
	private CarrinhoDeCompras carrinho;

	@BeforeEach
	public void inicializa() {
		this.carrinho = new CarrinhoDeCompras();
	}

	@Test
	public void deveRetornarZeroSeCarrinhoVazio() {
		assertEquals(0.0, carrinho.maiorValor(), 0.0001);
	}
	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		assertEquals(900.0, carrinho.maiorValor(), 0.0001);
	}
	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
		carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		carrinho.adiciona(new Item("Fogão", 1, 1500.0));
		carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));

		assertEquals(1500.0, carrinho.maiorValor(), 0.0001);
	}

	@Test
	public void deveAdicionarItens() {
		// garante que o carrinho está vazio
		assertEquals(0, carrinho.getItens().size());
		Item item = new Item("Geladeira", 1, 900.0);
		carrinho.adiciona(item);
		assertEquals(1, carrinho.getItens().size());
		assertEquals(item, carrinho.getItens().get(0));
	}

}
