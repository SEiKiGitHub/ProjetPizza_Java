
import java.util.*;

/**
 * 
 */
public class Pizzeria {

    /**
     * Default constructor
     */
    public Pizzeria() {
    }

    /**
     * 
     */
    public String adresse;

    /**
     * 
     */
    public String nom;

    /**
     * 
     */
    public Vector<Client> listClient = new Vector<Client>();
    
        public 

    /**
     * 
     */
    public Vector<Pizza> listPizza = new Vector<Pizza>();

 
    public Set<Ingredient> listIngredient;


    
    public Set<Livreur> listLivreur;
    
       public Pizzeria (String a, String b){
        nom = a;
        adresse = b;
    }
    
}
