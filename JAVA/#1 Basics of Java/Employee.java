// Basics of Java

public class Employee
{
    public String empName; // public instance
    String empDeptName; // default instance
    private int empAge; // private instance

    // Constructor to initialize instance variable
    public Employee(String name)
    {
        empName = name;
    }

    // Method to initialize an instance variable
    public void setDept(String dept)
    {
        empDeptName = dept;
    }

    // Method to initialize instance variable
    public void setAge(int age)
    {
        empAge = age;
    }

    // Method to display employee details
    public void printEmpDetails()
    {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Department: " + empDeptName);
        System.out.println("Employee Age: " + empAge);
    }

    public static void main(String args[])
    {
        // Creating object of Class Employee
        Employee emp1 = new Employee("Ahmed");
        emp1.setAge(21);
        emp1.setDept("Development Team");
        emp1.printEmpDetails();
    }
}
