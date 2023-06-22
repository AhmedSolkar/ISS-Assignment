import java.util.*;

// Strings and Arrays in Java

public class stringAndArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        stringAndArray obj1 = new stringAndArray();
        //
        // STRINGS
        //

        System.out.println("=== STRINGS ===");
        
        // Creating String from an Array of Characters using new keyword
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println(helloString);
        
        // Creating String directly without new keyword
        String helloMessage = "Hello Everyone!";
        System.out.println(helloMessage);
        System.out.println("Length of Message: " + helloMessage.length());
        
        // Concatenating Strings
        String firstName = "Ahmed";
        String lastName = "Solkar";
        System.out.println("Concatenating Strings:");
        System.out.println("Name is " + firstName.concat(lastName));

        // Formating String
        System.out.printf("%s" + 
                          "My Name is %s", helloMessage, firstName.concat(lastName));
        
        // Finding the character at a specified index
        System.out.println("\nString: " + helloMessage + "\nCharacter at index 7: " + helloMessage.charAt(7));

        // Finding the Index of Character e
        System.out.println("Index: " + helloMessage.indexOf('e'));
        
        // Replacing e with i
        System.out.println(helloMessage.replace('e','i'));

        // Substring of a String
        System.out.println(helloMessage.substring(6));

        // Checking if two Strings are equal
        System.out.println("Are " + firstName + " and " + lastName + " equal? " + firstName.equals(lastName));
        System.out.println();

        //
        // ARRAYS
        //

        System.out.println("=== ARRAYS ===");

        //Creating an Array
        int[] numArray = new int[5];
        System.out.println("Enter Array Elements");
        for (int i = 0 ; i < 5 ; i++)
        {
            numArray[i] = sc.nextInt();
        }
        
        // Array Length 
        
        int arrayLength = numArray.length;
        
        System.out.println("Printing Array Elements");
        for (int i = 0 ; i < arrayLength ; i++)
        {
            System.out.print(numArray[i] + " ");
        }
        
        System.out.println("\n");

        // Defining an Array

        int[] intArray = {12,34,56,28,90};
        
        // Printing Array using forEach Loop
        System.out.println("Printing Defined Array");
        for (int ind : intArray)
        {
            System.out.print(ind + " ");
        } 
        System.out.println("\n");

        // Passing and Returning an Array from Method
        System.out.println("Reversing an Array");
        int[] resultArray = obj1.reversal(intArray);
        for (int i = 0 ; i < resultArray.length ; i++)
        {
            System.out.print(resultArray[i] + " ");
        }
        
        System.out.println("\n");
        
        //Finding index of an Array Element Using BinarySearch method
        System.out.println("Finding index of an Array Element Using BinarySearch");
        int num = 56 ;
        int index = Arrays.binarySearch(intArray, num);
        System.out.println(num + " found at index "+ index);

            
    }

    // Passing and Returning an Array from Method
    public static int[] reversal (int[] arr)
    {
        int[] result = new int[arr.length];

        for (int i = 0 , j = result.length - 1 ; i < arr.length ; i++ , j--)
        {
            result[j] = arr[i];
        }
        return result;
    }

}