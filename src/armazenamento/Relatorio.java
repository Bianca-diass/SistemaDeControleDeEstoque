package armazenamento;

import java.util.HashMap;

public class Relatorio {
    private static HashMap<String, Relatorio> ListaRelatorio = new HashMap();
    private String nome;
    
    public String getNome(){     
      return nome;        
    } 

    public static void SalvarRelatorio(Relatorio NovoRelatorio){
        ListaRelatorio.put(NovoRelatorio.getNome(), NovoRelatorio);
    }
    public static HashMap<String, Relatorio> getListaRelatorio(){
        return ListaRelatorio;
    }
    public static void removerRelatorio(String nomeRelatorio) {
        ListaRelatorio.remove(nomeRelatorio);
    }
}
