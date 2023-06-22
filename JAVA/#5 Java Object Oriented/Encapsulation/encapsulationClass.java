//Encapsulation

// Class to test the Encapsulated Class
public class encapsulationClass
{
    public static void main(String args[])
    {
        // Creating Instance Object of Employee 
        Employee empObj = new Employee();
        empObj.setName("Ahmed");
        empObj.setAge(21);
        System.out.println("Name: " + empObj.getName() + " \nAge: " + empObj.getAge());    
    }    
}