package list.OperacacaoBasica;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

private List<Tarefa> tarefaList;

public ListaTarefa(){
    this.tarefaList = new ArrayList<>();
}

public  void adicionarTarefa(String description){
    tarefaList.add(new Tarefa(description));
}

public void removerTarefa(String description){
    List<Tarefa> tarefasRemover = new ArrayList<>();

    for (Tarefa t : tarefaList){
        if(t.getDescription().equalsIgnoreCase(description)){
            tarefasRemover.add(t);
        }

        tarefaList.removeAll(tarefasRemover);
    }
}

public int obterNumeroDeTarefa(){
    return tarefaList.size();
}

public void obterDescricaoTarefa(){
    System.out.println(tarefaList);
}

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Numero total de tarefas " + listaTarefa.obterNumeroDeTarefa());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 2");

        System.out.println("Numero total de tarefas " + listaTarefa.obterNumeroDeTarefa());

        listaTarefa.obterDescricaoTarefa();

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("Numero total de tarefas " + listaTarefa.obterNumeroDeTarefa());
    }

}
