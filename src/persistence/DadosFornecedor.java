package persistence;

import java.util.LinkedList;
import java.util.List;

public class DadosFornecedor {
     private static List dados = new LinkedList();
    public static void salvar(Object Fornecedor){
        dados.add(Fornecedor);
    }
    public static List getDados(Class Fornecedor){
        List temp = new LinkedList();
        for(Object dado: dados){
           if(dado.getClass().equals(Fornecedor)){
               temp.add(dado);
           }
        }
        return temp;
    }
    public static List getDados(){
        return dados;
}
}