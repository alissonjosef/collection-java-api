package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public  void adicionarProdutos(long codigo, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(nome, preco, codigo, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> exibirPorNome = new TreeSet<>(produtosSet);
        return exibirPorNome;
    }

     public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparationPorPreco());
         produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
     }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProdutos(1L, "Produto 1", 10.00, 10);
        cadastroProdutos.adicionarProdutos(2L, "Produto 0", 5.00, 20);
        cadastroProdutos.adicionarProdutos(6L, "Produto 3", 40.00, 30);
        cadastroProdutos.adicionarProdutos(4L, "Produto 5", 25.00, 40);

        System.out.println(cadastroProdutos.produtosSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }
}
