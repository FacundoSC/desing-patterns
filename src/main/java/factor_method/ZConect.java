package factor_method;

public class ZConect implements IConexionApi {
    private String conexion;

    public ZConect(){
        System.out.println("inicializo variables para poder conectar a zconect");
    }

    public void conectar(){
        System.out.println("conectar zconect......");
        conexion = "Conexion zConect ...";
    }



    public String marcarTarjeta(String tarjeta){
        // hacer algo con la conexion
        System.out.println("logica marcar tarjeta");
         return "00";
    }
}
