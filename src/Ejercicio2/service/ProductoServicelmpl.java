package Ejercicio2.service;

import Ejercicio2.DTO.PointsDTO;
import Ejercicio2.interfaces.IProducto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductoServicelmpl implements IProducto {
    private List<PointsDTO> points;

    public ProductoServicelmpl() throws IOException, ClassNotFoundException {
        points = new ArrayList<>();
    }

    @Override
    public PointsDTO findById(int id) {
        return points.stream()
                .filter(point -> point.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<PointsDTO> findAll() throws IOException, ClassNotFoundException {
        points = (List<PointsDTO>) ObjectSerializer.readObjectFromFile("points.ax");
        return points;
    }

    @Override
    public void save(PointsDTO point) throws IOException {
        points.add(point);
        ObjectSerializer.writeObjectToFile(points, "points.ax");
    }

    @Override
    public void update(PointsDTO point) throws IOException {
        PointsDTO oldPoint = findById(point.getId());
        if (oldPoint != null) {
            points.remove(oldPoint);
            points.add(point);
            ObjectSerializer.writeObjectToFile(points, "points.ax");
        }
    }

    @Override
    public void delete(PointsDTO point) throws IOException {
        points.remove(points);
        ObjectSerializer.writeObjectToFile(points, "points.ax");
    }

}
