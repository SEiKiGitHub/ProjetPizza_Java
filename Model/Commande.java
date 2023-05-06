package Model;
import java.util.*;
import java.util.Random;

public class Commande {
    private int numero;
    private Client client;
    private Pizzeria pizzeria;
    
    public Commande(Client client, Pizzeria pizzeria) {
        this.numero = generateRandomNumber();
        this.client = client;
        this.pizzeria = pizzeria;
    }
    
    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100000);
    }
    
    public int getNumero() {
        return numero;
    }
    
    public Client getClient() {
        return client;
    }
    
    public Pizzeria getPizzeria() {
        return pizzeria;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    
    public void setPizzeria(Pizzeria pizzeria) {
        this.pizzeria = pizzeria;
    }
}
