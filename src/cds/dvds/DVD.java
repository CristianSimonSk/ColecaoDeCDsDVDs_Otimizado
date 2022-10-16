package cds.dvds;

public class DVD extends Item{   
    private String diretor;
    private String duracao;
    
    public DVD(String titulo, String diretor, String duracao){
        super(titulo);
        this.diretor = diretor; 
        this.duracao = duracao;
    }
    
    public String getDuracao() {
        return duracao;
    }
    
    public String getDiretor() {
        return diretor;
    }    
}