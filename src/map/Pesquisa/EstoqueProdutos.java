package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProdutos(long cod, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirTodosProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValotTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double maiorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProdutos(1L, "Produto 1", 10.0, 10);
        estoqueProdutos.adicionarProdutos(2L, "Produto 2", 5.0, 20);
        estoqueProdutos.adicionarProdutos(3L, "Produto 3", 40.0, 30);
        estoqueProdutos.adicionarProdutos(4L, "Produto 4", 25.0, 40);

        System.out.println("Valor total do estoque: R$" + estoqueProdutos.calcularValotTotalEstoque());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());

        estoqueProdutos.exibirTodosProdutos();



    }
}
