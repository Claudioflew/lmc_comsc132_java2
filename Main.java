import java.util.Scanner;
import java.lang.*;

public class Main {
  public static void main(String[] args) {
    int subtotal = 0;
    int total = 0;
    boolean end = false; // Flag variable to terminate a loop

    // Make a Scanner object to contain a user ipnut
    Scanner input = new Scanner(System.in); 
    int inputInt = input.nextInt();

    while (!end) {
      if (inputInt != 0) {
        subtotal += inputInt;
        inputInt = input.nextInt();
      }
      // If the input is 0, we want to reset the subtotal
      else {
        System.out.println("subtotal: " + subtotal);
        // Don't forget to add the subtotal to the total before resetting the subtotal
        total += subtotal;
        subtotal = 0;

        inputInt = input.nextInt();

        // If the input is 0 again, we want to terminate the loop
        if (inputInt == 0) {
          System.out.println("total: " + total);
          end = true;
        }
      }
    }
  }
}