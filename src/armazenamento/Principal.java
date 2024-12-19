package armazenamento;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Principal {

    private final HashMap<String, Categoria> categorias = new HashMap<>();

    public void adicionarCategoria(Categoria categoria) {
        if (categorias.containsKey(categoria.getNome())) {
            JOptionPane.showMessageDialog(null, "Categoria com o mesmo nome já existe.");
        } else {
            categorias.put(categoria.getNome(), categoria);
            JOptionPane.showMessageDialog(null, "Categoria adicionada com sucesso!");
        }
    }

    public HashMap<String, Categoria> getCategorias() {
        return new HashMap<>(categorias);
    }

    public void removerCategoria(String nomeCategoria) {
        if (categorias.containsKey(nomeCategoria)) {
            categorias.remove(nomeCategoria);
            JOptionPane.showMessageDialog(null, "Categoria removida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Categoria não encontrada.");
        }
    }

    public static void main(String[] args) {
        Principal principal = new Principal();

        while (true) {
            String opcao = JOptionPane.showInputDialog("Escolha uma opção:\n1. Adicionar Categoria\n2. Remover Categoria\n3. Listar Categorias\n4. Sair");

            switch (opcao) {
                case "1":
                    String nomeCategoria = JOptionPane.showInputDialog("Digite o nome da categoria:");
                    Categoria categoria = new Categoria(nomeCategoria);
                    principal.adicionarCategoria(categoria);
                    break;
                case "2":
                    nomeCategoria = JOptionPane.showInputDialog("Digite o nome da categoria a ser removida:");
                    principal.removerCategoria(nomeCategoria);
                    break;
                case "3":
                    HashMap<String, Categoria> categorias = principal.getCategorias();
                    String listaCategorias = "";
                    for (String nome : categorias.keySet()) {
                        listaCategorias += nome + "\n";
                    }
                    JOptionPane.showMessageDialog(null, "Categorias:\n" + listaCategorias);
                    break;
                case "4":
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
