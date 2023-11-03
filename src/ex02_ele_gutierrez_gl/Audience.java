/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex02_ele_gutierrez_gl;

/**
 *
 * @author Gabriel Gutierrez
 */
public class Audience {
    
    String person1;
    String person2;
    String person3;
    String person4;
    String person5;
    String person6; 
    double tothours;
    int concertgoers = 6 ;

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
     
     
    public void grp() {
    
    System.out.print(person1 + " " + person2 + " " + person3 + " " + person4 + " " + person5 + " " + person6);
    System.out.println("| No. of people in group: " + concertgoers + " | Total no. of hours spent listening to singer: " + tothours + " |\n");
}


   
}

