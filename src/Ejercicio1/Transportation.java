package Ejercicio1;

public enum Transportation {
    BUS("40","diesel engines","Vehículo automotor para pasajeros de gran capacidad y recorrido fijo dentro de una urbe","Bus"),
    TREN("100","dc motors","son un tipo de vehículo ferroviario que cuenta con vagones y una locomotora", "Tren"),
    BARCO("50","diesel engines","construcción, de madera, metal u otro material, capaz de flotar en el agua y que se utiliza como medio de transporte.", "Barco"),
    MOTO("2","two-stroke and four-stroke power sources","vehículo de dos ruedas impulsado por un motor.", "Moto"),
    AVION("189","piston engines","vehículo, provisto de alas y uno o varios motores, capaz de desplazarse por el aire", "Avion");

//capacidad y tipo de motor
    //TypeEngine and Capacity
    private String ID;
    private String Capacity;
    private String TypeEngine;
    private String Descripcion;


    Transportation(String capacity, String typeEngine, String descripcion, String ID) {
        this.ID = ID;
        Capacity = capacity;
        TypeEngine = typeEngine;
        Descripcion = descripcion;
    }

    public String getID() {
        return ID;
    }
    public String getCapacity() {
        return Capacity;
    }

    public String getTypeEngine() {
        return TypeEngine;
    }

    public String getDescripcion() {
        return Descripcion;
    }



    public void DescriptionTransportation(){
        System.out.println("el vehiculo cuenta con: " + getDescripcion());
    }
}

