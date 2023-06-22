//Hierarchical Inheritance

//Super Class
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
    // Display Method of Sub Class developmentTeam
    void printMsg()
    {
        System.out.println("Development Team");
    }
}

class marketingTeam extends ISS
{
    // Display Method of Sub Class marketingTeam
    void printMsg()
    {
        System.out.println("Marketing Team");
    }
}



class hierarchicalInheritance
{
    public static void main(String args[])
    {
        //Creating Instance Object for Sub Class developmentTeam
        developmentTeam devObj = new developmentTeam();
        devObj.welcomeMsg();
        devObj.printMsg();

        //Creating Instance Object for Sub Class marketingTeam
        marketingTeam marketObj = new marketingTeam();
        marketObj.welcomeMsg();
        marketObj.printMsg();

        System.out.println("devObj is instance of developmentTeam: " + (devObj instanceof developmentTeam));
        System.out.println("marketObj is instance of marketingTeam: " + (marketObj instanceof marketingTeam));
    }

}