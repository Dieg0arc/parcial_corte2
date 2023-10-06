package Ejercicio2.DTO;

import java.io.Serializable;

    public class PointsDTO implements Serializable {
        private int id;
        private String name;
        private  int fuel_cost;
        private int Acumulate;

        public PointsDTO(int id, String name, int fuel_cost, int acumulate) {
            this.id = id;
            this.name = name;
            this.fuel_cost = fuel_cost;
            Acumulate = acumulate;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getFuel_cost() {
            return fuel_cost;
        }

        public void setFuel_cost(int fuel_cost) {
            this.fuel_cost = fuel_cost;
        }

        public int getAcumulate() {
            return Acumulate;
        }

        public void setAcumulate(int acumulate) {
            Acumulate = acumulate;
        }

        @Override
        public String toString() {
            return "PointsDTO{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", fuel_cost=" + fuel_cost +
                    ", Acumulate=" + Acumulate +
            '}';
}
    }
