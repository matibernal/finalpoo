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

    public String mostrarDetalles(){
        StringBuilder detalles = new StringBuilder();
        detalles.append("Marca: ").append(getMarca())
                .append("\nCantidad de combustible: ").append(getCantidadDeCombustible())
                .append("\nPatente: ").append(getPatente())
                .append("\nKM: ").append(getKm())
                .append("\nCantidad de puertas: ").append(getCantidadDePuertas());

        return detalles.toString();
    }
}
