/*
 * Project to create a Candy object and test its methods
 *
 * Author: Cody Stone
 * Date: 1/29/2020
 */
package mini03;

import java.util.Scanner;

//Public class CandyTest will test the methods of Candy
public class CandyTest {
    //Main to call different candy methods
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        
        //Candy C is a reference to our Candy Class
        Candy c = new Candy("", 2.0, 1);
        String name;
        double price;
        int quantity;
        
        //Set kit kat to constructor
        c.setName("Kit Kat");
        
        //Display Candy to user
        c.display();
        
        //Prompt user for name
        System.out.print("Enter new name: ");
        name = input.nextLine();
        //System.out.println();
        
        //Prompt user for price
        System.out.print("Price: ");
        price = input.nextDouble();
        //System.out.println();
        
        //prompt the user for quantity
        System.out.print("Quantity: ");
        quantity = input.nextInt();
        //System.out.println();
        
        c.setPrice(price);
        c.setName(name);
        c.setQuantity(quantity);
        
        //Display new candy
        c.display();
        c.printCost();
    }  
}
