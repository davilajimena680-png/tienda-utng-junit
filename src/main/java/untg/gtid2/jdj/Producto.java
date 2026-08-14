package untg.gtid2.jdj;
/**
 * Representa un producto de la tienda.
 * Contiene la información básica de un producto, como su identificador,
 * nombre, precio y cantidad disponible en stock.
 *
 * @author Juan Diego Aguilar Bautista
 */
public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int stock;

    /**
     * Constructor vacío.
     */
    public Producto() {

    }

    /**
     * Inicializa un producto con todos sus atributos.
     *
     * @param id Identificador único del producto.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param stock Cantidad disponible en inventario.
     */
    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Obtiene el identificador del producto.
     *
     * @return Identificador del producto.
     */
    public int getId() {
        return id;
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return Precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Obtiene la cantidad disponible en stock.
     *
     * @return Stock del producto.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Asigna el identificador del producto.
     *
     * @param id Nuevo identificador del producto.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Asigna el nombre del producto.
     *
     * @param nombre Nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Asigna el precio del producto.
     *
     * @param precio Nuevo precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Asigna la cantidad disponible en stock.
     *
     * @param stock Nueva cantidad disponible del producto.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}