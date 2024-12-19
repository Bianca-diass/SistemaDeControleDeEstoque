package testes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects; 
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProdutoService {
    private final List<Produto> produtos = new ArrayList<>();

    public void cadastrarProduto(Produto produto) {
      Objects.requireNonNull(produto, "Produto cannot be null");

        if (produto.getNome().isEmpty() || produto.getPreco() <= 0 || produto.getQuantidade() < 0) {
            throw new IllegalArgumentException("Dados do produto inválidos (invalid product data)");
        }

        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        return new ArrayList<>(produtos); // Return a copy to avoid modification
    }

    public Produto buscarProdutoPorNome(String nome) {
        return produtos.stream().filter(p -> p.getNome().equals(nome)).findFirst().orElse(null);
    }
    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();
        Scanner scanner = new Scanner(System.in);

        // Sample menu loop
        while (true) {
            System.out.println("\nMenu de Produtos:");
            System.out.println("1. Cadastrar Produto");
            System.out.println("2. Listar Produtos");
            System.out.println("3. Buscar Produto por Nome");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Code for product creation and registration with service.cadastrarProduto()
                    break;
                case 2:
                    List<Produto> listaProdutos = service.listarProdutos();
                    if (listaProdutos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("Lista de Produtos:");
                        for (Produto produto : listaProdutos) {
                            System.out.println(produto); // Assuming Produto has a toString() method
                        }
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do produto a buscar: ");
                    String nome = scanner.next();
                    Produto produtoBuscado = service.buscarProdutoPorNome(nome);
                    if (produtoBuscado == null) {
                        System.out.println("Produto não encontrado.");
                    } else {
                        System.out.println("Produto:");
                        System.out.println(produtoBuscado); // Assuming Produto has a toString() method
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema.");
                    scanner.close(); // Close the scanner resource
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}


