package br.com.fabio.testes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Produto> produtos = new ArrayList<>();

	public List<Produto> getProdutos() {
		// TODO Auto-generated method stub
		return produtos;
	}

	public void adiciona(Produto produto) {
		// TODO Auto-generated method stub
		this.produtos.add(produto);
		
	}

	
}
