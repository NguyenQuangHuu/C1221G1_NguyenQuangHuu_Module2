package ss7_abstraction_interface.thuc_hanh.coparator_circle;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {

        Circle[] circleList = new Circle[3];
        Circle circle = new Circle(3);
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2);
        circleList[0] = circle;
        circleList[1] = circle1;
        circleList[2] = circle2;
        for (Circle c: circleList
             ) {
            System.out.println(c);
        }
        ComparatorCircle comparatorCircle = new ComparatorCircle();
        Arrays.sort(circleList,comparatorCircle);
        for (Circle c: circleList
        ) {
            System.out.println(c);
        }
    }
}
