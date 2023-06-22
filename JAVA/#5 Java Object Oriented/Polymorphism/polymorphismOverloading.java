// Method Overloading

class Addition
{
    // Method to be overloaded
    static int sum(int num1 , int num2)
    {
        return num1 + num2;
    }

    // Same method with different number of Arguments
    static int sum(int num1 , int num2 , int num3)
    {
        return num1 + num2 + num3;
    }

    // Same method with Arguments of different data type
    static double sum(double num1 , double num2)
    {
        return num1 + num2;
    }

}

class polymorphismOverloading
{
    public static void main(String args[])
    {
        System.out.println("Addition of Two Integer Numbers" + Addition.sum(10,20));
        System.out.println("Addition of Three Integer Numbers" + Addition.sum(10,20,30));
        System.out.println("Addition of Two Double Numbers" + Addition.sum(10.1,20.12));
    }
}