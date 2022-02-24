package ss7_abstraction_interface.bai_tap.interface_resize;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*(Math.pow(radius,2));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " " +
                super.toString()+ " "
                ;
    }

    @Override
    public void resize(double percent) {
        this.setRadius(this.getRadius()*(1+percent));
    }
}
