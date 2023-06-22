// Loops and Decisiong Making in Java

import java.util.*;

class loopsAndDecision
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //
        // LOOPS
        //

        System.out.println("=== LOOPS ===");
        // for Loop        
        System.out.println("Printing Values from 0 to 3:");
        for (int i = 0; i < 5; i++)
        {
            System.out.print(i + " ");
            if (i == 3)
            {
                System.out.println("We break the loop as i is 3"); 
                break;
            }
        }
        System.out.println();

        
        // while loop
        int n = 0;
        System.out.println("Printing Odd Numbers between 0 and 10:");
        while(n<10)
        {
            if(n % 2 == 1)
            {
                System.out.print(n + " ");
                n++;
            }
            else
            {
                n++;
                // Continuing to next iteration if not odd
                continue;
            }

        }
        System.out.println("\n");

        // do...while Loop
        n = 2;
        System.out.println("Printing Table of 2:");
        do{
            System.out.print(n + " ");
            n = n + 2;
        }while(n<=10);
        System.out.println("\n");

        // Enhanced For Loop
        int [] numbers = {10,20,30,40};
        String [] names = {"Ahmed","Vaishnavi","Nishka","Tejanshu"};
        
        System.out.println("Printing Numbers from an array:");
        for (int number : numbers)
        {
            System.out.print(number + " ");
        }
        System.out.println("\n");
        
        System.out.println("Printing Names from an array:");
        for (String name : names)
        {
            System.out.print(name + " ");
        }
        System.out.println("\n");

        
        //
        // DECISION MAKING
        //

        System.out.println("=== DECISION MAKING ===");

        // Usage of If Statement
        System.out.println("Check Eligibility of Voting");
        int age = 18;
        if (age >= 18)
        {
            System.out.println("Eligible to vote");
        }

        System.out.println();

        //Usage of If-Else Statement
        System.out.println("Checking whether the number is Even or Odd");
        int num = 22;
        if (num % 2 == 0)
        {
            System.out.println("Number "+ num +" is an even number");
        }
        else
        {
            System.out.println("Number "+ num +" is an odd number");
            
        }

        
        System.out.println();

        // Decision using Ternary Operator
        System.out.println("Checking whether the number is Even or Odd using Ternary Operator");
        String result = (num % 2 ==0) ? "Even" : "Odd";
        System.out.println("Number is "+ result);

        System.out.println();

        // Usage of If- Elseif Ladder
        System.out.println("Checking whether the number is Positive or Negative");
        int number = -22;
        if (number > 0)
        {
            System.out.println("Number "+ number +" is Positive");
        }
        else if (number < 0)
        {
            System.out.println("Number "+ number +" is Negative");   
        }
        else
        {
            System.out.println("Number "+ number +" is Zero");
        }

        System.out.println();

        //Usage of Nested-If Statement
        System.out.println("Checking whether Student has Passed or Failed");
        int percentage = 65;
        System.out.println("Percentage : " + percentage);
        if (percentage > 50)
        {
            System.out.print("You have Passed");
            if (percentage > 75)
            {
                System.out.print(" with Distinction");
            }
            System.out.println();
        }
        else
        {
            System.out.println("You have Failed");
        }

        System.out.println();

        // Usage of Switch Statement
        System.out.println("Addition and Subtraction of Numbers");

        int num1 = 24;
        int num2 = 4;

        System.out.println("1.Addition \n2.Subtraction \nEnter your Choice:");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
                int sum = num1 + num2 ;
                System.out.println("Addition is "+ sum);
                break;

            case 2:
                int diff = num1 - num2 ;
                System.out.println("Subtraction is "+ diff);
                break;

            default:
                System.out.println("Wrong choice");
                break; 
        }

    }
}