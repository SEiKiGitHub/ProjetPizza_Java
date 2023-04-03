package Model;
import java.util.*;

/**
 * 
 */
public class Client {

    /**
     * Default constructor
     */
    public Client() {
    }

    /**
     * 
     */
    public int numTelephone;

    /**
     * 
     */
    public float solde;

    /**
     * 
     */
    public int nbPizzaAchete;

    /**
     * 
     */
    public Vector<Commande> listCommande = new Vector<Commande>();

    public Pizzeria pizzeria;
        public void set Pizzeria(Pizzeria a){
        pizzeria = a;
        }
    
    public Client (int a,  float b, int c){
        numTelephone = a;
        solde = b;
        nbPizzaAchete = c;
    }
    
    public void ClientPizzeria(Pizzeria a){
   pizzeria.add(a);
}
    
    public void CommandeClient(Commande b){
   listCommande.add(b);
}
    
}
