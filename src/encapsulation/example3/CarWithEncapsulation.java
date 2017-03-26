package encapsulation.example3;

import encapsulation.car.Engine;
import encapsulation.car.Key;

/**
 * Klasa samochód z poprawną enkapsulacją.
 */
public class CarWithEncapsulation {

    /**
     * Stan wewnętrzny naszego obiektu.
     * Stan wewnętrzny naszej klasy powinien być i jest prywatny. Tym razem jest OK!
     */
    private Engine engine;

    /**
     * Publiczny konstruktor do utworzenia samochodu. To jest OK!
     */
    public CarWithEncapsulation(Engine engine) {
        this.engine = engine;
    }

    /**
     * Aby uruchomić samochód należy posiadać pasujący kluczyk (uproszczona implementacja).
     */
    public void startCar(Key key) {
        if (key != null) {
            engine.startEngine();
        }
    }
}
