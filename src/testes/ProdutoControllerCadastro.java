package testes;

import java.util.List;

public class ProdutoControllerCadastro {
    private ProdutoService produtoService;
    
    public ProdutoControllerCadastro(){
        this.produtoService = new ProdutoService();
    }
    
    public void cadastrarProduto(String nome, double preco, int quantidade){
        try{
            Produto produto = new Produto(nome, preco, quantidade);
            produtoService.cadastrarProduto(produto);
            System.out.println("Produto cadastrado com sucesso:"+ nome);
        }catch (IllegalArgumentException e ){
            System.out.println("Erro ao cadastrar produto:"+ e.getMessage());
        }
        
    }
    public void ListarProdutos(){
        List<Produto> produtos = produtoService.listarProdutos();
        if(produtos.isEmpty()){
            System.out.println("Nenhum produto cadastrado.");
        }else {
            System.out.println("Lista de produtos:");
            for(Produto produto : produtos){
                System.out.println("Nome:"+ produto.getNome()+
                                  ", Preço:"+ produto.getPreco()+
                                  ", Quantidade:"+ produto.getQuantidade());          
            }
        }
    }
    public void buscarProdutoPorNome(String nome){
        Produto produto = produtoService.buscarProdutoPorNome(nome);
        if(produto != null){
            System.out.println("produto encontrado: ");
            System.out.println("Nome:"+ produto.getNome()+
                               ", Preço:"+ produto.getPreco()+
                                ", Quantidade: "+ produto.getQuantidade());
        }else{
            System.out.println("Produto não encontrado: "+ nome);
        }
    }
}
