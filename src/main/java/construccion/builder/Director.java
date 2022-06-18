package construccion.builder;

/**
 * La clase directora define el orgen del los pasos para la construccion del producto.
 * funciona como el objeto constructor
 * como usa la interfaz builder no sabes que producto esta construyendo.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setTipo(Tipo.DEPORTIVO);
        builder.setAsientos(2);
        builder.setMotor(new Motor(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setComputadoraTripulada(new ComputadoraTripulada());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructorAutoFamiliar(Builder builder) {
        builder.setTipo(Tipo.FAMILIAR);
        builder.setAsientos(4);
        builder.setMotor(new Motor(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setComputadoraTripulada(new ComputadoraTripulada());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setTipo(Tipo.SUV);
        builder.setAsientos(4);
        builder.setMotor(new Motor(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}