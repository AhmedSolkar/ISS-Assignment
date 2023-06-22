// Exceptions

class exceptionsTest 
{
    public static void main(String args[]) 
    {
        try 
        {
            // Divide by 0 exception
            int divideByZero = 21 / 0;
            // if exception occurs this will be skipped
            System.out.println("Try block");
        }
        // Catch block
        catch (ArithmeticException e) 
        {
            System.out.println("ArithmeticException: " + e.getMessage());
        } 
        finally 
        {
            // Always executes
            System.out.println("Finally Block");
        }
    }
}