package Model;
import java.util.*;

class Customer {
private String name;
private String phone;
private String address;
private int balance;
private int freePizzas;

public Customer(String name, String phone, String address) {
    this.name = name;
    this.phone = phone;
    this.address = address;
    this.balance = 0;
    this.freePizzas = 0;
}

public String getName() {
    return name;
}

public String getPhone() {
    return phone;
}

public String getAddress() {
    return address;
}

public int getBalance() {
    return balance;
}

public void pay(int amount) {
    balance -= amount;
}

public boolean hasFreePizza() {
    return freePizzas > 0;
}

public void useFreePizza() {
    freePizzas--;
}

public void addFreePizza() {
    freePizzas++;
}   
}

class OrderItem {
private String name;
private int quantity;

public OrderItem(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
}

public String getName() {
    return name;
}

public int getQuantity() {
    return quantity;
}
}
