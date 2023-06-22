// Single Inheritance

// Super Class
class superClass {
    int age;

    // superClass Constructor 
    superClass(int age){
        this.age = age;
    }
    // Display method of superClass
    public void display() {
        System.out.println("Display method of superClass");    
    }
}

// Sub Class
class subClass extends superClass{
    int age = 30;

    subClass(int age){
        super(age);
    }

    // Display method of subClass
    public void display()
    {
        // Invoking the display() method of superclass
        super.display();

        // printing the value of variable age of superClass
        System.out.println("Value of the variable age in superClass:"+ super.age);

        System.out.println("Display method of subClass");
        System.out.println("Value of the variable age in subClass:"+ age);
    }
}


public class singleInheritance 
{      
   public static void main(String args[]) 
   {
        // Instantiating Sub Class
        subClass subClassObject = new subClass(21);

        // Invoking the display() method of Sub Class
        subClassObject.display();  
   }
}