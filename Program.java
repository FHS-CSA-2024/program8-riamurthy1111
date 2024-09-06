//import stuff here
import java.util.Scanner;
//Your code here
public class Program8{
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter number 1:");
        int number1 = 0;
        number1 = myScanner.nextInt();
        System.out.println("Enter number 2:");
        int number2 = 0;
        number2 = myScanner.nextInt();
        System.out.println("Original numbers are " + number1 + " and " + number2);
        int sum = number1  + number2;
        System.out.println("Sum = " + sum);
        int difference = number1 - number2;
        System.out.println("Difference = " + difference);
        int product = number1 * number2;
        System.out.println("Product = " + product);
        double average = (double) sum/2;
        System.out.println("Average = " + average);
        int absoluteValue = Math.abs(difference);
        System.out.println("Absolute value = " + absoluteValue);
        int maximum = Math.max(number1, number2);
        System.out.println("Maximum = " + maximum);
        int minimum = Math.min(number1, number2);
        System.out.println("Minimum = " + minimum);
    }
}
//Paste console output below:
/*
Enter number 1:
13
Enter number 2:
20
Original numbers are 13 and 20
Sum = 33
Difference = -7
Product = 260
Average = 16.5
Absolute value = 7
Maximum = 20
Minimum = 13
*/
