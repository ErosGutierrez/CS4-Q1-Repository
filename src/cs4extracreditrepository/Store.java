package cs4extracreditrepository;

import java.util.ArrayList;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList<>();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    this.earnings = 0; 
    // Initialize itemList as a new ArrayList
    this.itemList = new ArrayList<>();
    // add 'this' store to storeList
    storeList.add(this);
  }
  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if(index > this.itemList.size()-1){
       System.out.println("There are only " + this.itemList.size() + " items in " + this.name);
    }
    // get Item at index from itemList and add its cost to earnings
    else{
       Item item = this.itemList.get(index); 
       earnings +=  item.getCost();   
       // print statement indicating the sale
       System.out.println(item.getName() + " was sold for " + item.getCost() +" in " + this.name );
    }
  }
  public void sellItem(String nameItem){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    for(int i = 0; i<this.itemList.size(); i++){
        Item item = this.itemList.get(i);  
        if(nameItem.equals(item.getName())){
        // get Item from itemList and add its cost to earnings
           earnings += item.getCost();
        // print statement indicating the sale
           System.out.println(item.getName() + " was sold for " + item.getCost() +" in " + this.name );
           break;
          }
        else if(i == this.itemList.size()-1 && !nameItem.equals(item.getName())){
           System.out.println(this.name  + " does not sell " + nameItem);
           break; 
         }
      } 
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    if(this.itemList.contains(i) == true){
    // get Item i from itemList and add its cost to earnings
       this.earnings +=  i.getCost();
    // print statement indicating the sale
       System.out.println(i.getName() + " was sold for " + i.getCost() + " in " + this.name );
    }
    else
        System.out.println( this.name + " does not sell " + i.getName());
  }
  public void addItem(Item i){
    // add Item i to store's itemList
   this.itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
   this.itemList.forEach((e) -> {
        if(type.equals(e.getType()))
           System.out.println(type  + " : "+ e.getName());
    }); 
  }   
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    this.itemList.forEach((e) ->{       
        if(e.getCost() <= maxCost)
           System.out.println("Maximum cost of " + maxCost +": " + e.getName());
    });      
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    itemList.forEach((e) ->{       
        if(e.getCost() >= minCost)
           System.out.println("Minimum cost of " + minCost  +  ": " + e.getName());
    }); 
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java
      storeList.forEach((e)-> {  
           System.out.println("Store Name: " + e.getName());
           System.out.println("Earnings: $" +  e.getEarnings());     
    });
  }
}
       
 

