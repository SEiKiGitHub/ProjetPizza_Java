package Model;
import java.util.*;

public class Client {
    private String phoneNumber;
    private String address;
    private int numberOfPizzas;
    
    public Client(String phoneNumber, String address, int numberOfPizzas) {
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.numberOfPizzas = numberOfPizzas;
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
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setNumberOfPizzas(int numberOfPizzas) {
        this.numberOfPizzas = numberOfPizzas;
    }
}
