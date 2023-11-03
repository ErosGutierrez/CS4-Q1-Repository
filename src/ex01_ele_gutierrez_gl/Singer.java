/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex01_ele_gutierrez_gl;

/**
 *
 * @author Gabriel Gutierrez
 */
public class Singer {
    
   private String singername;
   private int noOfPerformances;
   private static int totalPerformances;
   private double earnings;
   
   public Singer(String s1){
    singername = s1; 
    noOfPerformances = 0; 
    totalPerformances = 0;
    earnings = 0; 
    
}
    Song Song = new Song("Uptown funk", 3.72);
      
        
        public void favoritesong(){
         Song.songplay();
        }
      
        public void changeFavSong(String s1, int s2) {
    
        Song.setSongname(s1); 
        Song.setSonglength(s2);
           
    }
     

    public void performForAudience(int t){
        
        earnings += (100*t);
        noOfPerformances++; 
        totalPerformances+=noOfPerformances;
        System.out.println("Total performances of singer: " + noOfPerformances);
    }
    
     public void performForAudience(int t, String s1){
        
        earnings +=(100*t)/2;
        noOfPerformances++;   
        totalPerformances+=noOfPerformances;
        System.out.println('\n' + singername + " is now performing with " + s1 + '\n');
        System.out.println("Total performances of singers: " + totalPerformances);
        System.out.println(singername + "'s earnings: " + earnings);
        System.out.println(s1 + "'s earnings: " + earnings);
        
        
    }
    
    
     public String getsingername(){
        
      return singername;   
        
    }

     

    }
  
   
     
    

  
   
     
    

  

