package Model;
import java.util.*;

/**
 * 
 */
public class LigneCommande {

    /**
     * Default constructor
     */
    public LigneCommande() {
    }

    /**
     * 
     */
    public int quantite;

    /**
     * 
     */
    public int taille;

    /**
     * 
     */
    public Commande appCom;
        public void set Commande(Commande a){
        appCom = a;
        }
 
    public Pizza listPizza;
        public void set Pizza(Pizza b){
        listPizza = b;
        }
    
    public LigneCommande (int a, int b){
        quantite = a;
        taille = b;
    }
    
   public void commandeClient(Client a){
   listClient.add(a);
}
   public void detientLigneCommande(LigneCommande b){
   listLigneCommande.add(b);
}
   public void assigneLivreur(Livreur c){
   listLivreur.add(c);
}
