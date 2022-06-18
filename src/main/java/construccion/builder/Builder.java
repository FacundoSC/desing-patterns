package construccion.builder;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setTipo(Tipo tipo);
    void setAsientos(int asientos);
    void setMotor(Motor motor);
    void setTransmission(Transmission transmission);
    void setComputadoraTripulada(ComputadoraTripulada computadoraTripulada);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}