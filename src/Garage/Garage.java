package Garage;
import java.util.Date;

public class Garage {

    private int capacidad;
    private Date horarioDeApertura;
    private String direccion;
    private int stockDeRuedas;
    private int precioDeRuedas;
    protected boolean espacioDisponible;
    private Vehiculo kilometrosTotales;


    public Garage(int capacidad, Date horarioDeApertura, String direccion, int stockDeRuedas, int precioDeRuedas, boolean espacioDisponible, Vehiculo kilometrosTotales) {
        this.capacidad = capacidad;
        this.horarioDeApertura = horarioDeApertura;
        this.direccion = direccion;
        this.stockDeRuedas = stockDeRuedas;
        this.precioDeRuedas = precioDeRuedas;
        this.espacioDisponible = espacioDisponible;
        this.kilometrosTotales = kilometrosTotales;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Date getHorarioDeApertura() {
        return horarioDeApertura;
    }

    public void setHorarioDeApertura(Date horarioDeApertura) {
        this.horarioDeApertura = horarioDeApertura;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getStockDeRuedas() {
        return stockDeRuedas;
    }

    public void setStockDeRuedas(int stockDeRuedas) {
        this.stockDeRuedas = stockDeRuedas;
    }

    public int getPrecioDeRuedas() {
        return precioDeRuedas;
    }

    public void setPrecioDeRuedas(int precioDeRuedas) {
        this.precioDeRuedas = precioDeRuedas;
    }

    public boolean isEspacioDisponible() {
        return espacioDisponible;
    }

    public void setEspacioDisponible(boolean espacioDisponible) {
        this.espacioDisponible = espacioDisponible;
    }

    public Vehiculo getKilometrosTotales() {
        return kilometrosTotales;
    }

    public void setKilometrosTotales(Vehiculo kilometrosTotales) {
        this.kilometrosTotales = kilometrosTotales;
    }
}
