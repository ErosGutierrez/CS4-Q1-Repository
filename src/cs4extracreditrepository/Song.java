/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4extracreditrepository;

/**
 *
 * @author Gabriel Gutierrez
 */
public class Song {
    
  private String songname; 
  private double songlength; 
    
    public Song( String Sn, double Sl) {
        songname = Sn;
        songlength = Sl; 
    }
    
    public void songplay(){
        System.out.println("Favorite Song: " + songname + "\nSong length: " + songlength + " min");  
    }
    
    public String songnach (String s1){
       
        songname = s1; 
        return songname; 
    }
    
     public double songlnch (double s2){
       
         songlength = s2; 
         return songlength; 
    }
   
    
   
}
