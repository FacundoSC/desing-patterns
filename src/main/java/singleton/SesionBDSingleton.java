package singleton;

public class SesionBDSingleton {
    private static SesionBDSingleton instancia;
    private SesionBDSingleton(){
        System.out.println("conexion a base de datos");
    }

    public static SesionBDSingleton getInstancia(){
        return (instancia == null)? instancia = new SesionBDSingleton() : instancia;
    }





}
