package cs4extracreditrepository;

import java.util.ArrayList; 

public class Item {
  private String name, type;
  private double cost;
  private static ArrayList<Item> completeItemList = new ArrayList();

  public Item(String name, String type, double cost){
    this.name = name;
    this.type = type;
    this.cost = cost;
    completeItemList.add(this);
  }
  public String getName(){
    return name;
  }
  public String getType(){
    return type;
  }
  public double getCost(){
    return cost;
  }
  public static Item getItem(int index){
    return completeItemList.get(index);
  }
  public static void printAllItems(){
    for(Item i : completeItemList){
      String itemName = i.getName(); 
      String itemType = i.getType();
      double itemCost = i.getCost(); 
      System.out.printf("Name: %s%n Type: %s%n Cost:%s%n", itemName, itemType, itemCost);
    }
  }
}
