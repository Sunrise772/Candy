/*
 * Project to create a Candy object and test its methods
 *
 * Author: Cody Stone
 * Date: 1/29/2020
 */
package mini03;

//public class candy will contain the methods of Candy
public class Candy {
    //instance variables of Candy
    private String name;
    private double price;
    private int quantity;
    
    //Constructor for Candy
    Candy(String name, double price, int quantity) {
        name = "default";
        price = 0.00;
        quantity = 0;
    }
    //Get method for name
    public String getName() {
        return name;
    }
    //Set method for name
    public void setName(String name) {
        this.name = name;
    }
    //Get method for price
    public double getPrice() {
        return price;
    }
    //Set method for price
    public void setPrice(double price) {
        this.price = price;
    }
    //Get method for quanitity
    public int getQuantity() {
            return quantity;
    }
    //Set method for quanitity
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }
        else {
            System.out.print("Sorry no negative quantities -- setting to 1");
            this.quantity = 1;
        }
    }
    
    //*Getcost to find total cost
    // public double getCost() {
    //    return cost = quantity * price;
    //}

    //Print function for Candy
    public void display() {
        System.out.printf("%s - %d at %.2f%n", name, quantity, price);
    }
    
    //print fucntion for Candy Cost
    public void printCost() {
        double cost;
        cost = quantity * price;
        System.out.printf("Total cost = $%.2f", cost);
    }
}
