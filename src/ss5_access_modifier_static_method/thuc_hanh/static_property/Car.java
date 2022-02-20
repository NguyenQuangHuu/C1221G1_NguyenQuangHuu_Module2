package ss5_access_modifier_static_method.thuc_hanh.static_property;

public class Car {
    private String name;
    private String engine;
    private static int numbersOfCar;
    public Car(String name,String engine){
        this.name = name;
        this.engine=engine;
        numbersOfCar++;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public static int getNumbersOfCar() {
        return numbersOfCar;
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW","Fly 4.0");
        System.out.println(Car.getNumbersOfCar());
        Car car2 = new Car("Audi","Fly 4.0");
        System.out.println(Car.getNumbersOfCar());
        Car car3 = new Car("Mercedes","Fly 4.0");
        System.out.println(Car.getNumbersOfCar());
    }
}
