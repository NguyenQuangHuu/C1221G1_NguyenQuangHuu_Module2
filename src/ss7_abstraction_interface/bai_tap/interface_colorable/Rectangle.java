package ss7_abstraction_interface.bai_tap.interface_colorable;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double height = 2.0;


    public Rectangle() {

    }

    public Rectangle(String color){
        super(color);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", subclass = "+ super.toString()+
                '}';
    }

    public double getArea(){
        return this.getHeight()*this.getWidth();
    }
}