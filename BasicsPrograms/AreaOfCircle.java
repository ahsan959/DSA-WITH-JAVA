package BasicsPrograms;

public class AreaOfCircle {
    public static void main(String[] args) {
        AreaOfCircle.DisplayArea();

    }

    public static double DisplayArea() {
        // Farmule = A = pi r^2

        double area;

        int r = 12;

        area = 3.14 * r * 2;

        System.out.println("Area of the Circule is : " + area);

        return area;

    }

}
