package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Flavio", 123456789);
        agendaContatos.adicionarContato("Joana", 987654321);
        agendaContatos.adicionarContato("Marinez", 55555555);
        agendaContatos.adicionarContato("Ana da Silva", 88889999);
        agendaContatos.adicionarContato("Fernanda", 77778888);
        agendaContatos.adicionarContato("Fernanda", 77778888);
        agendaContatos.adicionarContato("Carla", 55555555);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Marinez");

        agendaContatos.exibirContatos();

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Ana da Silva"));
    }
}
