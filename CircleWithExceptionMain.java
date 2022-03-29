import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleWithExceptionMain {
    public static void main(String[] args) {
        double radius;
        CircleWithException Circle = new CircleWithException();
        Scanner S = new Scanner(System.in);
        System.out.println("Enter circle radius:");
        try {
            radius = S.nextDouble();
            Circle.setRadius(radius);
            double area = Circle.getArea();
            System.out.println(area);
        }
        catch (IllegalArgumentException e){
            System.out.println("Caught "+e);
        }

        catch (Exception e) {
            System.out.println("Caught " + e);
        }
        finally {

        }
    }
}
