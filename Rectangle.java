/* A program to calculate the area and perimeter of a rectangle */
/*The program will have two methods one method for computing the area and another method to compute the perimeter*/

public class Rectangle{
    /* User defined methods can go here */

    //Declaring The Variables
    double length, width, area, perimeter;

    //Creating a method to compute the area 
    void computeArea(double length, double width){
        area = length * width;
        System.out.println("Area is: " + area);
    }

    //Creating a method to compute the perimeter
    void computePerimeter(double length, double width){
        perimeter =(length + width)*2;
        System.out.println("Perimeter is: " + perimeter);
    }

    public static void main(String[] args){
        // Creating an object of Rectangle class
        Rectangle recobj = new Rectangle();

        // Calling the methods using object
        recobj.computeArea(17, 23);
        recobj.computePerimeter(17, 23);
    }

}