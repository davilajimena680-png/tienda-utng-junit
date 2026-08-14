package untg.gtid2.jdj;
import java.util.List;

/**
 * Clase de servicio encargada de gestionar las operaciones relacionadas
 * con los productos. Actúa como intermediario entre la interfaz de usuario
 * y el DAO.
 *
 * @author Juan Diego Aguilar Bautista
 */
public class ProductoService {

    /**
     * Objeto DAO utilizado para acceder a la base de datos.
     */
    private ProductoDAO dao = new ProductoDAOImpl();

    /**
     * Agrega un nuevo producto a la base de datos.
     *
     * @param producto Producto que se desea registrar.
     */
    public void agregarProducto(Producto producto) {
        dao.agregarProducto(producto);
    }

    /**
     * Actualiza la información de un producto existente.
     *
     * @param producto Producto con los datos actualizados.
     */
    public void actualizarProducto(Producto producto) {
        dao.actualizarProducto(producto);
    }

    /**
     * Busca un producto por su identificador.
     *
     * @param id Identificador del producto.
     * @return El producto encontrado o {@code null} si no existe.
     */
    public Producto buscarProducto(int id) {
        return dao.buscarProducto(id);
    }

    /**
     * Elimina un producto de la base de datos.
     *
     * @param id Identificador del producto a eliminar.
     */
    public void eliminarProducto(int id) {
        dao.eliminarProducto(id);
    }

    /**
     * Obtiene la lista de todos los productos registrados.
     *
     * @return Lista de productos.
     */
    public List<Producto> listarProductos() {
        return dao.listarProductos();
    }
}