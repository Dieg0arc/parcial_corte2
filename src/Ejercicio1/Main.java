package Ejercicio1;

public class Main {
        public static void main(String[] args) {
            Transportation transpoBu = Transportation.BUS;
            Transportation transpoT = Transportation.TREN;
            Transportation transpoBa = Transportation.BARCO;
            Transportation transpoM = Transportation.MOTO;
            Transportation transpoA = Transportation.AVION;

            System.out.println("el transporte seleccionado fue: " + transpoA.getID());
            System.out.println("la capacidad en el transporte seleccionado es: " + transpoA.getCapacity());
            System.out.println("el tipo de motor del transporte seleccionado es: " + transpoA.getTypeEngine());

            transpoA.DescriptionTransportation();

            System.out.println("el transporte seleccionado fue: " + transpoT.getID());
            System.out.println("la capacidad en el transporte seleccionado es: " + transpoT.getCapacity());
            System.out.println("el tipo de motor del transporte seleccionado es: " + transpoT.getTypeEngine());

            transpoT.DescriptionTransportation();

        }
    }


