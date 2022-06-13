package factor_method;

public class CreadorZConect extends Creador{
    @Override
    public IConexionApi fabricarConexionAPI() {
        return new ZConect();
    }
}
