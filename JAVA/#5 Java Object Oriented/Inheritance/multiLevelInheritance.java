// Multiple Inheritance

// Super super class
class ISS
{
    // Display Method of Super Class for developmentTeam
    void welcomeMsg()
    {
        System.out.println("Welcome to ISS Governance");
    }
}
class developmentTeam extends ISS
{
    // Display Method of Super Class for developer
    void printMsg()
    {
        System.out.println("Development Team");
    }
}

class developer extends developmentTeam
{
    // Display Method of Sub Class
    void printName()
    {
        System.out.println("Developer Name : Ahmed Solkar");
    }
} 

class multiLevelInheritance
{
    public static void main(String args[])
    {
        developer obj1 = new developer();
        obj1.welcomeMsg();
        obj1.printMsg();
        obj1.printName();
    }
}
