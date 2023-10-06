package Ejercicio2;

import Ejercicio2.DTO.PointsDTO;
import Ejercicio2.interfaces.IProducto;
import Ejercicio2.service.ProductoServicelmpl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainProducto {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc = "1";
        IProducto repo = new ProductoServicelmpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Add  \n 2. To List \n 3. Edite " +
                    "\n 4. Eliminate  \n 5. Out \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("Id Customer: ");
                    Integer id = s.nextInt();
                    System.out.println("Name cusomer: ");
                    String nom = s.next();
                    System.out.println("fuel cost: ");
                    Integer cat = s.nextInt();
                    System.out.println("Acumulate Points: ");
                    Integer ca = s.nextInt();
                    repo.save(new PointsDTO(id,nom, cat, ca ));
                    break;
                }
                case "2": {
                    List<PointsDTO> points = repo.findAll();
                    if(!points.isEmpty()){
                        points.forEach(System.out::println);
                    }else{
                        System.out.println("No hay registros");
                    }
                    break;
                }
                case "3": {
                    System.out.println("===== editar ====");
                    System.out.print("id  point: ");
                    Integer idp = s.nextInt();
                    System.out.print("new name: ");
                    String nom = s.next();
                    System.out.print("fuel cost: ");
                    Integer cat = s.nextInt();
                    System.out.print("Acumulate points: ");
                    Integer ca = s.nextInt();
                    PointsDTO beaActualizar = new PointsDTO(idp, nom, cat, ca);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== eliminar ======");
                    System.out.print("Enter the id of the customer: ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
                    repo.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        } while (opc!="5");
}


}
