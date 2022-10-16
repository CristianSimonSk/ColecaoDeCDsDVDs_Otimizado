package cds.dvds;

public class Item {
    public String titulo;
    public String descricao;
    public boolean possui;
    
    public Item(String titulo){
        this.titulo = titulo;
        possui = false;
        this.descricao = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean getPossui() {
        return possui;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public void setPossui(boolean possui) {
        this.possui = possui;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
