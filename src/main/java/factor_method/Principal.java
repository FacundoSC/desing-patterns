package factor_method;

public class Principal {
    public static void main(String[] args) throws Exception {
            FabricaConexionAPI f = new FabricaConexionAPI();
            var l  =f.fabricarConexionAPI(Api.HOST_ADAPTER);
            l.conectar();
            l.marcarTarjeta("232");
    }
}
