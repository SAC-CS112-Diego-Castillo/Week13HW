
import java.util.Scanner;

import java.util.InputMismatchException;



public class Main

{
	 public static void main(String[] args)

	   {

	      TrippleDice dice = new TrippleDice();

	      Scanner input = new Scanner(System.in);

	      boolean continueLoop = true;  // determines if more input is needed
	      

	      do

	      {      

	         try   // rolls 3 dice and calculates average

	         {

	            System.out.printf("How many dice do you want to roll?: ");

	            int num = input.nextInt();

	            

	            if (num > 3)   // if user enters more than 3 dice, end program

	            {

	            	 throw new IllegalArgumentException("max plays is 3, size too big: " + num);

	            

	            }

	            else

	               System.out.println(dice);

	            

	            continueLoop = false;   // input successful; end looping

	         }    

	         catch (InputMismatchException inputMismatchException)

	         {

	            System.err.printf("%nException: %s%n", inputMismatchException);

	            input.nextLine(); // discard input so user can try again

	            System.out.printf("You must enter integers. Please try again.%n%n");

	         }

	         catch(ArithmeticException arithmeticException)
	         {
	       	  System.err.printf("\nException: %s\n", arithmeticException);
	       	  input.nextLine();
	       	 System.out.println("You must enter intergers. Please try again.\n");
	         }
	         catch (Exception a ) {
	   			System.out.printf("%nException: %s%n", a);
	   		
	   		System.out.printf("Exception");
	         }
	      } while (continueLoop);

	      
	      }

	   }