// Polymoprhism (Method Overriding)

class Shape
{
    private String shapeName;

    public Shape(String name)
    {
        this.shapeName = name;
    }

    public String getName()
    {
        return shapeName;
    }

    public void display()
    {
        System.out.println("Shape is: " + shapeName);
    }
    
}

class Rectangle extends Shape
{
    private int length;
    private int breadth;
    private int area;

    Rectangle(String shapeName , int len , int bre)
    {
        super(shapeName);
        calculateArea( len, bre);
    }

    public void calculateArea(int len, int bre)
    {
        area = len * bre;
    }

    public void display()
    {
        System.out.println("Within display method of Rectangle class");
        // Calling Method of Super Class Shape
        System.out.println(getName() + "\nArea of Rectangle: "+ area);
    }
}

class polymorphismOverriding
{
    public static void main(String args[])
    {
        // Shape refernce but Rectangle Object
        Shape obj1 = new Rectangle("Rectangle" , 20 , 30);
        obj1.display();
    }
}