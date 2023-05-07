package Model;
import java.util.*;
import java.util.ArrayList;


public class Client {
    private String phoneNumber;
    private String address;
    private int numberOfPizzas;
    private double prepaidCredit;
    private ArrayList<Client> ClientList = new ArrayList<>();
    
    public Client(String phoneNumber, String address, int numberOfPizzas, double prepaidCredit) {
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.numberOfPizzas = numberOfPizzas;
        this.prepaidCredit = prepaidCredit;
    }
    
    public Client verifClient(String telephone) {
        for (Client client : ClientList) {
            if (client.getPhoneNumber().equals(PhoneNumber)) {
                return client;
            }
        }
        return null;
    }
    
     public void addClient(Client client) {
        ClientList.add(client);
    }
    
    public void suppClient(Client client) {
        ClientList.remove(client);
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    public int getNumberOfPizzas() {
        return numberOfPizzas;
    }
    
    public double getPrepaidCredit() {
        return prepaidCredit;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setNumberOfPizzas(int numberOfPizzas) {
        this.numberOfPizzas = numberOfPizzas;
    }
    
    public void addPrepaidCredit(double amount) {
        prepaidCredit += amount;
    }
    
    public void removePrepaidCredit(double amount) {
        prepaidCredit -= amount;
    }
    
    public boolean passerCommande(double montantCommande) {
        if (prepaidCredit >= montantCommande) {
            removePrepaidCredit(montantCommande);
            numberOfPizzas++;
            return true;
        } else {
            System.out.println("Crédit insuffisant pour passer cette commande.");
            return false;
        }
    }
}
