package construccion.builder;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class AutoBuilder implements Builder {
    private Tipo tipo;
    private int asientos;
    private Motor motor;
    private Transmission transmission;
    private ComputadoraTripulada computadoraTripulada;
    private GPSNavigator gpsNavigator;

    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }

    @Override
    public void setAsientos(int asientos){
        this.asientos = asientos;
    }

    @Override
    public void setMotor(Motor motor){
        this.motor = motor;
    }

    @Override
    public void setTransmission(Transmission transmission){
        this.transmission = transmission;
    }

    @Override
    public void setComputadoraTripulada(ComputadoraTripulada computadoraTripulada){
        this.computadoraTripulada = computadoraTripulada;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Auto getResult() {
        return new Auto(tipo, asientos, motor, transmission, computadoraTripulada, gpsNavigator);
    }
}