package Mundial;

import java.util.Date;

public class Partido {

    private int id;
    private Equipo local;
    private Equipo visitante;
    private Date fecha;
    private String resultado;

    public Partido(int id, Equipo local, Equipo visitante, Date fecha, String resultado) {
        this.id = id;
        this.local = local;
        this.visitante = visitante;
        this.fecha = fecha;
        this.resultado = resultado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
