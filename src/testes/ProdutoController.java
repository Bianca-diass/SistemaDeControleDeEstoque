package testes;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    private List<Produto> produtos;

    public ProdutoController() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso: " + nome);
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de Produtos:");
            for (Produto produto : produtos) {
                System.out.println("Nome: " + produto.getNome() +
                                   ", Preço: " + produto.getPreco() +
                                   ", Quantidade: " + produto.getQuantidade());
            }
        }
    }

    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        System.out.println("Produto não encontrado: " + nome);
        return null;
    }

    public boolean atualizarProduto(String nome, double novoPreco, int novaQuantidade) {
        Produto produto = buscarProduto(nome);
        if (produto != null) {
            produto.setPreco(novoPreco);
            produto.setQuantidade(novaQuantidade);
            System.out.println("Produto atualizado com sucesso: " + nome);
            return true;
        }
        System.out.println("Falha ao atualizar. Produto não encontrado: " + nome);
        return false;
    }

    public boolean removerProduto(String nome) {
        Produto produto = buscarProduto(nome);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto removido com sucesso: " + nome);
            return true;
        }
        System.out.println("Falha ao remover. Produto não encontrado: " + nome);
        return false;
    }
}

