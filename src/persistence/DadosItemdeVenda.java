package persistence;

import java.util.LinkedList;
import java.util.List;

public class DadosItemdeVenda {
    private static List dados = new LinkedList();
    public static void salvar(Object ItemdeVenda){
        dados.add(ItemdeVenda);
    }
    public static List getDados(Class ItemdeVenda){
        List temp = new LinkedList();
        for(Object dado: dados){
           if(dado.getClass().equals(ItemdeVenda)){
               temp.add(dado);
           }
        }
        return temp;
    }
    public static List getDados(){
        return dados;
}
}
