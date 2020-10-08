import java.util.Scanner;
/**
 * This program will tell the user to enter 10 numbers and then will have the user enter a number to find in the array 
 * @author Sevde 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
    // tell the user to enter in integers 
    System.out.println("Please enter in 10 integers to put into array "); 
    // variable for how many integers will be in the array
     final int NUM_INTEGERS = 10;
     // make an array to store the integers 
     int[] integers = new int[NUM_INTEGERS];
     // put the integers in the array using loop
     
     // make a for loop to go through the array
     for (int i = 0; i < NUM_INTEGERS; i++ ){
      integers[i] = input.nextInt();

     }
     // ask the user to enter in a number to find in the array 
     System.out.println("Please enter a number to find");
     // make a for loop to print find number 
     for (int i = 0; i < NUM_INTEGERS; i++ ){
       // make a variable to store the entered number to find it in the array 
       int findNumber = input.nextInt();
       // make a for loop to find the number 
       for (i = 0; i < NUM_INTEGERS; i++ ){
         // make an if statement to see if the number is in the array 
       if (findNumber == integers[i]){
         // print out which index this number is located in
         System.out.println(findNumber + " is located at index " + i );
       }
       }
       }
  }
  }

