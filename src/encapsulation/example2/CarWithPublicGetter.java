package encapsulation.example2;

import encapsulation.car.Engine;
import encapsulation.car.Key;

/**
 * Klasa samochód bez enkapsulacji.
 */
public class CarWithPublicGetter {

    /**
     * Stan wewnętrzny naszego obiektu.
     * Stan wewnętrzny naszej klasy powinien być i jest prywatny. Tym razem jest OK!
     */
    private Engine engine;

    /**
     * Publiczny konstruktor do utworzenia samochodu. To jest OK!
     */
    public CarWithPublicGetter(Engine engine) {
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

    /**
     * Publiczny getter, który ujawnia nasze szczegóły implementacji
     * !!! Stan wewnętrzny naszej klasy nie powinien być publiczny !!!
     */
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
