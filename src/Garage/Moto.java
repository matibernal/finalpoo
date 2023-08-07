package Garage;

public class Moto extends Vehiculo{

    private int cilindrada;

    public Moto(String motor, int cantidadDeCombustible, String patente, String marca, int ruedas, int km, int cilindrada) {
        super(motor, cantidadDeCombustible, patente, marca, ruedas, km);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
