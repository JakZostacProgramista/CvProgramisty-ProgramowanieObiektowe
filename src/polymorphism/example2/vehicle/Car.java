package polymorphism.example2.vehicle;

public class Car extends AbstractVehicle {

    @Override
    public void go() {
        System.out.println("Odpaliłem samochód i wyjechałem z garażu!");
    }
}
