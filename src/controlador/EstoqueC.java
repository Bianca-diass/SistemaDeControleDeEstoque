package controlador;

import modelos.Estoque;
import persistence.Principal;

public class EstoqueC {
     public void salvar(String nome) throws Exception{
        if(nome.isEmpty()){
            throw new Exception("Informar ao usuário que o nome do Estoque é obrigatório.");
        }
        Estoque e = new Estoque();
        e.setNome(nome);
        Principal.salvar(e);             
    }
}
