package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorContato( String nome){
        Set<Contato> contaosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contaosPorNome.add(c);
            }
        }
        return contaosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualzado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualzado = c;
                break;
            }
        }
        return contatoAtualzado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato 1", 11111111);
        agendaContatos.adicionarContato("Contato 1", 22222222);
        agendaContatos.adicionarContato("Contato 3", 33333333);
        agendaContatos.adicionarContato("Contato 4", 44444444);
        agendaContatos.adicionarContato("Contato 5", 55555555);
        agendaContatos.adicionarContato("Contato 4", 66666666);
        agendaContatos.adicionarContato("Maria Silva", 77777777);

        System.out.println(agendaContatos.pesquisarPorContato("Maria"));

        System.out.println(agendaContatos.atualizarNumeroContato("Maria Silva", 99999999));

        agendaContatos.exibirContato();
    }
}
