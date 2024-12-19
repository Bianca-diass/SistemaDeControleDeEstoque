package controlador;

import modelos.ItemdeVenda;
import persistence.Principal;

public class ItemdeVendaC {
    public void salvar(String nome) throws Exception{
        if(nome.isEmpty()){
            throw new Exception("Informar ao usuário que o nome do Item de Venda é obrigatório.");
        }
        ItemdeVenda i = new ItemdeVenda();
        i.setNome(nome);
        Principal.salvar(i);             
    }
}
