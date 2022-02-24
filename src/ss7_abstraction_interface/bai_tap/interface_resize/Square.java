package ss7_abstraction_interface.bai_tap.interface_resize;

public class Square extends Rectangle implements Resizeable{
    private double side = 1.0;


    public Square(){

    }

    public Square(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.getSide()*this.getSide();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                " "+super.toString()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.setSide(1+this.getSide()*percent);
    }
}
