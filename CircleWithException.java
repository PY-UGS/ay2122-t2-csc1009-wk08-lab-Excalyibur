import java.lang.Math;


public class CircleWithException {
    private double radius;
    private double area;
    private double diameter;

    public CircleWithException(){

    }

    public CircleWithException(double radius, double area, double diameter) throws Exception, IllegalArgumentException {
        setRadius(radius);
        getRadius();
        getArea();
        getDiameter();
    }

    public void setRadius(double radius) throws IllegalArgumentException {
            if(radius<0) throw new IllegalArgumentException("Please enter a positive number!");
            this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() throws Exception {
        area = radius*radius*Math.PI;
        if (area>1000) throw new Exception("Area is bigger than 1000!");
        return area;
    }

    public double getDiameter() {
        diameter=radius+radius;
        return diameter;
    }

}
