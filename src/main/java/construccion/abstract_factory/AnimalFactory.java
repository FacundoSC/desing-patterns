package construccion.abstract_factory;

import construccion.abstract_factory.FAnimal.IAnimal;
import construccion.abstract_factory.FAnimal.Pato;
import construccion.abstract_factory.FAnimal.Perro;
import construccion.abstract_factory.enumeration.Animal;

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
