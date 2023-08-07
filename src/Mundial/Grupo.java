package Mundial;

import java.util.ArrayList;

public class Grupo {

    private String id;
    private ArrayList<Partido> partidos;
    private ArrayList<Equipo> equipos;

    public Grupo(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void addEquipo(Equipo equipos) {
        this.equipos.add(equipos);
    }

}
