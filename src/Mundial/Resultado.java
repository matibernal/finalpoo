package Mundial;

public class Resultado {

    private int golesLocal;
    private int golesVisitante;
    private boolean ganoLocal;
    private boolean empato;

    public Resultado(int golesLocal, int golesVisitante, boolean ganoLocal, boolean empato) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
        this.ganoLocal = ganoLocal;
        this.empato = empato;

    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

    public boolean isGanoLocal() {
        return ganoLocal;
    }

    public void setGanoLocal(boolean ganoLocal) {
        this.ganoLocal = ganoLocal;
    }

    public boolean isEmpato() {
        return empato;
    }

    public void setEmpato(boolean empato) {
        this.empato = empato;
    }

    @Override
    public String toString() {
        return "Resultado" +
                "golesLocal=" + golesLocal +
                ", golesVisitante=" + golesVisitante +
                ", ganoLocal=" + ganoLocal +
                ", empato=" + empato +
                '}';
    }
}
