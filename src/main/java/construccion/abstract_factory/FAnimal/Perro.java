package construccion.abstract_factory.FAnimal;

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
