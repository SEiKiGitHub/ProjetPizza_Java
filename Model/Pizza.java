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
    
    public Pizza (String a, String b){
        nom = a;
        prix = b;
    }

}
