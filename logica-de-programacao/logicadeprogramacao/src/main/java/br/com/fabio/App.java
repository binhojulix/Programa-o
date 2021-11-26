package br.com.fabio;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Produto produtos[] = new Produto[5];
        produtos[0] = new Produto("Lamborghini", 1000000);
        produtos[1] = new Produto("Jipe", 46000);
        produtos[2] = new Produto("Brasília", 16000);
        produtos[3] = new Produto("Smart", 46000);
        produtos[4] = new Produto("Fusca", 17000);

        // int maisBarato = buscaMenor(produtos);
        int maisBarato = buscaMenor(produtos, 0, 4);
        for (int atual = 0; atual <= 4; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }
        System.out.println(maisBarato);
        System.out.println("O	carro	mais	barato	custa "
                + produtos[maisBarato].getPreco());

    }

    private static int buscaMenor(Produto[] produtos) {
        int maisBarato = 0;
        for (int atual = 0; atual <= 4; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
        int maisBarato = inicio;
        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

    private static void ordena(Produto[] produtos) {
        for (int atual = 0; atual < produtos.length - 1; atual++) {
            int menor = buscaMenor(produtos, atual, produtos.length - 1);
            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];
            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }
    }

    private static void novoSort(Produto[] produtos, int quantidadeDeElementos) {
        for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
            int analise = atual;
            while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
                Produto produtoAnalise = produtos[analise];
                Produto produtoAnaliseMenos1 = produtos[analise - 1];
                produtos[analise] = produtoAnaliseMenos1;
                produtos[analise - 1] = produtoAnalise;
                analise--;
            }
        }
    }

    private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
        for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
            int menor = buscaMenor(produtos, atual, quantidadeDeElementos - 1);
            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];
            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }
    }

}
