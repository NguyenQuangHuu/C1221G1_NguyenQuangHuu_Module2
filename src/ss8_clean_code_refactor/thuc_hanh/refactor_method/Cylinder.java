package ss8_clean_code_refactor.thuc_hanh.refactor_method;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    public static double getBaseArea(int radius){
        return Math.PI*(Math.pow(radius,2));
    }

    public static double getPerimeter(int radius){
        return 2 * Math.PI * radius;
    }
}
