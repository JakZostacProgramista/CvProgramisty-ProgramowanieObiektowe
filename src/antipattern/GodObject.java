package antipattern;

/**
 * Przykład klasy posiadające wiele odpowiedzialności.
 * Jest to złamanie zasady Single Responsibility Principle.
 */
@SuppressWarnings("ALL")
public class GodObject {

    /**
     * Zlicz sumę zamówienia.
     */
    public void calculateOrder() {
        // ...
    }

    /**
     * Przyjmij płatność
     */
    public void acceptPayment() {
        // ...
    }

    /**
     * Wydrukuj zamówienie jako pdf
     */
    public void exportToPdf() {
        // ...
    }

    /**
     * Wyślij e-mail do kupującego
     */
    public void sendEmailToBuyer() {
        // ...
    }


    // etc.
}
