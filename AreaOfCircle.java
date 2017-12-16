/* Calculate the area of a circle
Hopson, S.
*/

    public class AreaOfCircle
    {
    public static void main (String[]args)
    {  
        final double PI = 3.14159;
        double radius;
        double area;
        radius = 4.6;

        //perform the calculation
        area = PI* radius* radius;
        
        //output the results
        System.out.println("The area of the circle is" + area );
    }
}


