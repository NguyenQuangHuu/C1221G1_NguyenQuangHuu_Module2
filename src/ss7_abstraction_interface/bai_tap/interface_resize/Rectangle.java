package ss7_abstraction_interface.bai_tap.interface_resize;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double length = 2.0;

    public Rectangle(){

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.getWidth()*this.getLength();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                " "+ super.toString()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.setWidth(this.getWidth()*percent);
        this.setLength(this.getLength()*percent);
    }
}
