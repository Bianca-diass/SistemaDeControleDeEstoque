package modelos;

public class Fornecedor {
    private String nome;
    private Integer contato;
    
    public Fornecedor(){}

    public Fornecedor(String nome, Integer contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getContato() {
        return contato;
    }

    public void setContato(Integer contato) {
        this.contato = contato;
    }   
}
