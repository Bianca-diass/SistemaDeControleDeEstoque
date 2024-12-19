package persistence;

import java.util.LinkedList;
import java.util.List;

public class DadosRelatório {
    private static List dados = new LinkedList();
    public static void salvar(Object Relatório){
        dados.add(Relatório);
    }
    public static List getDados(Class Relatório){
        List temp = new LinkedList();
        for(Object dado: dados){
           if(dado.getClass().equals(Relatório)){
               temp.add(dado);
           }
        }
        return temp;
    }
    public static List getDados(){
        return dados;
}
}
