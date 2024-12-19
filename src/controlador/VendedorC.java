package controlador;

import modelos.Vendedor;
import persistence.Principal;

public class VendedorC {
    public void salvar(String nome) throws Exception{
        if(nome.isEmpty()){
            throw new Exception("Informar ao usuário que o nome Vendedor é obrigatório.");
        }
        Vendedor v = new Vendedor();
        v.setId(nome);
        Principal.salvar(v);             
    }
}
