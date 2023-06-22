//Method Overriding

//Creating a Super Class
class Shape
{
    // Defining a method to be overriden
    public void display()
    {
        System.out.println("Area of different Shapes");
    }
}


//Creating a Sub Class
class Rectangle extends Shape
{

    int length;
    int breadth;
    int area;

    void getdata (int len , int b)
    {
        length = len;
        breadth = b;
    }

    // Overriding method of Super Class
    public void display()
    {
        //Calling Super Class method using Super Keyword
        super.display();
        area = length * breadth;
        System.out.println("Area of Rectangle : " + area);
    }
}
class overriding
{
    public static void main(String args[])
    {
        // Creating Instance Object of Rectangle
        Rectangle obj1 = new Rectangle();
        obj1.getdata(20,30);
        //Calling overriden method
        obj1.display();
    }
}
