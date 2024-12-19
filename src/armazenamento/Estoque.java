package armazenamento;

import java.util.HashMap;

public class Estoque {
    private static HashMap<String, Estoque> ListaEstoque = new HashMap();
    private String nome;
    
    public String getNome(){     
      return nome;        
    }  
    public static void SalvarEstoque(Estoque novaEstoque){      
        ListaEstoque.put(novaEstoque.getNome(), novaEstoque);
    }
    public static HashMap<String, Estoque> getListaEstoque(){
        return ListaEstoque;
    }
    public static void removerEstoque(String nomeEstoque) {
        ListaEstoque.remove(nomeEstoque);
    } 
  
}
