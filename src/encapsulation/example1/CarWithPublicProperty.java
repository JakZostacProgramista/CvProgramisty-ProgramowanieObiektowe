package encapsulation.example1;

import encapsulation.car.Engine;
import encapsulation.car.Key;

/**
 * Klasa samochód bez enkapsulacji.
 */
public class CarWithPublicProperty {

    /**
     * Stan wewnętrzny naszego obiektu.
     * !!! Stan wewnętrzny naszej klasy nie powinien być publiczny !!!
     */
    public Engine engine;

    /**
     * Publiczny konstruktor do utworzenia samochodu. To jest OK!
     */
    public CarWithPublicProperty(Engine engine) {
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

