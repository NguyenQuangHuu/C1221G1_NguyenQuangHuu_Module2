package ss6_ke_thua.thuc_hanh.hinh_hoc;

public class Shape {
    private String color;

    private boolean filled;

    public Shape(){
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
//    public StopWatch(){ this.startTime = new Date().getTime()}

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
