package Model;
import java.util.*;

/**
 * 
 */
public class Pizza {

    /**
     * Default constructor
     */
    public Pizza() {
    }

    /**
     * 
     */
    public String nom;

    /**
     * 
     */
    public float prix;

    /**
     * 
     */
    
    public Vector<Ingredient> listIngredient = new Vector<Ingredient>();

    public Vector<Pizzeria> pizzeria = new Vector<Pizzeria>();

    public Vector<LigneCommande> pizzaCom = new Vector<LigneCommande>();
    
    public Pizza (String a, float b){
        nom = a;
        prix = b;
    }
    
   public void pizzaContient(Ingredient a){
   listingredient.add(a);
    }
   public void pizzaProposePizzeria(Pizzeria b){
   pizzeria.add(b);
    }
   public void pizzaDispose(LigneCommande c){
   pizzaCom.add(c);
    }
}
