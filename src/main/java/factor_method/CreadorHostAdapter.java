package factor_method;

public class CreadorHostAdapter extends Creador{

    @Override
    public IConexionApi fabricarConexionAPI() {
        return new HostAdapter();
    }
}
