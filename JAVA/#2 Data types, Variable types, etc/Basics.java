// Basic Data types, Variable types, Modifier types, Final keyword and Constructor

public class Basics
{
    // Instance Local Variable
    protected String msg;

    // Declaring a Private Static Variable
    private static int age;

    // Declaring a Final Constant Variable
    public static final String role = "Developer";

    // Declaring a Constructor for Class Basics
    public Basics(String name)
    {
        msg = name;
    }    

    public void setMsg()
    {
        String privateMsg = "Hello, My name is ";
        msg = privateMsg + msg;
    }

    public void printMsg()
    {
        System.out.println(msg);
    }



    public static void main(String args[])
    {   
        // Local Variables
        // Declaring Byte Variable
        byte byteValue = 10;

        // Declaring Short Variable
        short shortValue = 1000;

        // Declaring Integer Variable
        int intValue = 2048;

        // Declaring Long Variable
        long longValue = 29000L;

        // Declaring Float Variable
        float floatValue = 233.22f;

        // Declaring Double Variable
        double doubleValue = 2900.20;

        // Declaring Boolean Variable
        boolean booleanValue = true;

        // Declaring Character Variable
        char charValue = 'A';

        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Integer Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Boolean Value: " + booleanValue);
        System.out.println("Character Value: " + charValue);

        // Declaring a reference Variable
        Basics obj1 = new Basics("Ahmed");

        // Assigning Value to static variable
        age = 21;
        obj1.setMsg();
        obj1.printMsg();        
        System.out.println("My Age is " + age);
        System.out.println("My Role is " + role);

    }
}