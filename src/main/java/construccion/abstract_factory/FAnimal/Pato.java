package construccion.abstract_factory.FAnimal;

public class Pato implements  IAnimal{
    @Override
    public String getTipo() {
        return  "ave";
    }

    @Override
    public String makeSound() {
        return "graznar";
    }
}
