package modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    @Test
    void constructor_valido_creaProductoCorrectamente() {

        Producto producto = new Producto(1, "Laptop", 15000, 5);

        assertAll("Verificar datos del producto",
                () -> assertEquals(1, producto.getId(), "El ID debe ser 1"),
                () -> assertEquals("Laptop", producto.getNombre(), "El nombre debe ser Laptop"),
                () -> assertEquals(15000, producto.getPrecio(), "El precio debe ser 15000"),
                () -> assertEquals(5, producto.getExistencia(), "La existencia debe ser 5")
        );
    }

    @Test
    void setNombre_actualizaNombreCorrectamente() {

        Producto producto = new Producto();

        producto.setNombre("Mouse");

        assertEquals("Mouse", producto.getNombre(), "El nombre debe actualizarse");
    }

    @Test
    void setPrecio_actualizaPrecioCorrectamente() {

        Producto producto = new Producto();

        producto.setPrecio(250.50);

        assertEquals(250.50, producto.getPrecio(), "El precio debe actualizarse");
    }

    @Test
    void setExistencia_actualizaExistenciaCorrectamente() {

        Producto producto = new Producto();

        producto.setExistencia(20);

        assertEquals(20, producto.getExistencia(), "La existencia debe actualizarse");
    }

}
