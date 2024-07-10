public class RectangleMethods {
    double length, width, area, perimeter;

    // Method to compute area
    double computeArea(double length, double width) {
        area = length * width;
        return area;
    }

    // Method to compute perimeter
    double computePerimeter(double length, double width) {
        perimeter = (length + width) * 2;
        return perimeter;
    }

    public static void main(String[] args) {
        // Creating an object of RectangleMethods class
        RectangleMethods recobj = new RectangleMethods();

        // Calling the methods using object
        double returnedArea = recobj.computeArea(16, 27);
        double returnedPerimeter = recobj.computePerimeter(16, 27);

        // Printing the results
        System.out.println("Area is: " + returnedArea);
        System.out.println("Perimeter is: " + returnedPerimeter);
    }
}
