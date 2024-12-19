package armazenamento;

import java.util.HashMap;

public class Venda {
    private static HashMap<String, Venda> ListaVenda = new HashMap();
    private String nome;
    
    public String getNome(){     
      return nome;        
    } 

    public static void SalvarVenda(Venda NovoVenda){
        ListaVenda.put(NovoVenda.getNome(), NovoVenda);
    }
    public static HashMap<String, Venda> getListaVenda(){
        return ListaVenda;
    }
    public static void removerVenda(String nomeVenda) {
        ListaVenda.remove(nomeVenda);
    }
}
