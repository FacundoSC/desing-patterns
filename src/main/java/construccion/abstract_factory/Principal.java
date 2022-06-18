package construccion.abstract_factory;

import construccion.abstract_factory.FColor.IColor;
import construccion.abstract_factory.FAnimal.IAnimal;
import construccion.abstract_factory.enumeration.Animal;
import construccion.abstract_factory.enumeration.Color;
import construccion.abstract_factory.enumeration.Factory;

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
