package cds.dvds;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class CD extends Item {
    private String artista;
    private String numero;
    
    public CD(String titulo, String artista, String numero){
        super(titulo);
        this.numero = numero;
        this.artista = artista;  
    }
    
    public String getArtista() {
        return artista;
    }
    
    public String getNumero() {
        return numero;
    }  
}   
