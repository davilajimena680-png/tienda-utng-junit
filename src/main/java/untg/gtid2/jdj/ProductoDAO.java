package untg.gtid2.jdj;
import java.util.List;

public interface ProductoDAO {

    void agregarProducto(Producto producto);
    
    void actualizarProducto(Producto producto);

    void eliminarProducto(int id);

    Producto buscarProducto(int id);

    List<Producto> listarProductos();
}
