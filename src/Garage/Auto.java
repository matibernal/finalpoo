package Garage;

public class Auto extends Vehiculo{

    private int cantidadDePuertas;

    public Auto(String motor, int cantidadDeCombustible, String patente, String marca, int ruedas, int km, int cantidadDePuertas) {
        super(motor, cantidadDeCombustible, patente, marca, ruedas, km);
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }
}
