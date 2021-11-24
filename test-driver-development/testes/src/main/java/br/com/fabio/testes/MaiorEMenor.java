package br.com.fabio.testes;

public class MaiorEMenor {
	
    private Produto maior;
    private Produto menor;

     /** 
     * @param carrinho 
     */
    public void encontra(CarrinhoDeCompras carrinho){
        for(Produto produto: carrinho.getProdutos()){
            if(menor == null || produto.getValor() < menor.getValor()){
                menor = produto;
            }else if(maior == null | produto.getValor() > maior.getValor()){
                maior = produto;
            }
        }
    }


    public Produto getMaior(){
        return this.maior;
    }
    public Produto getMenor(){
        return this.menor;
    }

}
