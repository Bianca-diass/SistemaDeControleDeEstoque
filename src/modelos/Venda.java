package modelos;

public class Venda {
    private Integer dataVenda;
    private String produtoVendido;
    private Float valorTotal;
    private String cliente;
    private String vendedor;
    
    public Venda(){}

    public Venda(Integer dataVenda, String produtoVendido, Float valorTotal, String cliente, String vendedor) {
        this.dataVenda = dataVenda;
        this.produtoVendido = produtoVendido;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public Integer getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Integer dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }   
}
