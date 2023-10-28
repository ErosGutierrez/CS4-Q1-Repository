/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4extracreditrepository;


/**
 *
 * @author Gabriel Gutierrez
 */
public class Singer {
    
    String singername;
    int noOfPerformances;
    double earnings;
 
    
    public Singer(String s, int n, double e) {
     singername = s;
     noOfPerformances = n;
     earnings = e; 
    }
    
    Song favoritesong = new Song("Finesse ",3.72); 
        public void favoritesong(){
            favoritesong.songplay(); 
        }
      
    Song favoritesong2 = new Song("Uptown funk ",3.78);
    public String changeFavSong(){
        return favoritesong2.Songname; 
    }
     
    public void singerstats(){
        System.out.println("Singer: " + singername + '\n' + "Performance no.:" + noOfPerformances + "\nTotal Earnings:" + earnings +"$");  
    }
    
    public void performForAudience(){
        earnings+=1200;
        noOfPerformances++; 
    }
    


    }
  
   
     
    

  

