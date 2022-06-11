package prueba;

public class CreadorHostAdapter extends Creador{

    @Override
    public IConexionApi fabricarConexionAPI() {
        return new HostAdapter();
    }
}
