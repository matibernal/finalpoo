import Mundial.Equipo;
import Mundial.Grupo;
import Mundial.Partido;

import java.util.Date;

public class Main {
    public static void main(String[] args){

        //MUNDIAL

        //CREACION DE LOS 32 EQUIPOS

        Equipo Holanda = new Equipo(1,"Paises Bajos");
        Equipo Senegal = new Equipo(2,"Senegal");
        Equipo Ecuador = new Equipo(3,"Ecuador");
        Equipo Qatar = new Equipo(4,"Qatar");
        Equipo Inglaterra = new Equipo(5,"Inglaterra");
        Equipo USA = new Equipo(6,"Estados Unidos");
        Equipo Iran = new Equipo(7,"Iran");
        Equipo Gales = new Equipo(8,"Gales");
        Equipo Argentina = new Equipo(9,"Argentina");
        Equipo Polonia = new Equipo(10,"Polonia");
        Equipo Mexico = new Equipo(11,"Mexico");
        Equipo arabiaSaudi = new Equipo(12,"Arabia Saudi");
        Equipo Francia = new Equipo(13,"Francia");
        Equipo Australia = new Equipo(14,"Australia");
        Equipo Tunez = new Equipo(15,"Tunez");
        Equipo Dinamarca = new Equipo(16,"Dinamarca");
        Equipo Japon = new Equipo(17,"Japon");
        Equipo Espana = new Equipo(18,"España");
        Equipo Alemania = new Equipo(19,"Alemania");
        Equipo costaRica = new Equipo(20,"Costa Rica");
        Equipo Marruecos = new Equipo(21,"Marruecos");
        Equipo Croacia = new Equipo(22,"Croacia");
        Equipo Belgica = new Equipo(23,"Belgica");
        Equipo Canada = new Equipo(24,"Canada");
        Equipo Brasil = new Equipo(25,"Brasil");
        Equipo Suiza = new Equipo(26,"Suiza");
        Equipo Camerun = new Equipo(27,"Camerun");
        Equipo Serbia = new Equipo(28,"Serbia");
        Equipo Portugal = new Equipo(29,"Portugal");
        Equipo coreaSur = new Equipo(30,"Corea del sur");
        Equipo Uruguay = new Equipo(31,"Uruguay");
        Equipo Ghana = new Equipo(32,"Ghana");

        //CREACION DE GRUPOS

        Grupo A = new Grupo("A");
        A.addEquipo(Holanda);
        A.addEquipo(Senegal);
        A.addEquipo(Ecuador);
        A.addEquipo(Qatar);

        Grupo B = new Grupo("B");
        B.addEquipo(Inglaterra);
        B.addEquipo(USA);
        B.addEquipo(Iran);
        B.addEquipo(Gales);

        Grupo C = new Grupo("C");
        C.addEquipo(Argentina);
        C.addEquipo(Polonia);
        C.addEquipo(Mexico);
        C.addEquipo(arabiaSaudi);

        Grupo D = new Grupo("D");
        D.addEquipo(Francia);
        D.addEquipo(Australia);
        D.addEquipo(Tunez);
        D.addEquipo(Dinamarca);

        Grupo E = new Grupo("E");
        E.addEquipo(Japon);
        E.addEquipo(Espana);
        E.addEquipo(Alemania);
        E.addEquipo(costaRica);

        Grupo F = new Grupo("F");
        F.addEquipo(Marruecos);
        F.addEquipo(Croacia);
        F.addEquipo(Belgica);
        F.addEquipo(Canada);

        Grupo G = new Grupo("G");
        G.addEquipo(Brasil);
        G.addEquipo(Suiza);
        G.addEquipo(Camerun);
        G.addEquipo(Serbia);

        Grupo H = new Grupo("H");
        H.addEquipo(Portugal);
        H.addEquipo(coreaSur);
        H.addEquipo(Uruguay);
        H.addEquipo(Ghana);

        //CREACION DE PARTIDOS

        Partido nr1 = new Partido(1, Qatar, Ecuador,(new Date(2022,11,20) );
    }
}
