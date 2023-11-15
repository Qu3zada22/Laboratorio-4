public class Plan {
    private String nombre;
    private boolean premium;

    private Plan(String nombre, boolean premium) {
        this.nombre = nombre;
        this.premium = premium;
    }

    public static Plan BASE = new Plan("Base", false);
    public static Plan PREMIUM = new Plan("Premium", true);

    public boolean esPremium() {
        return premium;
    }

    public String toString() {
        return nombre;
    }
}
