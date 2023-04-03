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
    public int numTel;

    /**
     * 
     */
    public float solde;

    /**
     * 
     */
    public int nbrepizzaAchete;

    /**
     * 
     */
    public Vector<Commande> listCommande = new Vector<Commande>();

    public Pizzeria pizzeria;
        public void set Pizzeria(Pizzeria a){
        pizzeria = a;
        }
}
