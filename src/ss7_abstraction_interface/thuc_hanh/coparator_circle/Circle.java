package ss7_abstraction_interface.thuc_hanh.coparator_circle;

public class Circle {
    private double radius=1.0;
    public Circle(){

    }
    public Circle(double r){
        this.radius = r;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
