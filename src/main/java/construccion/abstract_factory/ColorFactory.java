package construccion.abstract_factory;

import construccion.abstract_factory.FColor.Azul;
import construccion.abstract_factory.enumeration.Color;
import construccion.abstract_factory.FColor.IColor;
import construccion.abstract_factory.FColor.Rojo;

public class ColorFactory implements AbstractFactory<IColor, Color> {
    @Override
    public IColor crear(Color color) {
        IColor iColor = null;
        switch (color){
            case ROJO: iColor = new Rojo();
                        break;
            default:   iColor = new Azul();
        }
        return iColor;
    }
}
