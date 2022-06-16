package protototype;

public class Prueba {
    public static void main(String[] args) {
      Auto auto = new Auto();
      auto.setMarca("Audio");
      Auto otro= (Auto) auto.clonar();

        System.out.println(auto);
        System.out.println(otro);
    }
}
