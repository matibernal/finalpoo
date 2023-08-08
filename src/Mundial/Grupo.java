package Mundial;

import javax.swing.*;
import java.util.ArrayList;

public class Grupo {

    private String id;
    private ArrayList<Partido> partidos;
    private ArrayList<Equipo> equipos;

    public Grupo(String id) {
        this.id = id;
        this.partidos = new ArrayList<>();
        this.equipos = new ArrayList<>();
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

    public void addPartidos(Partido partidos) {
        this.partidos.add(partidos);
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void addEquipo(Equipo equipos) {
        this.equipos.add(equipos);
    }
    public String mostrarEquipos(){
        StringBuilder equiposNombres = new StringBuilder();
        //System.out.println("Equipos en el grupo " + id + ":");
        for (Equipo equipo : equipos){
            equiposNombres.append(equipo.getName()).append("\n");
        }
        return equiposNombres.toString();
    }
    public String mostrarPartidos(){
        StringBuilder todosPartidos = new StringBuilder();
        for(Partido partidos : partidos){
            todosPartidos.append(partidos.getLocal().getName()).append(" ")
                    .append(partidos.getResultado().getGolesLocal())
                    .append(" - ")
                    .append(partidos.getResultado().getGolesVisitante())
                    .append(" ")
                    .append(partidos.getVisitante().getName())
                    .append("\n\n");
        }
        return todosPartidos.toString();
    }

    @Override
    public String toString() {
        return "Grupo " + id + "\n\nEquipos: " + getEquipos();
    }
}
