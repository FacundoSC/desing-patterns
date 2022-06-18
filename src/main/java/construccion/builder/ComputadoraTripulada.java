package construccion.builder;

public class ComputadoraTripulada {

    private Auto auto;

    public void setCar(Auto auto) {
        this.auto = auto;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + auto.getFuel());
    }

    public void showStatus() {
        if (this.auto.getMOTOR().estaEncendido()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}