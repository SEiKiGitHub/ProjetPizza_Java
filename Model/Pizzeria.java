package Model;
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
   
    
    public Vector<Pizza> listPizza = new Vector<Pizza>();

 
    public Vcetor<Ingredient> listIngredient = new Vector<Ingredient>();
    
    
    public Vector<Livreur> listLivreur = new Vector<Livreur>();
    
       public Pizzeria (String a, String b){
        nom = a;
        adresse = b;
    }
    
    public void addPizza(Pizza a){
        listPizza.add(a);
    }
    
    public void emploieLivreur(Livreur b){
        listLivreur.add(b)
    }
    
     public void recueilIngredients(Ingredient c){
     listIngredient.add(c)
    }
    
     public void possedeClient (Client d){
     listClient.add(d)
    }
    
}
