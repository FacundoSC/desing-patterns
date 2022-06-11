package principal;

import prueba.CreadorHostAdapter;
import prueba.IConexionApi;

public class Principal {

    public static void main(String[] args) {
        /*
      for (int i = 0 ; i<=10; i++) {
          SesionBDSingleton instancia = SesionBDSingleton.getInstancia();
          System.out.println(instancia);
      } */

        CreadorHostAdapter creadorHostAdapter = new CreadorHostAdapter();
        IConexionApi iConexionApi = creadorHostAdapter.fabricarConexionAPI();
        iConexionApi.conectar();
        String s = iConexionApi.marcarTarjeta("235");
        System.out.println(s);


    }
}