/*
Floating-point types can represent numbers that have fractional components. Type float is 32 bits wide and type double is 64 bits wide. Of the two, double is the most 
commonly one used. 

Use the Pythagorean theorem to find the length of the hypotenuse given the lengths of the two opposing sides. 

*/

class Hypot {
    public static void main(String args[]){
        double x, y, z;
        x = 3;
        y = 4;

        z =Math.sqrt(x*x + y*y);

        System.out.println("Hypotenuse is " +z);
    }
}
