package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

   public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
   }

   public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPoAltura());
        return pessoaPorAltura;
   }

    public static void main(String[] args) {
        OrdenacacaoPessoa ordenacacaoPessoa = new OrdenacacaoPessoa();

        ordenacacaoPessoa.adicionarPessoa("Pessoa 1", 20, 1.80);
        ordenacacaoPessoa.adicionarPessoa("Pessoa 2", 30, 1.70);
        ordenacacaoPessoa.adicionarPessoa("Pessoa 3", 25, 1.60);
        ordenacacaoPessoa.adicionarPessoa("Pessoa 4", 19, 1.90);
        ordenacacaoPessoa.adicionarPessoa("Pessoa 5", 17, 2.50);

        System.out.println(ordenacacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacacaoPessoa.ordenarPorAltura());
    }
}

