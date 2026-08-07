import modelo.Producto;
import servicio.ProductoService;

public class Main {

    public static void main(String[] args) {

        ProductoService servicio = new ProductoService();

        Producto producto = new Producto();
        producto.setNombre("Laptop");
        producto.setPrecio(15000.00);
        producto.setExistencia(5);

        boolean resultado = servicio.guardarProducto(producto);

        if (resultado) {
            System.out.println("Producto guardado correctamente.");
        } else {
            System.out.println("No fue posible guardar el producto.");
        }

        System.out.println("Fin de la demostración CRUD.");
    }
}