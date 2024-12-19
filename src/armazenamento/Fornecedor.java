package armazenamento;

import java.util.HashMap;

public class Fornecedor {
    private static HashMap<String, Fornecedor> ListaFornecedor = new HashMap();
    private String nome;
    
    public String getNome(){     
      return nome;        
    } 
    public static void SalvarFornecedor(Fornecedor novaFornecedor){      
        ListaFornecedor.put(novaFornecedor.getNome(), novaFornecedor);
    }
    public static HashMap<String, Fornecedor> getListaFornecedor(){
        return ListaFornecedor;
    }
    public static void removerFornecedor(String nomeFornecedor) {
        ListaFornecedor.remove(nomeFornecedor);
    } 
 
}
