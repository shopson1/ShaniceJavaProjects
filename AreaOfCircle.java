/* Calculate the area of a circle
Hopson, Shanice
*/

public class AreaOfCircle
{
    public static void main (String[]args)
    {  
        
    //define the data we know
        final double PI = 3.14159;
    
//define other data we will use
    double radius;
    double area;
//give radius a value
    radius = 4.6;
//perform the calculation
    area = PI* radius* radius;
//output the results
    System.out.println("The area of the circle is" + area );
    }
}


