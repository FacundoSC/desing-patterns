package prueba;

public   class FabricaConexionAPI {
    private IConexionApi iConexionApi;

    public IConexionApi fabricarConexionAPI(Api api) throws Exception {
        switch (api){
            case Z_CONNECT:  iConexionApi=new ZConect();
                             break;
            case  HOST_ADAPTER:
                        iConexionApi =new HostAdapter();
            default:
                 throw  new Exception(" no esta instanciado esa api");

        }
         return  iConexionApi;
    }
}
