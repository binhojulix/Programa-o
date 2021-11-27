package br.com.fabio.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.fabio.calculadora.Calculadora;

public class CalculadoraTest {

	@Test
	public void deveSomarDoisNumerosPositivos() {
		assertEquals(4, new Calculadora().soma(2,2));
	}
	
	@Test
	public void deveSomarPositivoComNegativo() {
		assertEquals(4, new Calculadora().soma(6,-2));
	}
	
	@Test
	public void deveSomarNegativoComPositivo() {
		assertEquals(-4, new Calculadora().soma(-6,2));
	}
	
	@Test
	public void deveSomarDoisNumerosNegativos() {
		assertEquals(-4, new Calculadora().soma(-2,-2));
	}
	
	@Test
	public void deveSomarComZero() {
		assertEquals(4, new Calculadora().soma(0,4));
		assertEquals(4, new Calculadora().soma(4,0));
	}
}
