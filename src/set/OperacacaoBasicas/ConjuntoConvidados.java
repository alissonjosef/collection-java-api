package set.OperacacaoBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidados(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));

    }

    public void removerConvidadoPorCodigoConcite(int codigoConvite) {
        Convidado convidadoPararemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoPararemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoPararemover);
    }

    public int contarConvidado() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do set de convidados");

        conjuntoConvidados.adicionarConvidados("Convidado 1", 4321);
        conjuntoConvidados.adicionarConvidados("Convidado 2", 1234);
        conjuntoConvidados.adicionarConvidados("Convidado 3", 1434);
        conjuntoConvidados.adicionarConvidados("Convidado 4", 4213);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConcite(1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do set de convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
