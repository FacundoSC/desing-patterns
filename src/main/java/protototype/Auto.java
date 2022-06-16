package protototype;

public class Auto implements IAuto{
    private String marca;
    private String modelo;
    private String color;

    public  Auto(){
        this.color = "negro";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public IAuto clonar() {
        IAuto a = null;
        try {
            a= (IAuto) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return a;
    }
}
