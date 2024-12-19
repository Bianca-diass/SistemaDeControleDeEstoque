package controlador;

import modelos.Relatório;
import persistence.Principal;

public class RelatorioC {
    public void salvar(String nome) throws Exception{
        if(nome.isEmpty()){
            throw new Exception("Informar ao usuário que o nome do Relatório é obrigatório.");
        }
        Relatório r = new Relatório();
        r.setTipoEstoque(nome);
        Principal.salvar(r);             
    }
}
