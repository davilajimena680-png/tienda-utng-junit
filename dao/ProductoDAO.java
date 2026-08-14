package dao;

import modelo.Producto;
import java.util.List;

public interface ProductoDAO {

    void agregar(Producto producto);

    void actualizar(Producto producto);

    void eliminar(int id);

    Producto buscar(int id);

    List<Producto> listar();
}