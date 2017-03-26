package encapsulation.example1;


import encapsulation.car.Engine;

/**
 * Klasa w której testujemy naszą klasę {@link CarWithPublicProperty}
 */
public class CarWithPublicPropertyTest {


    /**
     * Brak enkapsulacji sprawił, że udało nam się uruchomić samochód bez kluczyka.
     * Pole engine musi być prywatne!
     */
    public static void main(String[] args) {

        CarWithPublicProperty car = new CarWithPublicProperty(new Engine());
        car.engine.startEngine();
    }
}
