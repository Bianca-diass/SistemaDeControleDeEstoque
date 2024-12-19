package persistence;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.Categoria;
import modelos.Cliente;
import modelos.Produto;

public class Principal {

    private static List dados = new LinkedList();

    public static void salvar(Object o) {
        dados.add(o);
    }

    public static List getDados(Class p) {
        List temp = new LinkedList();
        for (Object dado : dados) {
            if (dado.getClass().equals(p)) {
                temp.add(dado);
            }
        }
        return temp;
    }

    public static List getDados() {
        return dados;
    }

    public static void main(String[] args) {
        while (true) {
            String opcao = JOptionPane.showInputDialog("Escolha uma opção:\n1. Salvar Produto\n2. Salvar Cliente\n3. Salvar Categoria\n4. Sair");

            switch (opcao) {
                case "1":
                    String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto:");
                    double precoProduto = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco do produto:"));     
                    Produto produto = new Produto(nomeProduto, precoProduto);
                    salvar(produto);
                    break;
                case "2":
                    String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
                    String cpfCliente = JOptionPane.showInputDialog("Digite o CPF do cliente:");
                    Cliente cliente = new Cliente(nomeCliente, 123456789);
                    salvar(cliente);
                    break;
                case "3":
                    String nomeCategoria = JOptionPane.showInputDialog("Digite o nome da categoria:");
                    Categoria categoria = new Categoria(nomeCategoria);
                    salvar(categoria);
                    break;
                case "4":
                System.out.println("0");
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}

