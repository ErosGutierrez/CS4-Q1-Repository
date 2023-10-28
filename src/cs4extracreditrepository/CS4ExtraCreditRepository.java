/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4extracreditrepository;

/**
 *
 * @author Gabriel Gutierrez
 */
public class CS4ExtraCreditRepository {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String name = "John";
         String subject = "Math";
         int hours = 100;
        
            System.out.println("Name: " + name);
            System.out.println("Best Subject: "+ subject);
            System.out.println("Hours spent studying: " + hours);
            System.out.println(" ");
        
         
            String name2 = "Lee";
            String subject2 = "Math";
            int hours2 = 70;

            System.out.println("Name: " + name2);
            System.out.println("Best Subject: "+ subject2);
            System.out.println("Hours spent studying: " + hours2);
            System.out.println(" ");
        
        
            String name3 = "Jeff";
            String subject3 = "Chemistry";
            int hours3 = 30;
                
            System.out.println("Name: " + name3);
            System.out.println("Best Subject: "+ subject3);
            System.out.println("Hours spent studying: " + hours3);
            System.out.println(" ");
                
        
            int tothours = hours + hours2 + hours3;
            System.out.println("Total hours spent studying by students " + tothours);
                    
            System.out.print("Lee and John have the same best subject: ");
            boolean subjcompare = subject == subject2;  
            System.out.println(subjcompare);
                    
            System.out.print("John has spent more time studying than Lee and Jeff combined: ");
            boolean hourscompare = hours3 + hours2 < hours;  
            System.out.println(hourscompare);
    }
  }
    

