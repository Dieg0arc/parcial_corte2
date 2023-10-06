package Ejercicio2.interfaces;

import Ejercicio2.DTO.PointsDTO;

import java.io.IOException;
import java.util.List;

public interface IProducto {
    PointsDTO findById(int id);
    List<PointsDTO> findAll() throws IOException, ClassNotFoundException;
    void save(PointsDTO point) throws IOException;
    void update(PointsDTO point) throws IOException;
    void delete(PointsDTO point) throws IOException;
}
