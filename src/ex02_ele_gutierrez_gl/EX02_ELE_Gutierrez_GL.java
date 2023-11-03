/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02_ele_gutierrez_gl;

/**
 *
 * @author Gabriel Gutierrez
 */
public class EX02_ELE_Gutierrez_GL  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Concert Audience: "); 
      //Instance 1
      Audience Group1 = new Audience("Naomi,","Noah,", "Nathan,", "Nick", 127.92);
     
      int audience1 = Group1.concertgoers;
      Group1.grp();  
      
      //Instance 2
      Audience Group2 = new Audience("Gwen,","Gavin,","George,", "Glen,", "Grant", 80.43); 
      
      int audience2 = Group2.concertgoers;
      Group2.grp();  
      
      //Instance 3
      Audience Group3 = new Audience("Jacob,","Jack,","James", 60.81); 
      
   
      int audience3 = Group3.concertgoers;
      Group3.grp();  
      System.out.println("Ticket price per individual:100$\n"); 
      
      //Singer instance
      Singer Singer = new Singer("Bruno Mars", 1, 0.0); 
    
        Singer.singerstats(); 
        Singer.favoritesong(); 
        Singer.performForAudience();
        int totalaud = audience3 + audience2 + audience1; 

        if(Singer.earnings == 1200){

           System.out.println("\nBruno Mars has finished performing to " + totalaud  + " audience members!\n" + Singer.singername + " has changed his favorite song to " + Singer.changeFavSong());  
           Singer.singerstats(); 
        }
    }
  }
    

