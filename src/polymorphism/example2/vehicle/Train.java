package polymorphism.example2.vehicle;

public class Train extends AbstractVehicle {

    @Override
    public void go() {
        System.out.println("Pociąg wyruszył ze stacji!");
    }
}
