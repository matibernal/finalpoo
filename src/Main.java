import Garage.Garage;
import Mundial.Equipo;
import Mundial.Grupo;
import Mundial.Partido;
import Mundial.Resultado;

import javax.swing.*;
import java.util.ArrayList;
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

        Grupo Octavos = new Grupo("Octavos");
        Grupo Cuartos = new Grupo("Cuartos");
        Grupo Semis = new Grupo("Semis");
        Grupo Final = new Grupo("Final");
        //CREACION DE PARTIDOS Y AGREGADOS AL GRUPO

        //GRUPO A
        Partido nr1 = new Partido(1, Qatar, Ecuador, new Date(2022, 10, 20),new Resultado(0, 2, false, false));
        Partido nr2 = new Partido(2, Senegal, Holanda, new Date(2022, 10, 21),new Resultado(0, 2, false, false));
        Partido nr3 = new Partido(3, Qatar, Senegal, new Date(2022, 10, 25),new Resultado(1, 3, false, false));
        Partido nr4 = new Partido(4, Holanda, Ecuador, new Date(2022, 10, 25),new Resultado(1, 1, false, true));
        Partido nr5 = new Partido(5, Ecuador, Senegal, new Date(2022, 10, 29),new Resultado(1, 2, false, false));
        Partido nr6 = new Partido(6, Holanda, Qatar, new Date(2022, 10, 29),new Resultado(2, 0, true, false));
        A.addPartidos(nr1);
        A.addPartidos(nr2);
        A.addPartidos(nr3);
        A.addPartidos(nr4);
        A.addPartidos(nr5);
        A.addPartidos(nr6);

        //GRUPO B
        Partido nr7 = new Partido(7,Inglaterra,Iran,new Date(2022,10,21), new Resultado(6,2,true,false));
        Partido nr8 = new Partido(8,USA, Gales, new Date(2022,10,21), new Resultado(1,1,false,true));
        Partido nr9 = new Partido(9,Gales,Iran, new Date(2022,10,25), new Resultado(0,2,false,false));
        Partido nr10 = new Partido(10,Inglaterra,USA, new Date(2022,10,25), new Resultado(0,0,false,true));
        Partido nr11 = new Partido(11,Gales,Inglaterra, new Date(2022,10,29), new Resultado(0,3,false,false));
        Partido nr12 = new Partido(12,Iran, USA, new Date(2022,10,29), new Resultado(0,1,false,false));
        B.addPartidos(nr7);
        B.addPartidos(nr8);
        B.addPartidos(nr9);
        B.addPartidos(nr10);
        B.addPartidos(nr11);
        B.addPartidos(nr12);

        //GRUPO C
        Partido nr13 = new Partido(13,Argentina,arabiaSaudi,new Date(2022,10,22), new Resultado(1,2,false,false));
        Partido nr14 = new Partido(14,Mexico, Polonia, new Date(2022,10,22), new Resultado(0,0,false,true));
        Partido nr15 = new Partido(15,Polonia,arabiaSaudi, new Date(2022,10,26), new Resultado(2,0,true,false));
        Partido nr16 = new Partido(16,Argentina,Mexico, new Date(2022,10,26), new Resultado(2,0,true,false));
        Partido nr17 = new Partido(17,Polonia,Argentina, new Date(2022,10,30), new Resultado(0,2,false,false));
        Partido nr18 = new Partido(18,arabiaSaudi, Mexico, new Date(2022,10,30), new Resultado(1,2,false,false));
        C.addPartidos(nr13);
        C.addPartidos(nr14);
        C.addPartidos(nr15);
        C.addPartidos(nr16);
        C.addPartidos(nr17);
        C.addPartidos(nr18);

        //GRUPO D
        Partido nr19 = new Partido(19,Dinamarca,Tunez,new Date(2022,10,22), new Resultado(0,0,false,true));
        Partido nr20 = new Partido(20,Francia, Australia, new Date(2022,10,22), new Resultado(4,1,true,false));
        Partido nr21 = new Partido(21,Tunez,Australia, new Date(2022,10,26), new Resultado(0,1,false,false));
        Partido nr22 = new Partido(22,Francia,Dinamarca, new Date(2022,10,26), new Resultado(2,1,true,false));
        Partido nr23 = new Partido(23,Australia,Dinamarca, new Date(2022,10,30), new Resultado(1,0,true,false));
        Partido nr24 = new Partido(24,Tunez,Francia, new Date(2022,10,30), new Resultado(1,0,true,false));
        D.addPartidos(nr19);
        D.addPartidos(nr20);
        D.addPartidos(nr21);
        D.addPartidos(nr22);
        D.addPartidos(nr23);
        D.addPartidos(nr24);

        //GRUPO E
        Partido nr25 = new Partido(25,Alemania,Japon,new Date(2022,10,23), new Resultado(1,2,false,false));
        Partido nr26 = new Partido(26,Espana, costaRica, new Date(2022,10,23), new Resultado(7,0,true,false));
        Partido nr27 = new Partido(27,Japon,costaRica, new Date(2022,10,27), new Resultado(0,1,false,false));
        Partido nr28 = new Partido(28,Espana,Alemania, new Date(2022,10,27), new Resultado(1,1,false,true));
        Partido nr29 = new Partido(29,Japon,Espana, new Date(2022,11,1), new Resultado(2,1,true,false));
        Partido nr30 = new Partido(30,costaRica,Alemania, new Date(2022,11,1), new Resultado(2,4,false,false));
        E.addPartidos(nr25);
        E.addPartidos(nr26);
        E.addPartidos(nr27);
        E.addPartidos(nr28);
        E.addPartidos(nr29);
        E.addPartidos(nr30);

        //GRUPO F
        Partido nr31 = new Partido(31,Marruecos,Croacia,new Date(2022,10,23), new Resultado(0,0,false,true));
        Partido nr32 = new Partido(32,Belgica,Canada, new Date(2022,10,23), new Resultado(1,0,true,false));
        Partido nr33 = new Partido(33,Belgica,Marruecos, new Date(2022,10,27), new Resultado(0,2,false,false));
        Partido nr34 = new Partido(34,Croacia,Canada, new Date(2022,10,27), new Resultado(4,1,true,false));
        Partido nr35 = new Partido(35,Croacia,Belgica, new Date(2022,11,1), new Resultado(0,0,false,true));
        Partido nr36 = new Partido(36,Canada,Marruecos, new Date(2022,11,1), new Resultado(1,2,false,false));
        F.addPartidos(nr31);
        F.addPartidos(nr32);
        F.addPartidos(nr33);
        F.addPartidos(nr34);
        F.addPartidos(nr35);
        F.addPartidos(nr36);

        //GRUPO G
        Partido nr37 = new Partido(37,Suiza,Camerun,new Date(2022,10,24), new Resultado(1,0,true,false));
        Partido nr38 = new Partido(38,Brasil,Serbia, new Date(2022,10,24), new Resultado(2,0,true,false));
        Partido nr39 = new Partido(39,Camerun,Serbia, new Date(2022,10,28), new Resultado(3,3,false,true));
        Partido nr40 = new Partido(40,Brasil,Suiza, new Date(2022,10,28), new Resultado(1,0,true,false));
        Partido nr41 = new Partido(41,Serbia,Suiza, new Date(2022,11,2), new Resultado(2,3,false,false));
        Partido nr42 = new Partido(42,Camerun,Brasil, new Date(2022,11,2), new Resultado(1,0,true,false));
        G.addPartidos(nr37);
        G.addPartidos(nr38);
        G.addPartidos(nr39);
        G.addPartidos(nr40);
        G.addPartidos(nr41);
        G.addPartidos(nr42);

        //GRUPO H
        Partido nr43 = new Partido(43,Uruguay,coreaSur,new Date(2022,10,24), new Resultado(0,0,false,true));
        Partido nr44 = new Partido(44,Portugal,Ghana, new Date(2022,10,24), new Resultado(3,2,true,false));
        Partido nr45 = new Partido(45,coreaSur,Ghana, new Date(2022,10,28), new Resultado(2,3,false,false));
        Partido nr46 = new Partido(46,Portugal,Uruguay, new Date(2022,10,28), new Resultado(2,0,true,false));
        Partido nr47 = new Partido(47,Ghana,Uruguay, new Date(2022,11,2), new Resultado(0,2,false,false));
        Partido nr48 = new Partido(48,coreaSur,Portugal, new Date(2022,11,2), new Resultado(2,1,true,false));
        H.addPartidos(nr43);
        H.addPartidos(nr44);
        H.addPartidos(nr45);
        H.addPartidos(nr46);
        H.addPartidos(nr47);
        H.addPartidos(nr48);

        //OCTAVOS DE FINAL
        Partido nr49 = new Partido(49,Holanda,USA,new Date(2022,11,3),new Resultado(3,1,true,false));
        Partido nr50 = new Partido(50,Argentina,Australia,new Date(2022,11,3),new Resultado(2,1,true,false));
        Partido nr51 = new Partido(51,Japon,Croacia,new Date(2022,11,5),new Resultado(1,1,false,false));
        Partido nr52 = new Partido(52,Brasil,coreaSur,new Date(2022,11,5),new Resultado(4,1,true,false));
        Partido nr53 = new Partido(53,Inglaterra,Senegal,new Date(2022,11,4),new Resultado(3,0,true,false));
        Partido nr54 = new Partido(54,Francia,Polonia,new Date(2022,11,4),new Resultado(3,1,true,false));
        Partido nr55 = new Partido(55,Marruecos,Espana,new Date(2022,11,6),new Resultado(0,0,true,false));
        Partido nr56 = new Partido(56,Portugal,Suiza,new Date(2022,11,6),new Resultado(6,1,true,false));
        Octavos.addPartidos(nr49);
        Octavos.addPartidos(nr50);
        Octavos.addPartidos(nr51);
        Octavos.addPartidos(nr52);
        Octavos.addPartidos(nr53);
        Octavos.addPartidos(nr54);
        Octavos.addPartidos(nr55);
        Octavos.addPartidos(nr56);

        //CUARTOS DE FINAL
        Partido nr57 = new Partido(57,Holanda,Argentina,new Date(2022,11,9),new Resultado(2,2,false,false));
        Partido nr58 = new Partido(58,Croacia,Brasil,new Date(2022,11,9),new Resultado(1,1,true,false));
        Partido nr59 = new Partido(59,Inglaterra,Francia,new Date(2022,11,10),new Resultado(1,2,false,false));
        Partido nr60 = new Partido(60,Marruecos,Portugal,new Date(2022,11,10),new Resultado(1,0,true,false));
        Cuartos.addPartidos(nr57);
        Cuartos.addPartidos(nr58);
        Cuartos.addPartidos(nr59);
        Cuartos.addPartidos(nr60);

        //SEMIS
        Partido nr61 = new Partido(61,Argentina,Croacia,new Date(2022,11,13), new Resultado(3,0,true,false));
        Partido nr62 = new Partido(62,Francia,Marruecos,new Date(2022,11,14), new Resultado(2,0,true,false));
        Semis.addPartidos(nr61);
        Semis.addPartidos(nr62);

        //FINAL
        Partido nr63 = new Partido(63,Argentina,Francia,new Date(2022,11,18), new Resultado(3,3,true,false));
        Final.addPartidos(nr63);

        //CREACION DE GARAGE
        Garage garej = new Garage(8, new Date(2023,7,10, 16,0,0),"Rodriguez Nasso 86", 16, 2000, true);

        JOptionPane.showMessageDialog(null,"Bienvenido a mi programa","Final POO", JOptionPane.INFORMATION_MESSAGE);
        int a = 0;
        String[] opciones = {"Mundial", "Garage", "Salir"};
        String menu= "";
        do{
            menu = (String)JOptionPane.showInputDialog(null,"Seleccione lo que desea: ", "Final POO", JOptionPane.DEFAULT_OPTION, null, opciones,opciones);
            switch (menu){
                case "Mundial":
                    String[] mundialito = {"Grupos", "Llaves","Salir"};
                    String op="";
                    do{
                        op=(String)JOptionPane.showInputDialog(null,"Seleccione una opcion: ", "Final POO", JOptionPane.DEFAULT_OPTION,null, mundialito, mundialito);
                        switch (op){
                            case "Grupos":
                                String[] opg= {"A","B","C","D","E","F","G","H"};
                                op= (String)JOptionPane.showInputDialog(null,"Seleccione que grupo desea ver: ","Final POO", JOptionPane.DEFAULT_OPTION, null, opg, opg);
                                switch (op) {
                                    case "A" -> {
                                        String[] opgg = {"Equipos", "Partidos"};
                                        op = (String) JOptionPane.showInputDialog(null, "¿Desea ver los equipos o los partidos?", "Final POO", JOptionPane.DEFAULT_OPTION, null, opgg, opgg);
                                        switch (op) {
                                            case "Equipos" -> JOptionPane.showMessageDialog(null, "Equipos en el grupo " + A.getId() + ": \n\n" + A.mostrarEquipos());
                                            case "Partidos" -> JOptionPane.showMessageDialog(null, "Partidos en el grupo " + A.getId() + ": \n\n" + A.mostrarPartidos());
                                        }
                                    }
                                    case "B" -> {
                                        String[] opg2 = {"Equipos", "Partidos"};
                                        op = (String) JOptionPane.showInputDialog(null, "¿Desea ver los equipos o los partidos?", "Final POO", JOptionPane.DEFAULT_OPTION, null, opg2, opg2);
                                        switch (op) {
                                            case "Equipos" -> JOptionPane.showMessageDialog(null, "Equipos en el grupo " + B.getId() + ": \n\n" + B.mostrarEquipos());
                                            case "Partidos" -> JOptionPane.showMessageDialog(null, "Partidos en el grupo " + B.getId() + ": \n\n" + B.mostrarPartidos());
                                        }
                                    }
                                    case "C" -> {
                                        String[] opg3 = {"Equipos", "Partidos"};
                                        op = (String) JOptionPane.showInputDialog(null, "¿Desea ver los equipos o los partidos?", "Final POO", JOptionPane.DEFAULT_OPTION, null, opg3, opg3);
                                        switch (op) {
                                            case "Equipos" -> JOptionPane.showMessageDialog(null, "Equipos en el grupo " + C.getId() + ": \n\n" + C.mostrarEquipos());
                                            case "Partidos" -> JOptionPane.showMessageDialog(null, "Partidos en el grupo " + C.getId() + ": \n\n" + C.mostrarPartidos());
                                        }
                                    }
                                    case "D" -> {
                                        String[] opg4 = {"Equipos", "Partidos"};
                                        op = (String) JOptionPane.showInputDialog(null, "¿Desea ver los equipos o los partidos?", "Final POO", JOptionPane.DEFAULT_OPTION, null, opg4, opg4);
                                        switch (op) {
                                            case "Equipos" -> JOptionPane.showMessageDialog(null, "Equipos en el grupo " + D.getId() + ": \n\n" + D.mostrarEquipos());
                                            case "Partidos" -> JOptionPane.showMessageDialog(null, "Partidos en el grupo " + D.getId() + ": \n\n" + D.mostrarPartidos());
                                        }
                                    }
                                    case "E" -> {
                                        String[] opg5 = {"Equipos", "Partidos"};
                                        op = (String) JOptionPane.showInputDialog(null, "¿Desea ver los equipos o los partidos?", "Final POO", JOptionPane.DEFAULT_OPTION, null, opg5, opg5);
                                        switch (op) {
                                            case "Equipos" -> JOptionPane.showMessageDialog(null, "Equipos en el grupo " + E.getId() + ": \n\n" + E.mostrarEquipos());
                                            case "Partidos" -> JOptionPane.showMessageDialog(null, "Partidos en el grupo " + E.getId() + ": \n\n" + E.mostrarPartidos());
                                        }
                                    }
                                    case "F" -> {
                                        String[] opg6 = {"Equipos", "Partidos"};
                                        op = (String) JOptionPane.showInputDialog(null, "¿Desea ver los equipos o los partidos?", "Final POO", JOptionPane.DEFAULT_OPTION, null, opg6, opg6);
                                        switch (op) {
                                            case "Equipos" -> JOptionPane.showMessageDialog(null, "Equipos en el grupo " + F.getId() + ": \n\n" + F.mostrarEquipos());
                                            case "Partidos" -> JOptionPane.showMessageDialog(null, "Partidos en el grupo " + F.getId() + ": \n\n" + F.mostrarPartidos());
                                        }
                                    }
                                    case "G" -> {
                                        String[] opg7 = {"Equipos", "Partidos"};
                                        op = (String) JOptionPane.showInputDialog(null, "¿Desea ver los equipos o los partidos?", "Final POO", JOptionPane.DEFAULT_OPTION, null, opg7, opg7);
                                        switch (op) {
                                            case "Equipos" -> JOptionPane.showMessageDialog(null, "Equipos en el grupo " + G.getId() + ": \n\n" + G.mostrarEquipos());
                                            case "Partidos" -> JOptionPane.showMessageDialog(null, "Partidos en el grupo " + G.getId() + ": \n\n" + G.mostrarPartidos());
                                        }
                                    }
                                    case "H" -> {
                                        String[] opg8 = {"Equipos", "Partidos"};
                                        op = (String) JOptionPane.showInputDialog(null, "¿Desea ver los equipos o los partidos?", "Final POO", JOptionPane.DEFAULT_OPTION, null, opg8, opg8);
                                        switch (op) {
                                            case "Equipos" -> JOptionPane.showMessageDialog(null, "Equipos en el grupo " + H.getId() + ": \n\n" + H.mostrarEquipos());
                                            case "Partidos" -> JOptionPane.showMessageDialog(null, "Partidos en el grupo " + H.getId() + ": \n\n" + H.mostrarPartidos());
                                        }
                                    }
                                }
                                break;
                            case "Llaves":
                                String[] llaves = {"Octavos", "Cuartos", "Semis", "Final","Salir"};
                                String llave = "";
                                do {
                                    llave=(String)JOptionPane.showInputDialog(null,"Ingrese que llave desea ver", "Final POO", JOptionPane.DEFAULT_OPTION, null, llaves,llaves);
                                    switch (llave) {
                                        case "Octavos" -> JOptionPane.showMessageDialog(null, "Partidos de Octavos de final: \n\n" + Octavos.mostrarPartidos() + "Pasa " + Croacia.getName() + " por penales 3 a 1\nPasa " + Marruecos.getName() + " por penales 3 a 0");
                                        case "Cuartos" -> JOptionPane.showMessageDialog(null, "Partidos de Cuartos de final: \n\n" + Cuartos.mostrarPartidos() + "Pasa " + Argentina.getName() + " por penales 4 a 3\nPasa " + Croacia.getName() + " por penales 4 a 2");
                                        case "Semis" -> JOptionPane.showMessageDialog(null, "Partidos de Semis de final: \n\n" + Semis.mostrarPartidos());
                                        case "Final" -> JOptionPane.showMessageDialog(null, "Partido de final: \n\n" + Final.mostrarPartidos() + "ARGENTINA CAMPEON DEL MUNDO POR PENALES 4 a 2");
                                    }


                                }while (!llaves.equals("Salir"));
                                break;
                        }

                    }while(!op.equals("Salir"));

                    break;
                case "Garage":
                    String[] garaje = {"Ver garage", "Usar garages", "Salir"};
                    String gar = "";
                    do{
                        gar=(String)JOptionPane.showInputDialog(null,"Ingrese que desea hacer", "Final POO", JOptionPane.DEFAULT_OPTION, null, garaje,garaje);
                        switch (gar){
                            case "Ver garage":
                                
                                break;
                        }
                    }while (!gar.equals("Salir"));
                    break;
            }

        }while (!menu.equals("Salir"));


        /**/

    }
}
