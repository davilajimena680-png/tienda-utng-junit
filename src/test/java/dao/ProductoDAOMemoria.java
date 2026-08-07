package dao;

import modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductoDAOMemoria implements ProductoDAO {

    private final List<Producto> almacen = new ArrayList<>();
    private int siguienteId = 1;

    @Override
    public boolean insertar(Producto producto) {
        producto.setId(siguienteId++);
        almacen.add(producto);
        return true;
    }

    @Override
    public boolean actualizar(Producto producto) {

        for (int i = 0; i < almacen.size(); i++) {

            if (almacen.get(i).getId() == producto.getId()) {
                almacen.set(i, producto);
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean eliminar(int id) {
        return almacen.removeIf(p -> p.getId() == id);
    }

    @Override
    public Producto buscarPorId(int id) {

        for (Producto producto : almacen) {

            if (producto.getId() == id) {
                return producto;
            }
        }

        return null;
    }

    @Override
    public List<Producto> listar() {
        return new ArrayList<>(almacen);
    }
}