package construccion.builder.v1;

/**
 * Caracteristica del auto.
 */
public class Motor {
    private final double volumen;
    private final double kilometraje;
    private final boolean estado;

    private Motor(MotorBuilder builder) {
        this.volumen = builder.volumen;
        this.kilometraje = builder.kilometraje;
        this.estado = builder.estado;

    }

    public static MotorBuilder builder() {
        return new MotorBuilder();
    }

    @Override
    public String toString() {
        return "Motor{" +
            "volumen=" + volumen +
            ", kilometraje=" + kilometraje +
            ", estado=" + estado +
            '}';
    }

    public static class MotorBuilder {
        private double volumen;
        private double kilometraje;
        private boolean estado;

        private MotorBuilder() {
        }

        public MotorBuilder kilometraje(double kilometraje) {
            this.kilometraje = kilometraje;
            return this;
        }

        public MotorBuilder volumen(double volumen) {
            this.volumen = volumen;
            return this;
        }

        public MotorBuilder estado(boolean estado) {
            this.estado = estado;
            return this;
        }

        public Motor build() {
            return new Motor(this);
        }
    }







}
