package modelos;

public class ItemdeVenda {
    private String Nome;
    private String produto;
    private int quantVendida;
    
    public ItemdeVenda(){}

    public ItemdeVenda(String produto, int quantVendida, String Nome) {
        this.Nome = Nome;
        this.produto = produto;
        this.quantVendida = quantVendida;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantVendida() {
        return quantVendida;
    }

    public void setQuantVendida(int quantVendida) {
        this.quantVendida = quantVendida;
    }   
    public void setNome(String nome){
        this.Nome = Nome;
}
}