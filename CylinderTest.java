/******************************************************************************
 * Program Name: Cylinder
 * Programmers Name: Lamburt Alcantara
 * Program Description: Creation of two classes Cylinder class and CylinderTest
 *                          class.  CylinderTest class tests various methods
 *                          within the Cylinder class.
 ******************************************************************************/

package cylinder;


public class CylinderTest {


    public static void main(String[] args) 
    {
        // Calling Cylinder class and creating new Cylinder object & setting
        //     height & radius values.
        Cylinder cylinder = new Cylinder(3,5);
        
        System.out.println("Radius = " + cylinder.getRadius());
        System.out.println("Height = " + cylinder.getHeight());
        System.out.println("Volume = " + cylinder.volume());
        
        // Passing new arguments for radius and height.
        cylinder.setRadius(4);
        cylinder.setHeight(5);
        
        System.out.println("New radius = " + cylinder.getRadius());
        System.out.println("New height = " + cylinder.getHeight());
        System.out.println("Volume = " + cylinder.volume());
    }

}
