package Model;
import java.util.*;

/**
 * 
 */
public class Ingredient {

    /**
     * Default constructor
     */
    public Ingredient() {
    }

    /**
     * 
     */
    public String nom;

    /**
     * 
     */
    public float prixIngredient;

    /**
     * 
     */
    public Vector<Pizza> listPizza = new Vector<Pizza>();

    public Vector<Pizzeria> pizzeria = new Vector<Pizzeria>();

    public Ingredient (String a, float b){
        nom = a;
        prixIngredient = b;
    }
    
   public void receuilliParPizzeria(Pizzeria a){
   pizzeria.add(a);
}
   public void ContenuDansPizza(Pizza b){
   listPizza.add(b);
}
}
