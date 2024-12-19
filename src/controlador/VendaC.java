package controlador;

import modelos.Venda;
import persistence.Principal;

public class VendaC {
    public void salvar(String nome) throws Exception{
        if(nome.isEmpty()){
            throw new Exception("Informar ao usuário que o nome do Venda é obrigatório.");
        }
        Venda v = new Venda();
        v.setDataVenda(Integer.MAX_VALUE);
        Principal.salvar(v);             
    }
}
