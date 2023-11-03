package ex02_ele_gutierrez_gl;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Gabriel Gutierrez
 */
public class Song {
    
    String Songname; 
    Double songlength; 
    
    public Song( String Sn, Double Sl) {
        Songname = Sn;
        songlength = Sl; 
    }
    
    public void songplay(){
        System.out.println("Favorite Song: " + Songname + "\nSong length: " + songlength + " min");  
    }
    
    
    
}
