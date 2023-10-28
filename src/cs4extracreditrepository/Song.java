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

    public String getSongname() {
        return songname;
    }

    public double getSonglength() {
        return songlength;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }

    public void setSonglength(double songlength) {
        this.songlength = songlength;
    }
    
  private String songname; 
  private double songlength; 
    
    public Song( String Sn, double Sl) {
        songname = Sn;
        songlength = Sl; 
    }
    
    public void songplay(){
        System.out.println("Favorite Song: " + getSongname() + "\nSong length: " + getSonglength() + " min");  
    }
   
      
}
