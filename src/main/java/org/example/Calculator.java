package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

import java.math.*;


public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1;
        double number2;
        //int number3;
        int number4;
        do {
            System.out.println("Calculator-using-DevOps, Choose to perform operation");
            System.out.print("Press 1 to find Square root\nPress 2 to find Factorial\nPress 3 to find Natural Logarithm\nPress 4 to find Power\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // Find Square root
                    System.out.print("Enter any positive real number : ");
                    number1 = scanner.nextDouble();
                    //System.out.print("Enter the second number : ");
                    //number2 = scanner.nextDouble();
                    System.out.println("Square root of "+number1+" and  is : " + calculator.squareroot(number1));
                    System.out.println("\n");

                    break;
                case 2:
                    // find Factorial
                    System.out.print("Enter any positive integer : ");
                    number4 = scanner.nextInt();
                    System.out.println("Factorial of "+number4+" is : " + calculator.factorial(number4));
                    System.out.println("\n");

                    break;
                case 3:
                    // find natural logarithm
                    System.out.print("Enter any positive real number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Square of "+number2+" is : " + calculator.naturallogarithm(number2));
                    System.out.println("\n");

                    break;
                case 4:
                    // Find the power
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println(" "+number1+" raised to power "+number2+" is : " + calculator.power(number1,number2));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }


    public double squareroot(double number1) {
        logger.info("[SQAURE ROOT - " + number1 + "]");
        double result =Math.sqrt(number1);
        logger.info("[RESULT - SQUARE ROOT IS] - " + result);
        return result;
    }

    public int factorial(int number4) {
        logger.info("[Factorial of ] - " + number4);
        int result = 1;
        for(int i=1; i<=number4; i++) {
            result=result*i;
        }
        logger.info("[RESULT - FACTORIAL IS] - " + result);
        return result;
    }

    public double naturallogarithm(double number2) {
        logger.info("[NATURAL LOGARITHM] - " + number2);
        double result=Math.log(number2);
        logger.info("[RESULT - NATURAL LOGARITHM IS] - " + result);
        return result;
    }

    public double power(double number1, double number2) {
        logger.info("[Power of - " + number1 + " , " + number2);
        double result=Math.pow(number1, number2);
        logger.info("[RESULT - Power: x^y] - " + result);
        return result;
    }


}
