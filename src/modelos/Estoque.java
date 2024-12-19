package modelos;

public class Estoque {
    private String nome;
    private int quantMinima;
    private String ListProduto;
    
    public Estoque(){}

    public Estoque(int quantMinima, String ListProduto, String nome) {
        this.nome = nome;
        this.quantMinima = quantMinima;
        this.ListProduto = ListProduto;
    }

    public int getQuantMinima() {
        return quantMinima;
    }

    public void setQuantMinima(int quantMinima) {
        this.quantMinima = quantMinima;
    }

    public String getListProduto() {
        return ListProduto;
    }

    public void setListProduto(String ListProduto) {
        this.ListProduto = ListProduto;
    }   
    public void setNome(String nome){
        this.nome = nome;
    }
}
