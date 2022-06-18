package construccion.abstract_factory;

import construccion.abstract_factory.enumeration.Factory;

public class ConcretFactory {
    public static AbstractFactory getFactory(Factory factory){
     AbstractFactory a = null;
        switch (factory){
            case COLOR: a = new ColorFactory();
                        break;
            default:  a = new AnimalFactory();
        }
      return a;
    }
}
