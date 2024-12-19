package persistence;

import java.util.LinkedList;
import java.util.List;

public class DadosEstoque {
     private static List dados = new LinkedList();
    public static void salvar(Object Estoque){
        dados.add(Estoque);
    }
    public static List getDados(Class Estoque){
        List temp = new LinkedList();
        for(Object dado: dados){
           if(dado.getClass().equals(Estoque)){
               temp.add(dado);
           }
        }
        return temp;
    }
    public static List getDados(){
        return dados;
}
}
