package controlador;

import modelos.Categoria;
import persistence.Principal;

//CLASSE (PRODUTOCONTROLLER)RESPONSÁVEL POR CONTROLAR AS OPERAÇÕES RELACIONADOS A UM OBJETO (PRODUTO)
public class CategoriaC {
    public void salvar(String nome) throws Exception{
        if(nome.isEmpty()){
            throw new Exception("Informar ao usuário que o nome do Categoria é obrigatório.");
        }
        Categoria c = new Categoria();
        c.setNome(nome);
        Principal.salvar(c);             
    }
    
}
