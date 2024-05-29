package map.Ordenacao;

import map.OperacoesBasicas.AgendaContato;

import java.time.LocalDate;
import java.util.*;

public class EventosAegnda {

    private Map<LocalDate, Evento> eventosMap;

    public EventosAegnda() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        //Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgendamento(){
        Map<LocalDate, Evento> evenosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(evenosTreeMap);
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dareSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();*/

        Evento proximoEvento = null;
        LocalDate proximaData = null;

       LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> evenosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : evenosTreeMap.entrySet()) {
            proximaData = entry.getKey();
            proximoEvento = entry.getValue();
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo evento: " + proximoEvento + " acontecerà na data " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        EventosAegnda eventosAegnda = new EventosAegnda();

        eventosAegnda.adicionarEvento(LocalDate.of(2020, 10, 15), "Evento 1", "Atracao 1");
        eventosAegnda.adicionarEvento(LocalDate.of(2022, 7, 9), "Evento 2", "Atracao 2");
        eventosAegnda.adicionarEvento(LocalDate.of(2000, 1, 10), "Evento 3", "Atracao 3");
        eventosAegnda.adicionarEvento(LocalDate.of(2000, 1, 10), "Evento 4", "Atracao 4");
        eventosAegnda.adicionarEvento(LocalDate.of(2024, 5, 29), "Evento 5", "Atracao 5");

        eventosAegnda.exibirAgendamento();

        eventosAegnda.obterProximoEvento();


    }

}
