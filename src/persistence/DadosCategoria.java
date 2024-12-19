package persistence;
import java.util.LinkedList;
import java.util.List;

public class DadosCategoria {
    private static List dados = new LinkedList();
    public static void salvar(Object Categoria){
        dados.add(Categoria);
    }
    public static List getDados(Class Categoria){
        List temp = new LinkedList();
        for(Object dado: dados){
           if(dado.getClass().equals(Categoria)){
               temp.add(dado);
           }
        }
        return temp;
    }
    public static List getDados(){
        return dados;
}
}