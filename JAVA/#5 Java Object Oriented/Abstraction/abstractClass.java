//Abstract Class and Methods

// Creating an abstract class with abstract and non-abstract methods
abstract class Car
{
    Car()
    {
        System.out.println("Car Class is been created");
    }
    abstract void run();
    void countryOfOrigin()
    {
        System.out.println("Company was founded in Czech Republic");
    }
}

// Creating a Sub Class which inherits Abstract Class
class Skoda extends Car
{
    void run()
    {
        System.out.println("Your Skoda is running safely.");
    }
}

// Creating a Class which calls abstract and non-abstract methods
class abstractClass
{
    public static void main(String args[])
    {
        Car carObj = new Skoda();
        carObj.run();
        carObj.countryOfOrigin();
    }
}


