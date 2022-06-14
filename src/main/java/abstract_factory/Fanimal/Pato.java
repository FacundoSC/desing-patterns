package abstract_factory.Fanimal;

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
