package abstract_factory;

import abstract_factory.Fanimal.IAnimal;
import abstract_factory.Fanimal.Pato;
import abstract_factory.Fanimal.Perro;
import abstract_factory.enumeration.Animal;

public class AnimalFactory implements AbstractFactory<IAnimal, Animal>{

     public IAnimal crear(Animal animal){
         IAnimal iAnimal = null;
         switch (animal){
             case PATO:  iAnimal =  new Pato();
                          break;
             default:  iAnimal= new Perro();
         }
         return iAnimal;
     }
}
