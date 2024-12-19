package modelos;

public class Relatório {
    private String tipoEstoque;
    private String map;
    
    public Relatório(){}

    public Relatório(String tipoEstoque, String map) {
        this.tipoEstoque = tipoEstoque;
        this.map = map;
    }

    public String getTipoEstoque() {
        return tipoEstoque;
    }

    public void setTipoEstoque(String tipoEstoque) {
        this.tipoEstoque = tipoEstoque;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }   
}
