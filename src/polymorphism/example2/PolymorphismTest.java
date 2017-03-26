package polymorphism.example2;

import polymorphism.example2.vehicle.AbstractVehicle;
import polymorphism.example2.vehicle.Bike;
import polymorphism.example2.vehicle.Car;
import polymorphism.example2.vehicle.Train;

/**
 * Przykład zastosowania polimorfizmu.
 */
public class PolymorphismTest {

    public static void main(String[] args) {

        AbstractVehicle bike = new Bike();
        AbstractVehicle care = new Car();
        AbstractVehicle train = new Train();

        startVehicle(bike);
        startVehicle(care);
        startVehicle(train);
    }

    /**
     * Ta metoda nie wie nic o implementacjach klasy bazowej {@link AbstractVehicle}
     * Polimorfizm oznacza wiele form. Pod zmienną vehicle może kryć się wiele form.
     * Może to być {@link Bike}, {@link Car}, czy {@link Train}, a także implementacje
     * które jeszcze nie powstały! Jest to furtka do kolejnej cennej zasady Open/Closed
     * principle.
     */
    public static void startVehicle(AbstractVehicle vehicle) {
        vehicle.go();
    }
}

