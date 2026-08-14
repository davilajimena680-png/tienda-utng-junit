package untg.gtid2.jdj;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAOImpl implements ProductoDAO {

   @Override
    public void actualizarProducto(Producto producto) {

        Connection conexion = ConexionDB.obtenerConexion();

        String sql = "UPDATE Producto "
                + "SET Nombre = ?, Precio = ?, Stock = ? "
                + "WHERE Id = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setInt(4, producto.getId());

            ps.executeUpdate();

            System.out.println("Producto actualizado correctamente.");

            ps.close();
            conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void agregarProducto(Producto producto) {
        Connection conexion = ConexionDB.obtenerConexion();

        String sql = "INSERT INTO Producto (Nombre, Precio, Stock) VALUES (?,?,?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());

            ps.executeUpdate();

            System.out.println("Producto agregado correctamente.");

            ps.close();
            conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Producto buscarProducto(int id) {

        Connection conexion = ConexionDB.obtenerConexion();

        String sql = "SELECT * FROM Producto WHERE Id = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                Producto producto = new Producto();

                producto.setId(rs.getInt("Id"));
                producto.setNombre(rs.getString("Nombre"));
                producto.setPrecio(rs.getDouble("Precio"));
                producto.setStock(rs.getInt("Stock"));

                rs.close();
                ps.close();
                conexion.close();

                return producto;
            }

            rs.close();
            ps.close();
            conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void eliminarProducto(int id) {

        Connection conexion = ConexionDB.obtenerConexion();

        String sql = "DELETE FROM Producto WHERE Id = ?";

        try {

            PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Producto eliminado correctamente.");

            ps.close();
            conexion.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Producto> listarProductos() {
            Connection conexion = ConexionDB.obtenerConexion();

    List<Producto> lista = new ArrayList<>();

    String sql = "SELECT * FROM Producto";

    try {

        PreparedStatement ps = conexion.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Producto producto = new Producto();

            producto.setId(rs.getInt("Id"));
            producto.setNombre(rs.getString("Nombre"));
            producto.setPrecio(rs.getDouble("Precio"));
            producto.setStock(rs.getInt("Stock"));

            lista.add(producto);
        }

        rs.close();
        ps.close();
        conexion.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

    return lista;
    }
    
}
