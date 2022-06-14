package abstract_factory;

import abstract_factory.FColor.IColor;
import abstract_factory.Fanimal.IAnimal;
import abstract_factory.enumeration.Animal;
import abstract_factory.enumeration.Color;
import abstract_factory.enumeration.Factory;

public class Principal {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = ConcretFactory.getFactory(Factory.ANIMAL);
        IAnimal p = (IAnimal) abstractFactory.crear(Animal.PATO);
        System.out.println( p.getTipo());


        abstractFactory = ConcretFactory.getFactory(Factory.COLOR);
        IColor crear = (IColor) abstractFactory.crear(Color.AZUL);
        System.out.println(crear.getColor());



    }
}
