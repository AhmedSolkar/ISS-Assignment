// User Defined Excpetions along with throw and throws keyword

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// User Defined Exception to check whether a number is positive or negative
class signException extends Exception
{
    public signException(String str)
    {
        System.out.println(str);
    }
}

class userException
{
    // throws keyword is used to handle checked exceptions that occur at compile time
    public static void main(String args[]) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        try
        {
            // throw keyword is used to handle unchecked excpetions that occur at runtime
            int num = Integer.parseInt(br.readLine());
            if (num < 0)
                throw new signException("Number is Negative");
            else
                throw new signException("Number is Positive");
        }
        catch (signException se)
        {
            System.out.println(se);
        }        
        catch (Exception e)
        {
            System.out.println("Exception occured: " + e);
        }
    }
}