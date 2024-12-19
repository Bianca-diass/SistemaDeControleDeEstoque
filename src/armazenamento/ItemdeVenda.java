package armazenamento;

import java.util.HashMap;

public class ItemdeVenda {
    private static HashMap<String, ItemdeVenda> ListaItemdeVenda = new HashMap();
    private String nome;
    
    public String getNome(){     
      return nome;        
    } 
   
    public static void SalvarItemdeVenda(ItemdeVenda NovoItemdeVenda){
        ListaItemdeVenda.put(NovoItemdeVenda.getNome(), NovoItemdeVenda);
    }
    public static HashMap<String, ItemdeVenda> getListaProdutos(){
        return ListaItemdeVenda;
    }
    public static void removerItemdeVenda(String nomeItemdeVenda) {
        ListaItemdeVenda.remove(nomeItemdeVenda);
    }
}
