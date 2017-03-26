package polymorphism.example2.vehicle;

public class Bike extends AbstractVehicle {

    @Override
    public void go() {
        System.out.println("Wsiadłem na rower i ruszam!");
    }
}
