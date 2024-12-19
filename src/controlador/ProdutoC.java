package controlador;

import modelos.Produto;
import persistence.Principal;

public class ProdutoC {
    public void salvar(String nome) throws Exception{
        if(nome.isEmpty()){
            throw new Exception("Informar ao usuário que o nome do Produto é obrigatório.");
        }
        Produto p = new Produto();
        p.setNome(nome);
        Principal.salvar(p);             
    }
}
