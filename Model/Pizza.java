package Model;
import java.util.*;

public class Pizza {
    private String nom;
    private String taille;
    private double prix;
    
    public Pizza(String nom, String taille, double prix) {
        this.nom = nom;
        this.taille = taille;
        this.prix = prix;
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getTaille() {
        return taille;
    }
    
    public double getPrix() {
        if (taille.equalsIgnoreCase("naine")) {
            return prix * 0.67; // 1/3 moins cher
        } else if (taille.equalsIgnoreCase("obese")) {
            return prix * 1.33; // 1/3 plus cher
        } else {
            return prix;
        }
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setTaille(String taille) {
        this.taille = taille;
    }
    
    public void setPrix(double prix) {
        this.prix = prix;
    }
}
