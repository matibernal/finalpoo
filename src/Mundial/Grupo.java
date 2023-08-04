package Mundial;

import java.util.ArrayList;

public class Grupo {

    private int id;
    private ArrayList<Partido> partidos;
    private ArrayList<Equipo> equipos;

    public Grupo(int id, ArrayList<Partido> partidos, ArrayList<Equipo> equipos) {
        this.id = id;
        this.partidos = partidos;
        this.equipos = equipos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
}
