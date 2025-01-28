package Ejer6_3;

import javax.swing.*;

public class Fabrica {
    public static void main(String[] args) {
        Coche car1 = new Coche();
        Coche car2 = new Coche("5678-AG");
        Coche car3 = new Coche(5, 5);
        Coche car4 = new Coche("VW", "Caddy", "blanco");

        //Coche 1
        car1.setMatricula("1234-DF");
        car1.setModelo("Toledo");
        car1.setColor("azul");
        car1.setKilometros(200);

        //Coche 2
        car2.setMarca("Fiat");
        car2.setModelo("Uno");
        car2.setColor("rojo");
        car2.setTechoSolar(true);
        car2.setKilometros(300);
        car2.setNumPlazas(2);

        //Coche 3
        car3.setMatricula("9012-HH");
        car3.setMarca("BMW");
        car3.setModelo("850");
        car3.setColor("gris");
        car3.setKilometros(400);

        //Coche 4
        car4.setMatricula("3456-XS");
        car4.setTechoSolar(true);
        car4.setKilometros(500);
        car4.setNumPuertas(5);
        car4.setNumPlazas(7);

        Coche[] coches = {car1, car2, car3, car4};

        int i = 0;
        for(Coche cocheAct : coches) {
            JOptionPane.showMessageDialog(null, "Coche "+(i+1)+":"+"\n"+caracteristicas(cocheAct));
            i++;
        }
    }

    public static String caracteristicas(Coche coche) {
        String caracteristicas = "Color: "+coche.getColor()+
                "\n"+"Marca: "+coche.getMarca()+
                "\n"+"Modelo: "+coche.getModelo()+
                "\n"+"Matricula: "+coche.getMatricula()+
                "\n"+"Kilometros: "+coche.getKilometros()+
                "\n"+"Numero de plazas: "+coche.getNumPlazas()+
                "\n"+"Numero de puertas: "+coche.getNumPuertas()+
                "\n"+"¿Tiene techo solar? "+(coche.isTechoSolar() ? "Si" : "No");
        return caracteristicas;
    }
}