package Model;
import java.util.*;

/**
 * 
 */
public class Commande {

    /**
     * Default constructor
     */
    public Commande() {
    }

    /**
     * 
     */
    public int numero;

    /**
     * 
     */
    public Vector<LigneCommande> listLignCommande = new Vector<LigneCommande>();

    public Livreur livreur;
        public void set Livreur(Livreur a){
        livreur = a;
        }
    
    public Client listClient;
        public void set Client(Client b){
        listClient = b;
        }
    
    public Commande (int a){
        numero = a;
    }
    
   public void CommandeParClient(Client a){
   listClient.add(a);
}
    
    public void CommandeAssigneeLivreur(Livreur b){
   listLivreur.add(b);
}
    
    public void LigneCommandeParCommande(LigneCommande c){
   listLigneCommande.add(c);
}
}
