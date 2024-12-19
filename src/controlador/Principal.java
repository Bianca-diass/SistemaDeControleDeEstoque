package controlador;

import modelos.Produto;
import javax.swing.JOptionPane;

public class Principal {
 public static void main(String[] args) {
    
        String nome = JOptionPane.showInputDialog("Digite o nome do produto:");

        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome do produto é obrigatório.");
            return;
        }

        Produto p = new Produto();
        p.setNome(nome);

        try {
            persistence.Principal.salvar(p);
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar produto: " + e.getMessage());
        }
    }
}
