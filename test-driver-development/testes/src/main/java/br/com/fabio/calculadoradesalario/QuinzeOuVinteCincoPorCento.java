package br.com.fabio.calculadoradesalario;

public class QuinzeOuVinteCincoPorCento extends RegraDeCalculo {
	public double calcula(Funcionario funcionario) {
		if(funcionario.getSalario() < 2500) {
			return funcionario.getSalario() * 0.85;
		}
		return funcionario.getSalario() * 0.75;
	}

	@Override
	protected int limite() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double porcentagemAcimaDoLimite() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double porcentagemBase() {
		// TODO Auto-generated method stub
		return 0;
	}
}