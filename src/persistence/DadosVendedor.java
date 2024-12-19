package persistence;

import java.util.LinkedList;
import java.util.List;

public class DadosVendedor {
    private static List dados = new LinkedList();
    public static void salvar(Object Vendedor){
        dados.add(Vendedor);
    }
    public static List getDados(Class Vendedor){
        List temp = new LinkedList();
        for(Object dado: dados){
           if(dado.getClass().equals(Vendedor)){
               temp.add(dado);
           }
        }
        return temp;
    }
    public static List getDados(){
        return dados;
}
}
