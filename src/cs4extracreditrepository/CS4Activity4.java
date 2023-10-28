/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4extracreditrepository;

/**
 *
 * @author Gabriel Gutierrez
 */
public class CS4Activity4 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        
      Audience Group1 = new Audience("Naomi,","Noah,", "Nathan,", "Nick", 127.92); 
      Audience Group2 = new Audience("Gwen,","Gavin,","George,", "Glen", 80.43); 
      Audience Group3 = new Audience("Jacob,","Jack", 60.81); 
     
   
     System.out.println("Concert Audience: "); 
 
     int audience1 = Group1.getconcertgoers();
            Group1.grp();  
            int audience2 = Group2.getconcertgoers();
            Group2.grp();  
            int audience3 = Group3.getconcertgoers();
            Group3.grp();  
            int totalaudi = audience3 + audience2 + audience1;
            
            System.out.println("Total audience: " + totalaudi);
            System.out.println("Ticket price per person: 100.0"); 
           
            Singer Singer1 = new Singer("Bruno Mars");
            Singer Singer2 = new Singer( "Taylor Swift");
            String s2 = Singer2.getsingername(); 
      
            Singer1.performForAudience(totalaudi,s2);
      
     
     
           
           
           
        }

        
    } 