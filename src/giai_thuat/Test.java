package giai_thuat;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer("Yamaha");
        Manufacturer manufacturer1 = new Manufacturer("Yamaha");
        Manufacturer[] manufacturers = {manufacturer,manufacturer1};

        System.out.println(manufacturer.getName());
    }
}
