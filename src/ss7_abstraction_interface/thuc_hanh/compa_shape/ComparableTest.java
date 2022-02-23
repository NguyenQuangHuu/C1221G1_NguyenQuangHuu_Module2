package ss7_abstraction_interface.thuc_hanh.compa_shape;

import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle();
        comparableCircles[1] = new ComparableCircle(3.6);
        comparableCircles[2] = new ComparableCircle("purple",true,2);

        System.out.println("Pre-Sorted");
        for (ComparableCircle com:comparableCircles
             ) {
            System.out.println(com.toString());
        }
        Arrays.sort(comparableCircles);
        System.out.println("After-sorted:");
        for (ComparableCircle compa:comparableCircles
             ) {
            System.out.println(compa);
        }
    }
}
