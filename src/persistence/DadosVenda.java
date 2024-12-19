package persistence;

import java.util.LinkedList;
import java.util.List;

public class DadosVenda {
    private static List dados = new LinkedList();
    public static void salvar(Object Venda){
        dados.add(Venda);
    }
    public static List getDados(Class Venda){
        List temp = new LinkedList();
        for(Object dado: dados){
           if(dado.getClass().equals(Venda)){
               temp.add(dado);
           }
        }
        return temp;
    }
    public static List getDados(){
        return dados;
}
}
