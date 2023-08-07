package Garage;

public class Vehiculo {

    private String motor;
    private int cantidadDeCombustible;
    private String patente;
    private String marca;
    private int ruedas;
    private int km;

    public Vehiculo(){

    }
    public Vehiculo(String motor, int cantidadDeCombustible, String patente, String marca, int ruedas, int km) {
        this.motor = motor;
        this.cantidadDeCombustible = cantidadDeCombustible;
        this.patente = patente;
        this.marca = marca;
        this.ruedas = ruedas;
        this.km = km;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getCantidadDeCombustible() {
        return cantidadDeCombustible;
    }

    public void setCantidadDeCombustible(int cantidadDeCombustible) {
        this.cantidadDeCombustible = cantidadDeCombustible;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
}
