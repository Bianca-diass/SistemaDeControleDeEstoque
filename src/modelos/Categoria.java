package modelos;

public class Categoria {
    private String Nome;
    
    public Categoria(){}

    public Categoria(String nome) {
        this.Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }   

    public void addItem(String nomeItem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}