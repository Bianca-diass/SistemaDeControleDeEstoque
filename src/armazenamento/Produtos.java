package armazenamento;

import java.util.HashMap;
import modelos.Produto;

public class Produtos {
    private static HashMap<String, Produto> ListaProdutos = new HashMap();
    private String nome;
    
    public String getNome(){     
      return nome;        
    } 
    
    public static void SalvarProduto(Produto NovoProduto){
        ListaProdutos.put(NovoProduto.getNome(), NovoProduto);
    }
    public static HashMap<String, Produto> getListaProdutos(){
        return ListaProdutos;
    }
    public static void removerProduto(String nomeProduto) {
        ListaProdutos.remove(nomeProduto);
    }
}