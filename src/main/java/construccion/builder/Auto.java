package construccion.builder;



/**
 * Auto es la clase producto.
 */
public class Auto{
    private final Tipo TIPO;
    private final int ASIENTOS;
    private final Motor MOTOR;
    private final Transmission TRANSMISSION;
    private final ComputadoraTripulada COMPUTADORA_TRIPULADA;
    private final GPSNavigator GPS_NAVIGATOR;
    private double fuel = 0;

    public Auto(Tipo tipo, int asientos, Motor motor, Transmission transmission,
                ComputadoraTripulada computadoraTripulada, GPSNavigator gpsNavigator) {
        this.TIPO = tipo;
        this.ASIENTOS = asientos;
        this.MOTOR = motor;
        this.TRANSMISSION = transmission;
        this.COMPUTADORA_TRIPULADA = computadoraTripulada;
        if (this.COMPUTADORA_TRIPULADA != null) {
            this.COMPUTADORA_TRIPULADA.setCar(this);
        }
        this.GPS_NAVIGATOR = gpsNavigator;
    }

    public Tipo getTipo() {
        return TIPO;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getASIENTOS() {
        return ASIENTOS;
    }

    public Motor getMOTOR() {
        return MOTOR;
    }

    public Transmission getTRANSMISSION() {
        return TRANSMISSION;
    }

    public ComputadoraTripulada getTripComputer() {
        return COMPUTADORA_TRIPULADA;
    }

    public GPSNavigator getGPS_NAVIGATOR() {
        return GPS_NAVIGATOR;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "tipo=" + TIPO +
                ", asientos=" + ASIENTOS +
                ", motor=" + MOTOR +
                ", transmission=" + TRANSMISSION +
                ", computadoraTripulada=" + COMPUTADORA_TRIPULADA +
                ", gpsNavigator=" + GPS_NAVIGATOR +
                ", fuel=" + fuel +
                '}';
    }
}