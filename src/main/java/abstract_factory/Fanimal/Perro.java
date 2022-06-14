package abstract_factory.Fanimal;

public class Perro implements IAnimal{
    @Override
    public String getTipo() {
        return "Canino";
    }

    @Override
    public String makeSound() {
        return "ladrar";
    }
}
