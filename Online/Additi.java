// take input from usear and print the sum of two numbers

import java.util.Scanner;

public class Additi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        
        int sum = a + b;
        
        System.out.println("The sum of two numbers is: " + sum);
    }
}