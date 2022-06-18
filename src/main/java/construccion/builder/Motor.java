package construccion.builder;

/**
 * Caracteristica del auto.
 */
public class Motor {
    private final double VOLUMEN;
    private double kilometraje;
    private boolean estado;

    public Motor(double volumen, double kilometraje) {
        this.VOLUMEN = volumen;
        this.kilometraje = kilometraje;
    }

    public void on() {
        estado = true;
    }

    public void off() {
        estado = false;
    }

    public boolean estaEncendido() {
        return estado;
    }

    public void andar(double kilometraje) {
        if (estado) {
            this.kilometraje += kilometraje;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVOLUMEN() {
        return VOLUMEN;
    }

    public double getKilometraje() {
        return kilometraje;
    }
}