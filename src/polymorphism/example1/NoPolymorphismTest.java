package polymorphism.example1;

import polymorphism.example1.vehicle.Bike;
import polymorphism.example1.vehicle.Car;
import polymorphism.example1.vehicle.Train;
import polymorphism.example2.vehicle.AbstractVehicle;

/**
 * Przykład braku polimorfizmu.
 */
public class NoPolymorphismTest {

    public static void main(String[] args) {

        Bike bike = new Bike();
        Car care = new Car();
        Train train = new Train();

        startVehicle(bike);
        startVehicle(care);
        startVehicle(train);
    }

    /**
     * W związku z tym, że klasy nie posiadają wspólnego rodzica ze wspólną metodą (jak w przypadku {@link AbstractVehicle}
     * to nie można zastosować polimorfizmu.
     */
    public static void startVehicle(Object vehicle) {

        if (vehicle instanceof Bike) {
            Bike bike = (Bike) vehicle;
            bike.go();

        } else if (vehicle instanceof Car) {
            Car car = (Car) vehicle;
            car.go();

        } else if (vehicle instanceof Train) {
            Train train = (Train) vehicle;
            train.go();
        }
    }
}
