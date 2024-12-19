package modelos;

public class Produto {
    private String nome;
    private String codigo;
    private String categoria;
    private Integer quantEstoque;
    private float preco;
    private String fornecedor;
    
    public Produto(){}

    public Produto(String nome, String codigo, String categoria, Integer quantEstoque, Float preco, String fornecedor) {
        this.nome = nome;
        this.codigo = codigo;
        this.categoria = categoria;
        this.quantEstoque = quantEstoque;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public Produto(String nomeProduto, double precoProduto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(Integer quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }  

    public int getQuantidade() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}