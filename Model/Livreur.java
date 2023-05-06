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
        String[] noms = {"Jean", "Luc", "Pierre", "Julie", "Marie", "Samantha", "François", "David"};
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
    
    // Ajout de la fonctionnalité de gratuité si le livreur arrive après 30 minutes
    public boolean isLate() {
        if (commande == null) {
            return false;
        }
        int tempsLivraison = vehicule.getTempsLivraison(commande.getDistance());
        int tempsAttente = commande.getTempsAttente();
        int tempsTotal = tempsLivraison + tempsAttente;
        return tempsTotal > 30;
    }
    
    // Ajout de la fonctionnalité de pizza offerte après la 10ème commande
    public boolean is10thOrder() {
        if (commande == null) {
            return false;
        }
        Client client = commande.getClient();
        if (client == null) {
            return false;
        }
        int numberOfOrders = client.getNumberOfOrders();
        return numberOfOrders % 10 == 0 && numberOfOrders > 0;
    }
}
