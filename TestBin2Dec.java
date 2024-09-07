/**
 * Name: Bin2Dec
 * Author: Leah Boalich
 * Date: September 7, 2024
 * Assignment: Module 2 Chapter 12 Exercise 9
 * Description: This program checks if user input is a binary string.  If it is, the converted decimal representation is displayed.  If it is not, a custom BinaryFormatException is thrown and displays to the user that that the input is not a binary number.
 */

/*Imports */
import java.util.Scanner;

/*Test Bin2Dec */
public class TestBin2Dec {
    /*Main module */
    public static void main(String[] args) {
        //Ask the user to input binary number
        System.out.print("Please enter a binary string: ");
        //Create input scanner
        Scanner input = new Scanner(System.in);
        //Get the input
        String userNumber = input.next();
        //Use try catch to convert input to decimal
        try {
            //Use bin2Dec method to covert input to decimal
            int convertedNumber = bin2Dec(userNumber);
            //Display the converted input
            System.out.println(userNumber + " converted to decimal is " + convertedNumber);
        } catch (BinaryFormatException e) {
            //If input is not binary string, print exception message
            System.out.println(e);
        }  
        //Close the input scanner
        input.close();      
    }

    /*Method to convert binary string to decimal.  Throws BinaryFormatException */
    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        //Use try catch to convert binary string to decimal
        try {
            //Use parse into to convert string to decimal.  If string is not binary a NumberFormatException is thrown.
            int convertedDecimal = Integer.parseInt(binaryString, 2);
            //Return decimal
            return convertedDecimal;
        } catch (Exception e) {
            //NumberFormatException caught and custom BinaryFormatException thrown
            throw new BinaryFormatException(binaryString);
        }    
    }   
}
