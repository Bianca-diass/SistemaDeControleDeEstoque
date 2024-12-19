package controlador;

import modelos.Cliente;
import persistence.Principal;

public class ClienteC {
     public void salvar(String nome) throws Exception{
        if(nome.isEmpty()){
            throw new Exception("Informar ao usuário que o nome do Cliente é obrigatório.");
        }
        Cliente c = new Cliente();
        c.setNome(nome);
        Principal.salvar(c);             
    }
}
