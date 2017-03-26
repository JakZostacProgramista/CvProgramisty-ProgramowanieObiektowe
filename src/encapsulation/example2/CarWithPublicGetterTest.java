package encapsulation.example2;


import encapsulation.car.Engine;

/**
 * Klasa w której testujemy naszą klasę {@link CarWithPublicGetter}
 */
public class CarWithPublicGetterTest {


    /**
     * Brak enkapsulacji sprawił, że udało nam się uruchomić samochód bez kluczyka.
     * Pole engine musi być prywatne! Musimy pozbyć się gettera.
     */
    public static void main(String[] args) {

        CarWithPublicGetter car = new CarWithPublicGetter(new Engine());
        car.getEngine().startEngine();
    }
}
