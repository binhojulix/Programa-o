package br.com.fabio;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));

        MaiorEMenor algoritimo = new MaiorEMenor();
        algoritimo.encontra(carrinho);

        System.out.println("o maior produto = " + algoritimo.getMaior.getName());
        System.out.println("o maior produto = " + algoritimo.getMenor.getName());

    }
}
