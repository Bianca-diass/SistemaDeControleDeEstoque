package sistemadeestoque;

import controlador.ProdutoC;
import modelos.Produto;
import javax.swing.JOptionPane;

public class RodarCodigo {

    public static void main(String[] args) {
       ProdutoC controller = new ProdutoC();
       String nome = JOptionPane.showInputDialog("Entre com o nome do Produto: ");
      try {
           controller.salvar(nome);
           if( nome.equals("eletronico")){
               System.out.println("O produto e eletronico.");//EXIBE NO CONSOLE.
           }
           
        } catch (Exception ex) {
            JOptionPane.showInputDialog(ex.getMessage());
        }
      }
}
