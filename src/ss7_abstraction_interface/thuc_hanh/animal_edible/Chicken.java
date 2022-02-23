package ss7_abstraction_interface.thuc_hanh.animal_edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken : O o o";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
