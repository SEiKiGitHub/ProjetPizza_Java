package Model;
import java.util.*;

public class Ingredient {
    private String nom;
    private double prix;
    
    public Ingredient(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
    
    public String getNom() {
        return nom;
    }
    
    public double getPrix() {
        return prix;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setPrix(double prix) {
        this.prix = prix;
    }
}
Ingredient mozzarella = new Ingredient("Mozzarella", 1.5);
Ingredient tomate = new Ingredient("Tomate", 0.8);
Ingredient champignons = new Ingredient("Champignons", 1.2);
Ingredient jambon = new Ingredient("Jambon", 2.0);

