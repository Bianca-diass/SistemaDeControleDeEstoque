package controlador;

import modelos.Fornecedor;
import persistence.Principal;

public class FornecedorC {
       public void salvar(String nome) throws Exception{
        if(nome.isEmpty()){
            throw new Exception("Informar ao usuário que o nome do Fornecedor é obrigatório.");
        }
        
        Fornecedor f = new Fornecedor();
        f.setNome(nome);
        Principal.salvar(f);             
    }
}
