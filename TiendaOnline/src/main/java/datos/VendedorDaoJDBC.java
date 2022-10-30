/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;





import domain.VendedorDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author USUARIO
 */
public class VendedorDaoJDBC implements VendedorDao{

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_vendedor, nombre, password FROM Vendedor";
    private static final String SQL_INSERT = "INSERT INTO Vendedor(id_vendedor, nombre, password) VALUES(?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE Vendedor SET nombre=?, password=? WHERE id_vendedor = ?";
    private static final String SQL_DELETE = "DELETE FROM Vendedor WHERE id_vendedor=?";

   public VendedorDaoJDBC() {

    }
   
   public VendedorDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    @Override
    public List<VendedorDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        VendedorDTO vendedor = null;
        List<VendedorDTO> vendedores = new ArrayList<VendedorDTO>();
        
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_vendedor = rs.getInt("id_vendedor");
                String nombre = rs.getString("nombre");
                int password = rs.getInt("password");

                vendedor = new VendedorDTO();
                vendedor.setId_vendedor(id_vendedor);
                vendedor.setNombre(nombre);
                vendedor.setPassword(password);

                vendedores.add(vendedor);
            }
        } finally {
            
          
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }

        return vendedores;
        
        
        
    }

    @Override
    public int insert(VendedorDTO vendedor) throws SQLException {
       Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, vendedor.getId_vendedor());
            stmt.setString(2, vendedor.getNombre());
            stmt.setInt(3, vendedor.getPassword());

            System.out.println("ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados:" + rows);
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }

        return rows; 
    }

    @Override
    public int update(VendedorDTO vendedor) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("ejecutando query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, vendedor.getNombre());
            stmt.setInt(2, vendedor.getPassword());
            stmt.setInt(3, vendedor.getId_vendedor());

            rows = stmt.executeUpdate();
            System.out.println("Registros actualizado:" + rows);
        } finally {
            Conexion.close(stmt);
            if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }

        return rows;
    }

    @Override
    public int delete(VendedorDTO vendedor) throws SQLException {
         Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, vendedor.getId_vendedor());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } finally {
            Conexion.close(stmt);
             if (this.conexionTransaccional == null) {
                Conexion.close(conn);
            }
        }

        return rows;
    }

   
}