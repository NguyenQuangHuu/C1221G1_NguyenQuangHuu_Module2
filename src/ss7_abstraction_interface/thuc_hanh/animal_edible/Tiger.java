package ss7_abstraction_interface.thuc_hanh.animal_edible;

public class Tiger extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Tiger: Roarrr";
    }

    @Override
    public String howToEat() {
        return "Delicious";
    }
}
