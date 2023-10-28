/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs4extracreditrepository;

import java.util.Scanner;

/**
 *
 * @author Gabriel Gutierrez
 */
public class CS4ExtraCreditRepository {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int roundsToWin = 2;
        int roundsWon = 0;
        int roundsLost = 0;

        int Option;

        do {
            
          do{
              
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");

            Scanner op = new Scanner(System.in);
            Option = op.nextInt();
            
            if(Option < 1 || Option > 3 ){
            System.out.println("Invalid Input!");
            }
            
          }while(Option < 1 || Option > 3  );
           
            if (Option == 1) {
                int compmoves;
                 System.out.print("\nFirst to " + roundsToWin + " Wins!\n");
                do {
                    int random = (int) (Math.random() * 3) + 1;
                    String computerinp; 
                    
                    switch(random){
                        case 1:
                           computerinp = "rock";
                        break; 
                        case 2:
                           computerinp = "paper";
                        break;
                        default:
                            computerinp = "scissors";
                    }
                    
                    
                    System.out.println("The Computer has made its move");
                    System.out.println("What is your move: ");
                    System.out.println("rock ");
                    System.out.println("paper ");
                    System.out.println("scissors ");
                    Scanner sc = new Scanner(System.in); 
                    String Userinp = sc.nextLine();
                    String Usermove = Userinp.toLowerCase();

                    switch (Usermove) {
                        case "rock":
                            switch(random){
                                case 1:
                                compmoves = Move.compareMoves(rock, rock);
                                break;
                                case 2:
                                compmoves = Move.compareMoves(rock, paper);
                                break;
                                case 3:
                                compmoves = Move.compareMoves(rock, scissors);
                                break;
                                default:
                                compmoves = -1;
                            }
                        break;
                        case "paper":
                            switch(random){
                                case 1:
                                compmoves = Move.compareMoves(paper, rock);
                                break;
                                case 2:
                                compmoves = Move.compareMoves(paper, paper);
                                break;
                                case 3:
                                compmoves = Move.compareMoves(paper, scissors);
                                break;
                                default:
                                compmoves = -1;
                            }
                        break;
                        case "scissors":
                            switch(random){
                                case 1:
                                compmoves = Move.compareMoves(scissors, rock);
                                break;
                                case 2:
                                compmoves = Move.compareMoves(scissors, paper);
                                break;
                                case 3:
                                compmoves = Move.compareMoves(scissors, scissors);
                                break;
                                default:
                                compmoves = -1;
                            }
                        break;
                        default:
                        compmoves = -1;
                        System.out.println("Invalid Input!");
                    }
                    
                  System.out.println("Your move: " + Usermove +" || Computer move: " + computerinp);
                  
                  switch(compmoves){
                      
                   case 0: 
                   roundsWon++;
                   System.out.println("You have won the round!");
                   System.out.println("No. of Player wins: " + roundsWon + "|| No. of Computer wins: " + roundsLost);
                   break; 
                   
                   case 1:
                   roundsLost++;
                   System.out.println("You have lost the round!");
                   System.out.println("No. of Player wins: " + roundsWon + "|| No. of Computer wins: " + roundsLost);  
                   break; 
                   
                   case 2:
                   System.out.println("Draw!");
                   System.out.println("No. of Player wins: " + roundsWon + "|| No. of Computer wins: " + roundsLost);
                   break;   
                   default:
                   System.out.print(""); 
                  }
          } while (roundsWon != roundsToWin && roundsLost != roundsToWin);
                
               if(roundsWon == roundsToWin){
               System.out.println(   "You are the Champion of rock paper scissors!");  
               roundsWon = 0;
               }
               else {
               System.out.println(   "Computer is the Champion of rock paper scissors!\n");  
               roundsWon = 0;
               }
                
            }

            if (Option == 2) {
                do {
                System.out.println("Select difficulty level:");
                System.out.println("Easy");
                System.out.println("Medium");
                System.out.println("Hard");
                System.out.println("Extreme");
                System.out.println("Custom");
                Scanner sc = new Scanner(System.in);
                String diffinp = sc.nextLine();
                String diff = diffinp.toUpperCase();

                switch (diff) {
                    case "EASY":
                        roundsToWin = 2;
                        break;
                    case "MEDIUM":
                        roundsToWin = 5;
                        break;
                    case "HARD":
                        roundsToWin = 9;
                        break;
                    case "EXTREME":
                        roundsToWin = 15;
                        break;
                    case "CUSTOM":
                        System.out.println("Enter a number");
                        Scanner custinp = new Scanner(System.in);
                        int custom = custinp.nextInt();
                        roundsToWin = custom; 
                       
                               
                        break;
                    default:
                        roundsToWin = 0; 
                        System.out.println("Invalid Input!\n");
                }
                } while(roundsToWin == 0 );
            } 
        } while (Option != 3);
        
        System.out.println("See you next time!");
    }

   
}