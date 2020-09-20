package shopping.cart.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



public class Item
{

private int id;
private String name;
private double price;
private String description;
private int quantity;
private double tax;

public Item (int itemID, String itemName, double itemPrice, String itemDescription, int itemQuantity, double itemTax){
    id = itemID;
    name = itemName;
    price = itemPrice;
    description = itemDescription;
    quantity = itemQuantity;
    tax = itemTax;
}

public int getID(){
    return id;
}

public String getName(){
    return name;
}

public double getPrice(){
    return price;
}

public String getDescription(){
    return description;
}

public int getQuantity(){
    return quantity;
}

public double getTax(){
    return tax;
}

}
