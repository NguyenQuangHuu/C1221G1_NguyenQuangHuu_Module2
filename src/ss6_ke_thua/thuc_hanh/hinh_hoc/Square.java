package ss6_ke_thua.thuc_hanh.hinh_hoc;

public class Square extends Rectangle{

    public Square(){
    }

    public Square(double side){
        super(side,side);
    }

    public Square(double side, String color, boolean filled){
        super(color,filled,side,side);
    }
    public double getSide(){
        return this.getWidth();
    }
    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }

    @Override
    public void setLength(double length) {
        this.setSide(length);
    }

    @Override
    public void setWidth(double width) {
        this.setSide(width);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + this.getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
