package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarCOntato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.adicionarCOntato("Contato 1", 11111111);
        agendaContato.adicionarCOntato("Contato 6", 22222222);
        agendaContato.adicionarCOntato("Contato 3", 33333333);
        agendaContato.adicionarCOntato("Contato 4", 44444444);
        agendaContato.adicionarCOntato("Contato 5", 55555555);
        agendaContato.adicionarCOntato("Contato 4", 66666666);

        agendaContato.exibirContato();
        System.out.println(agendaContato.pesquisarPorNome("Contato 5"));

        agendaContato.removerContato("Contato 1");

        agendaContato.exibirContato();

    }
}
