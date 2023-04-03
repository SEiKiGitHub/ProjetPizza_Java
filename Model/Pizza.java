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

    /**
     * 
     */
    public Set<Pizzeria> pizzeria;

    /**
     * 
     */
    public Set<LigneCommande> pizzaCom;

}
