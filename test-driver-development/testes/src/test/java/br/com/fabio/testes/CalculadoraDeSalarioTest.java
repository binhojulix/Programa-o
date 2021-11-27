package br.com.fabio.testes;

import org.junit.jupiter.api.Test;

import br.com.fabio.calculadoradesalario.CalculadoraDeSalario;
import br.com.fabio.calculadoradesalario.Cargo;
import br.com.fabio.calculadoradesalario.Funcionario;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraDeSalarioTest {

	@Test
	public void
	deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario
				("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(1500.0 * 0.9, salario, 0.00001);
	}

	
	@Test
	public void
	deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario
				("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(4000.0 * 0.8, salario, 0.00001);
	}


}
