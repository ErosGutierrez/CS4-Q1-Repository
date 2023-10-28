/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs4extracreditrepository;

/**
 *
 * @author Gabriel Gutierrez
 */
public class Audience {
    
    private String person1;
    private String person2;
    private String person3;
    private String person4;
    private String person5;
    private String person6; 
    private double tothours;
    private int concertgoers = 6 ;

     public Audience(String p1, String p2, String p3, String p4, String p5, String p6,  double ave){
        
       person1 = p1;
       person2 = p2;
       person3 = p3;
       person4 = p4;
       person5 = p5;
       person6 = p6;
       tothours = ave; 
        
   } 
     
     public Audience(String p1, String p2, String p3, String p4, String p5,  double ave){
        
       person1 = p1;
       person2 = p2;
       person3 = p3;
       person4 = p4;
       person5 = p5;
       person6 = "";
       tothours = ave; 
       concertgoers = 5; 
   } 
     public Audience(String p1, String p2, String p3, String p4,  double ave){
        
       person1 = p1;
       person2 = p2;
       person3 = p3;
       person4 = p4;
       person5 = "";
       person6 = "";
       tothours = ave; 
       concertgoers = 4; 
   } 
      
      public Audience(String p1, String p2, String p3,  double ave){
        
       person1 = p1;
       person2 = p2;
       person3 = p3;
       person4= "";
       person5= "";
       person6= "";
       tothours = ave;
       concertgoers = 3; 
   } 
       
      public Audience(String p1, String p2,  double ave){
       
       person1 = p1;
       person2 = p2;
       person3 = "";
       person4= "";
       person5 = "";
       person6 = "";
       tothours = ave; 
       concertgoers = 2; 
   } 
        
     public Audience(String p1,  double ave){
       
       person1 = p1;
       person2 = "";
       person3 = "";
       person4= "";
       person5= "";
       person6= "";
       tothours = ave; 
       concertgoers = 1; 
   } 
     
     public int getconcertgoers(){
         
      return getConcertgoers();
     
     }
     
     public void grp() {
    
    System.out.print(getPerson1() + " " + getPerson2() + " " + getPerson3() + " " + getPerson4() + " " + getPerson5() + " " + getPerson6());
    System.out.println("| No. of people in group: " + getConcertgoers() + " | Total no. of hours spent listening to singer: " + getTothours() + " |\n");
}

    public String getPerson1() {
        return person1;
    }

    public String getPerson2() {
        return person2;
    }

    public String getPerson3() {
        return person3;
    }

    public String getPerson4() {
        return person4;
    }

    public String getPerson5() {
        return person5;
    }

    public String getPerson6() {
        return person6;
    }

    public double getTothours() {
        return tothours;
    }

    public int getConcertgoers() {
        return concertgoers;
    }

    public void setConcertgoers(int concertgoers) {
        this.concertgoers = concertgoers;
    }


   
}

