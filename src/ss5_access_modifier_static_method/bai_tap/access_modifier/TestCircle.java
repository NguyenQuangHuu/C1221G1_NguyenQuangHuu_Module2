package ss5_access_modifier_static_method.bai_tap.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        //private không truy cập được vì không cùng cấp class;
        //protected truy cập được vì trong cùng package;
        //default truy cập được vì cùng package
        //public truy cập được

    }
}
