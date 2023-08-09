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

    public String mostrarDetalles(){
        StringBuilder detalles = new StringBuilder();
        detalles.append("Marca: ").append(getMarca())
                .append("\nCantidad de combustible: ").append(getCantidadDeCombustible())
                .append("\nPatente: ").append(getPatente())
                .append("\nKM: ").append(getKm())
                .append("\nCilindrada: ").append(getCilindrada());

        return detalles.toString();
    }
}
