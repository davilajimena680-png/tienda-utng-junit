package untg.gtid2.jdj;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOMemoria implements ProductoDAO {

    private List<Producto> productos = new ArrayList<>();
    private int siguienteId = 1;

    @Override
    public void agregarProducto(Producto producto) {

    }

    @Override
    public void actualizarProducto(Producto producto) {

    }

    @Override
    public void eliminarProducto(int id) {

    }

    @Override
    public Producto buscarProducto(int id) {
        return null;
    }

    @Override
    public List<Producto> listarProductos() {
        return null;
    }

}