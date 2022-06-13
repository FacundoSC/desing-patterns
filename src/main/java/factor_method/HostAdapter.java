package factor_method;

public class HostAdapter implements IConexionApi{
    private String conexion;

    public HostAdapter(){
        System.out.println("inicializo variables para poder conectar a host Adapter");
    }
    @Override
    public void conectar() {
        System.out.println("conectar Host Adapter......");
        conexion = "Conexion Host Adapter ...";

    }

    public String marcarTarjeta(String tarjeta){
        // hacer algo con la conexion
        System.out.println("logica marcar tarjeta");
        return "00";
    }
}
