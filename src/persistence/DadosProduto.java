package persistence;

import java.util.LinkedList;
import java.util.List;

public class DadosProduto {
    private static List dados = new LinkedList();
    public static void salvar(Object Produto){
        dados.add(Produto);
    }
    public static List getDados(Class Produto){
        List temp = new LinkedList();
        for(Object dado: dados){
           if(dado.getClass().equals(Produto)){
               temp.add(dado);
           }
        }
        return temp;
    }
    public static List getDados(){
        return dados;
}
}
