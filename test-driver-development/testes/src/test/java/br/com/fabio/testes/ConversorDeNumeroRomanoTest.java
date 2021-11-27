package br.com.fabio.testes;
import org.junit.jupiter.api.Test;

import br.com.fabio.numeroromano.ConversorDeNumeroRomano;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorDeNumeroRomanoTest {

	@Test
	public void deveEntenderOSimboloI() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("I");
		assertEquals(1, numero);
	}

	@Test
	public void deveEntenderDoisSimbolosComoII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("II");
		assertEquals(2, numero);
	}

	@Test
	public void deveEntenderQuatroSimbolosDoisADoisComoXXII() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXII");
		assertEquals(22, numero);
	}

	@Test
	public void deveEntenderNumerosComoIX() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("IX");
		assertEquals(9, numero);
	}

	@Test
	public void deveEntenderNumerosComplexosComoXXIV() {
		ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
		int numero = romano.converte("XXIV");
		assertEquals(24, numero);
	}

}
