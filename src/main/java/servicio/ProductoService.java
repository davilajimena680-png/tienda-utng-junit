package servicio;

import dao.ProductoDAO;
import dao.ProductoDAOImpl;
import modelo.Producto;

import java.util.List;

public class ProductoService {

    private final ProductoDAO productoDAO;

    public ProductoService() {
        this.productoDAO = new ProductoDAOImpl();
    }

    // Constructor para pruebas
    public ProductoService(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }

    public boolean guardarProducto(Producto producto) {

        if (producto == null) {
            throw new IllegalArgumentException("El producto no puede ser nulo");
        }

        return productoDAO.insertar(producto);
    }

    public boolean actualizarProducto(Producto producto) {
        return productoDAO.actualizar(producto);
    }

    public boolean eliminarProducto(int id) {
        return productoDAO.eliminar(id);
    }

    public Producto buscarProducto(int id) {
        return productoDAO.buscarPorId(id);
    }

    public List<Producto> obtenerProductos() {
        return productoDAO.listar();
    }
}