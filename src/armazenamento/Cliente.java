package armazenamento;

import java.util.HashMap;

public class Cliente {
    private static HashMap<String, Cliente> ListaCliente = new HashMap();
    private String nome;
    
    public String getNome(){     
      return nome;        
    } 
    public static void SalvarCliente(Cliente novaCliente){      
        ListaCliente.put(novaCliente.getNome(), novaCliente);
    }
    public static HashMap<String, Cliente> getListaCliente(){
        return ListaCliente;
    }
    public static void removerCliente(String nomeCliente) {
        ListaCliente.remove(nomeCliente);
    } 
}
