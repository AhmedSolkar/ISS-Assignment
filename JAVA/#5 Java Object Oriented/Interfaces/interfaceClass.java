// Interface

// Implementing Interface
class interfaceClass implements Rectangle
{
    public String getName()
    {
        return "Rectangle";
    }
    
    public float calculateArea(float length, float breadth)
    {
        return length * breadth; 
    }
    
    public float calculatePerimeter(float length, float breadth)
    {
        return 2 * (length + breadth);
    }
    
    public static void main(String args[])
    {
        interfaceClass rectangleObj = new interfaceClass();
        System.out.println(rectangleObj.getName());
        System.out.println("Area: " + rectangleObj.calculateArea(20,30));
        System.out.println("Perimeter: " + rectangleObj.calculatePerimeter(20,30));
    }
}