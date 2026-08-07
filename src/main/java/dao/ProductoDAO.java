package dao;

import java.util.List;
import modelo.Producto;

public interface ProductoDAO {

    boolean insertar(Producto producto);

    boolean actualizar(Producto producto);

    boolean eliminar(int id);

    Producto buscarPorId(int id);

    List<Producto> listar();
}
