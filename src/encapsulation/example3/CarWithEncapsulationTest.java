package encapsulation.example3;

import encapsulation.car.Engine;
import encapsulation.car.Key;
import encapsulation.example1.CarWithPublicProperty;

/**
 * Klasa w której testujemy naszą klasę {@link CarWithPublicProperty}
 */
public class CarWithEncapsulationTest {

    /**
     * Poprawna enkapsulacja sprawiła, że NIE udało nam się uruchomić samochodu bez kluczyka.
     * Pole engine musi być prywatne! Musimy pozbyć się gettera.
     */
    public static void main(String[] args) {

        CarWithEncapsulation car = new CarWithEncapsulation(new Engine());
        car.startCar(new Key());
    }
}
