package Model;
import java.util.*;
import java.util.Random;

public class Livreur {
    private String nom;
    private Vehicule vehicule;
    private Commande commande;
    
    public Livreur() {
        this.nom = generateRandomName();
        this.vehicule = generateRandomVehicle();
        this.commande = null;
    }
    
    private String generateRandomName() {
        Random rand = new Random();
        String[] noms = {"Jean", "Luc", "Pierre", "Julie", "Marie", "Samantha", "Francois", "David"};
        int randomIndex = rand.nextInt(noms.length);
        return noms[randomIndex];
    }
    
    private Vehicule generateRandomVehicle() {
        Random rand = new Random();
        String[] types = {"Voiture", "Moto"};
        int randomIndex = rand.nextInt(types.length);
        String type = types[randomIndex];
        return new Vehicule(type);
    }
    
    public String getNom() {
        return nom;
    }
    
    public Vehicule getVehicule() {
        return vehicule;
    }
    
    public Commande getCommande() {
        return commande;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
    
    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}
