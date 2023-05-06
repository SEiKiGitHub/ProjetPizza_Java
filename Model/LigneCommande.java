package Model;
import java.util.*;

public class LigneCommande {
    private String taille;
    private int quantite;
    
    public LigneCommande(String taille, int quantite) {
        this.taille = taille;
        this.quantite = quantite;
    }
    
    public String getTaille() {
        return taille;
    }
    
    public int getQuantite() {
        return quantite;
    }
    
    public void setTaille(String taille) {
        this.taille = taille;
    }
    
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
