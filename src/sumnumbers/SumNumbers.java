/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumnumbers;

import java.util.Scanner;
public class SumNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        int lastNumber = number % 10;
        number = number / 10;
        System.out.println("The last number: " +lastNumber);
        int mediumNumber = number % 10;
        number = number / 10;
        System.out.println("The medium number: " +mediumNumber);
        int firstNumber = number % 10;
        System.out.println("The first number: " +firstNumber);
        int sum = lastNumber + mediumNumber + firstNumber;
        System.out.println("The sum of numbers: " +sum);
    }
    
}
