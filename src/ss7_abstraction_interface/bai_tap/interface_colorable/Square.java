package ss7_abstraction_interface.bai_tap.interface_colorable;

public class Square extends Rectangle implements IColorable{
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }



    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return this.side * this.side;
    }

    public String toString(){
        return "{Square : "+super.getColor()+", side = "+this.getSide()+"}";
    }

    @Override
    public void howToColor() {
        if(!this.getColor().equals("black")){
            System.out.println("Color all four sides");
        }
    }
}
