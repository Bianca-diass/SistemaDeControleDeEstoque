package armazenamento;

import java.util.HashMap;

public class Vendedor {
    private static HashMap<String, Vendedor> ListaVendedor = new HashMap();
    private String nome;
    
    public String getNome(){     
      return nome;        
    } 

    public static void SalvarVendedor(Venda NovoVendedor){
        Vendedor novoVendedor = null;
        ListaVendedor.put(NovoVendedor.getNome(), novoVendedor);
    }
    public static HashMap<String, Vendedor> getListaVendedor(){
        return ListaVendedor;
    }
    public static void removerVendedor(String nomeVendedor) {
        ListaVendedor.remove(nomeVendedor);
    }
}
