/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4extracreditrepository;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Gutierrez
 */
public class CS4ExtraCreditRepository {

    /**
     * @param args the command line arguments
     */

  public static void main(String[] args) {
    // Create items
    Item i1 = new Item("Burger", "food", 50);
    Item i2 = new Item("Fries", "food", 30);
    Item i3 = new Item("Fried Chicken", "food", 70);

    Item i4 = new Item("Shampoo", "toiletries", 120);
    Item i5 = new Item("Soap", "toiletries", 65);
    Item i6 = new Item("Toothpaste", "toiletries", 95);

    Item i7 = new Item("T-shirt", "clothes", 200);
    Item i8 = new Item("Jeans", "clothes", 1200);
    Item i9 = new Item("Shoes", "clothes", 2300);

    // Create Stores
    Store mcdo = new Store("McDo");
    Store watsons = new Store("Watsons");
    Store mall = new Store("Supermall");

    mcdo.addItem(i1);
    mcdo.addItem(i2);
    mcdo.addItem(i3);

    watsons.addItem(i4);
    watsons.addItem(i5);
    watsons.addItem(i6);
    
    
    mall.addItem(i1);
    mall.addItem(i2);
    mall.addItem(i4);
    mall.addItem(i5);
    mall.addItem(i6);
    mall.addItem(i7);
    mall.addItem(i8);
    mall.addItem(i9);
    
    mall.filterType("food");
    
    System.out.println("");
        
    mall.filterCheap(500);
    
    System.out.println("");
    
    mall.filterExpensive(1000);
    
    System.out.println("");
    
    mcdo.sellItem(0);
    mcdo.sellItem(50);

    System.out.println("");
    
    watsons.sellItem("Soap");
    watsons.sellItem("Mouthwash");
    
    System.out.println("");
        
    mall.sellItem(i7);
    mall.sellItem(i3);
    
    System.out.println("");
    // Check final earnings

    Store.printStats();
  }
}