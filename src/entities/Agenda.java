package entities;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> list = new ArrayList<>();

    public Contato buscarContato(int id){
        return  list.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public void adicionarContato(Contato contato){
        list.add(contato);
    }

    public void removeContato(Integer id) {
        Contato contato = list.stream().filter(p -> p.getId().equals(id)).findFirst().get();
        list.remove(contato);
    }

    public void exibirContatos(){
        if (list.isEmpty()){
            System.out.println("The list is empty");
        }else {
            list.forEach(System.out::println);
        }
    }
}
