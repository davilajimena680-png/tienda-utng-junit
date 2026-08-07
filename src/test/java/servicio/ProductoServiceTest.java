package servicio;

import dao.ProductoDAOMemoria;
import modelo.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoServiceTest {

    private ProductoService service;

    @BeforeEach
    void setUp() {
        service = new ProductoService(new ProductoDAOMemoria());
    }

    @Test
    void guardarProducto_debeRetornarTrue() {

        Producto producto = new Producto();
        producto.setNombre("Laptop");
        producto.setPrecio(15000);
        producto.setExistencia(5);

        assertTrue(service.guardarProducto(producto));
    }

    @Test
    void guardarProducto_null_lanzaExcepcion() {

        assertThrows(
                IllegalArgumentException.class,
                () -> service.guardarProducto(null)
        );
    }

    @Test
    void obtenerProductos_iniciaVacia() {

        assertTrue(service.obtenerProductos().isEmpty());
    }

    @Test
    void guardarProducto_agregaUnElemento() {

        Producto producto = new Producto();
        producto.setNombre("Mouse");
        producto.setPrecio(250);
        producto.setExistencia(10);

        service.guardarProducto(producto);

        assertEquals(1, service.obtenerProductos().size());
    }

    @Test
    void calcularTotalConDescuento_descuento10_retorna90() {

    Producto producto = new Producto();
    producto.setPrecio(100);

    double total = service.calcularTotalConDescuento(producto, 0.10);

    assertEquals(90.0, total, 0.001, "El total con 10% de descuento debe ser 90");
}
    @Test
void calcularTotalConDescuento_productoNulo_lanzaExcepcion() {

    assertThrows(
            IllegalArgumentException.class,
            () -> service.calcularTotalConDescuento(null, 0.10)
    );
}

@Test
void calcularTotalConDescuento_descuentoNegativo_lanzaExcepcion() {

    Producto producto = new Producto();
    producto.setPrecio(100);

    assertThrows(
            IllegalArgumentException.class,
            () -> service.calcularTotalConDescuento(producto, -0.10)
    );
}

@Test
void calcularTotalConDescuento_descuentoMayorUno_lanzaExcepcion() {

    Producto producto = new Producto();
    producto.setPrecio(100);

    assertThrows(
            IllegalArgumentException.class,
            () -> service.calcularTotalConDescuento(producto, 1.50)
    );
}


}

