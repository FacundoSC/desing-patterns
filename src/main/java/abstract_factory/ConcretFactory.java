package abstract_factory;

import abstract_factory.enumeration.Factory;

public class ConcretFactory {
    private static AbstractFactory a;
    public static AbstractFactory getFactory(Factory factory){
        switch (factory){
            case COLOR: a = new ColorFactory();
                        break;
            default:  a = new AnimalFactory();
        }
      return a;
    }
}
