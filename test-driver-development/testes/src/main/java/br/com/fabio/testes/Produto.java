package br.com.fabio.testes;

public class Produto {
    private String name;
    private double valor;
	

    public Produto(String name, double valor) {
    	this.name = name;
    	this.valor = valor;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return this.valor;
    }

}
