package Model;
import java.util.*;

/**
 * 
 */
public class Livreur {

    /**
     * Default constructor
     */
    public Livreur() {
    }

    /**
     * 
     */
    public String nom;

    /**
     * 
     */
    public String vehicule;

    /**
     * 
     */
    public Vector<Commande> listCommande = new Vector<Commande>();

    public Pizzeria pizzeria;
        public void set Pizzeria(Pizzeria a){
        pizzeria = a;
        }
    public Livreur (String a, String b){
        nom = a;
        vehicule = b;
    }
    
   public void employesPizzeria(Pizzeria a){
   pizzeria.add(a); 
    }
    
   public void assigneCommande(Commande b){
   listCommande.add(b);
   }
}
