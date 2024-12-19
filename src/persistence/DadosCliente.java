package persistence;

import java.util.LinkedList;
import java.util.List;

public class DadosCliente {
    private static List dados = new LinkedList();
    public static void salvar(Object Cliente){
        dados.add(Cliente);
    }
    public static List getDados(Class Cliente){
        List temp = new LinkedList();
        for(Object dado: dados){
           if(dado.getClass().equals(Cliente)){
               temp.add(dado);
           }
        }
        return temp;
    }
    public static List getDados(){
        return dados;
}
}