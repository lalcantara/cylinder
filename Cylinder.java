package cylinder;

public class Cylinder 
{
    private double radius;
    private double height;
    
    // Constructor
    public Cylinder(double r, double h)
    {
        radius = r;
        height = h;
    }
    
    // setRadius method
    public void setRadius(double r)
    {
        radius = r;
    }
    
    // setHeight method
    public void setHeight(double h)
    {
        height = h;
    }
    
    // getRadius method
    public double getRadius()
    {
        return radius;
    }
    
    // getHeight method
    public double getHeight()
    {
        return height;
    }
    
    // volume method
    public double volume()
    {
        return radius * radius * height * Math.PI;
    }
}
