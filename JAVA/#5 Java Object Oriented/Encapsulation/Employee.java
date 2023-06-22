// Encapsulation

public class Employee
{
    // Variables declared as private for data hiding
    private String empName;
    private int empAge;
    
    // Only Methods can set and get the values of variables
    public void setName(String name)
    {
        empName = name;
    }
    
    public void setAge(int age)
    {
        empAge = age;
    }

    public String getName()
    {
        return empName;
    }
    
    public int getAge()
    {
        return empAge;
    }   
}