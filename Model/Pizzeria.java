package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pizzeria {
    private String name;
    private String address;
    private List<Client> clients;
    
    public Pizzeria(String name) {
        this.name = name;
        this.address = generateRandomAddress();
        this.clients = new ArrayList<Client>();
    }
    
    private String generateRandomAddress() {
        String[] streets = {"rue de la Paix", "avenue des Champs-Élysées", "boulevard Haussmann", "rue de Rivoli", "rue Saint-Honoré"};
        String[] cities = {"Paris", "Lyon", "Marseille", "Toulouse", "Bordeaux"};
        String[] zipCodes = {"75001", "69001", "13001", "31000", "33000"};
        
        Random rand = new Random();
        String street = streets[rand.nextInt(streets.length)];
        String city = cities[rand.nextInt(cities.length)];
        String zipCode = zipCodes[rand.nextInt(zipCodes.length)];
        
        return street + ", " + zipCode + " " + city;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public List<Client> getClients() {
        return clients;
    }
    
    public void addClient(Client client) {
        clients.add(client);
    }
    
    public void removeClient(Client client) {
        clients.remove(client);
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}
