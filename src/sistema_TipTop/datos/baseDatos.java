package sistema_TipTop.datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sistema_TipTop.pojos.*;

public class baseDatos {

    Connection conn = null;
    PreparedStatement prepSt = null;
    Statement st = null;
    ResultSet rs = null;

    public baseDatos() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void insertarArticulo(articulo articulo) {

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            File fileFoto = articulo.getFotoArticulo();
            FileInputStream fis = new FileInputStream(fileFoto);

            String sql = "INSERT INTO cat_articulos (id_articulo,nombre_art,desc_art,stock_art,foto_art,uMedida_art,pVenta_art,"
                    + "pCompra_art,id_categorias,id_proveedor,existencias_art)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?)";
            prepSt = conn.prepareStatement(sql);

            prepSt.setInt(1, articulo.getIdArticulo());
            prepSt.setString(2, articulo.getNombreArt());
            prepSt.setString(3, articulo.getDescArticulo());
            prepSt.setDouble(4, articulo.getStockArticulo());
            long tamanoFoto = fileFoto.length();
            prepSt.setBinaryStream(5, fis, tamanoFoto);
            prepSt.setDouble(6, articulo.getuMedidaArticulo());
            prepSt.setDouble(7, articulo.getpVentaArticulo());
            prepSt.setDouble(8, articulo.getpCompraArticulo());
            prepSt.setInt(9, articulo.getIdCategorias());
            prepSt.setInt(10, articulo.getIdProveedor());
            prepSt.setInt(11, articulo.getExistenciasArticulo());

            prepSt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(baseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void borrarArticulo(articulo art) {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "DELETE FROM cat_articulos WHERE id_articulo=" + art;
            prepSt = conn.prepareStatement(sql);
            prepSt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void borrarPersonal(personal per) {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "DELETE FROM personal WHERE id_personal=" + per;
            prepSt = conn.prepareStatement(sql);
            prepSt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    public InputStream buscarFoto(articulo articulo) {
        InputStream streamFoto = null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");

            String sql = "SELECT foto_art from cat_articulos where id_articulo=?";

            prepSt = conn.prepareStatement(sql);
            prepSt.setInt(1, articulo.getIdArticulo());
            rs = prepSt.executeQuery();

            while (rs.next()) {
                streamFoto = rs.getBinaryStream("foto_art");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return streamFoto;
    }

    public InputStream buscarFotoPersonal(personal per) {
        InputStream streamFoto = null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");

            String sql = "SELECT foto_per from personal where id_personal=?";

            prepSt = conn.prepareStatement(sql);
            prepSt.setInt(1, per.getIdPersonal());
            rs = prepSt.executeQuery();

            while (rs.next()) {
                streamFoto = rs.getBinaryStream("foto_per");
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return streamFoto;
    }

    public void actualizarArticulo(articulo art) {

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");

            File fileFoto = art.getFotoArticulo();
            FileInputStream fis = new FileInputStream(fileFoto);

            System.out.println("holaaaa");
            String sql = "UPDATE cat_articulos SET desc_art=?,"
                    + "foto_art=?,"
                    + "stock_art=?,umedida_art=?,pventa_art=?,pcompra_art=?,existencias_art=?  WHERE id_articulo=" + art;
            prepSt = conn.prepareStatement(sql);


            prepSt.setString(1, art.getDescArticulo());
            long tamanoFoto = fileFoto.length();
            prepSt.setBinaryStream(2, fis, tamanoFoto);
            prepSt.setInt(3, art.getStockArticulo());
            prepSt.setDouble(4, art.getuMedidaArticulo());
            prepSt.setDouble(5, art.getpVentaArticulo());
            prepSt.setDouble(6, art.getpCompraArticulo());
            prepSt.setInt(7, art.getExistenciasArticulo());

            prepSt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(baseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void actualizarInventario(articulo articulo, double cantidad) {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "UPDATE cat_articulos SET existencias_art=? WHERE id_articulo=?";
            prepSt = conn.prepareStatement(sql);
            prepSt.setDouble(1, cantidad);
            prepSt.setInt(2, articulo.getIdArticulo());
            prepSt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void actualizarPersonal(personal per) {

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");

            File fileFoto = per.getFotoPer();
            FileInputStream fis = new FileInputStream(fileFoto);

            String sql = "UPDATE personal SET usuario_per=?, contrasenia_per=?,"
                    + "direccion_per=?, domicilio_fiscal_per=?, lugar_nac_per=?, sexo_per=?, fecha_nac_per=?, edad_per=?, "
                    + "inicio_contrrato_per=?, tiempo_laborado_per=?, dni_per=?, ruc_per=?, celular_per=?,"
                    + " telf_per=?, foto_per=? "
                    + " WHERE id_personal=" + per.getIdPersonal();
            prepSt = conn.prepareStatement(sql);

            System.out.println("prueba de actualizar personal");

            prepSt.setString(1, per.getUsuarioPer());
            prepSt.setString(2, per.getContraseniaPer());
            prepSt.setString(3, per.getDireccionPer());
            prepSt.setString(4, per.getDomicilioFiscalPer());
            prepSt.setString(5, per.getLugarNacPer());
            prepSt.setString(6, per.getSexoPer());
            prepSt.setString(7, per.getFechaNacPer());
            prepSt.setInt(8, per.getEdadPer());
            prepSt.setString(9, per.getInicioContratoPer());
            prepSt.setInt(10, per.getTiempoLaboradoPer());
            prepSt.setInt(11, per.getDNIper());
            prepSt.setInt(12, per.getRUCper());
            prepSt.setInt(13, per.getCelularPer());
            prepSt.setInt(14, per.getTelfPer());
            long tamanioFoto = fileFoto.length();
            prepSt.setBinaryStream(15, fis, tamanioFoto);

            prepSt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(baseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void insertarCategoriaArticulo(categorias categoria) {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "INSERT INTO cat_categorias (nombre_cat_art,desc_cat_art)"
                    + "values(?,?)";
            prepSt = conn.prepareStatement(sql);
            prepSt.setString(1, categoria.getNombreCategoria());
            prepSt.setString(2, categoria.getDescCategoria());
            prepSt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void insertarProveedor(proveedor prov) {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "INSERT INTO cat_proveedor (id_proveedor,nombre_prov,direccion_prov,telef_prov,email_prov,"
                    + "                     nombre_contacto,pCompra_art)"
                    + "values(?,?,?,?,?,?,?)";
            prepSt = conn.prepareStatement(sql);
            prepSt.setInt(1, prov.getIdProveedor());
            prepSt.setString(2, prov.getNombreProv());
            prepSt.setString(3, prov.getDireccionProv());
            prepSt.setInt(4, prov.getTelefonoProv());
            prepSt.setString(5, prov.getEmailProv());
            prepSt.setString(6, prov.getNombreContactoProv());
            prepSt.setDouble(7, prov.getpCompraAriculo());
            prepSt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public Long insertarVenta(ventas venta) {
        Long lastVal = 0l;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "INSERT INTO ventas (monto_venta,fecha_ventas"
                    + "values(?,?)";
            prepSt = conn.prepareStatement(sql);
            prepSt.setDouble(1, venta.getMontoVenta());
            prepSt.setDate(2, venta.getFechaVenta());
            prepSt.executeUpdate();
            prepSt.close();
            prepSt = this.conn.prepareStatement("select lastval()");
            rs = prepSt.executeQuery();
            while (rs.next()) {
                lastVal = rs.getLong("lastval");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return lastVal;
    }

    public void insertarDetalleVenta(detalleVentas detalle) {

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "INSERT INTO detalle_ventas (id_ventas,id_art,cantidad_art,importe_venta)"
                    + "values(?,?,?,?)";
            prepSt = conn.prepareStatement(sql);
            prepSt.setLong(1, detalle.getIdVentas());
            prepSt.setString(2, detalle.getIdArticulo());
            prepSt.setDouble(3, detalle.getCantidadArticulo());
            prepSt.setDouble(4, detalle.getImporteVenta());
            prepSt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void obtenerArticulo(articulo art) {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "SELECT * from cat_articulos where id_articulo =?";

            prepSt = conn.prepareStatement(sql);
            prepSt.setInt(1, art.getIdArticulo());

            rs = prepSt.executeQuery();
            while (rs.next()) {
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public ArrayList<articulo> obtenerArticuloPorCriterio(String criterio) {
        ArrayList<articulo> listaArticulos = new ArrayList<articulo>();
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "SELECT * FROM cat_articulos"
                    //                    + " WHERE id_articulo LIKE '"+criterio+"%'"
                    //                    + " OR nombre_art LIKE '"+criterio+"%'"
                    + " WHERE nombre_art LIKE '" + criterio + "%'"
                    + " order by nombre_art";
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id_articulo");
                String nombre = rs.getString("nombre_art");
                String descripcion = rs.getString("desc_art");
                int stock = rs.getInt("stock_art");
                double unidad = rs.getDouble("uMedida_art");
                double precioVenta = rs.getDouble("pVenta_art");
                double precioCompra = rs.getDouble("pCompra_art");
                int existencias = rs.getInt("existencias_art");
                int idCategoria = rs.getInt("id_categorias");
                int idProveedor = rs.getInt("id_proveedor");

                articulo articulo = new articulo(id, nombre, descripcion, stock, unidad, precioVenta, precioCompra, idCategoria, idProveedor, existencias, null);
                listaArticulos.add(articulo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaArticulos;
    }
    
    public articulo obtenerArticuloParaVenta(String criterio){
        articulo art =null;
        try {
            System.out.println("prueba conexion");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "SELECT * FROM cat_articulos "
                    //                    + " WHERE id_articulo LIKE '"+criterio+"%'"
                    //                    + " OR nombre_art LIKE '"+criterio+"%'"
                    + " WHERE nombre_art LIKE '" + criterio + "%' ;";
//                    + "OR id_articulo LIKE '" + criterio + "%'"
//                    + " order by nombre_art";
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                
                int id = rs.getInt("id_articulo");
                String nombre = rs.getString("nombre_art");
                String descripcion = rs.getString("desc_art");
                int stock = rs.getInt("stock_art");
                double unidad = rs.getDouble("uMedida_art");
                double precioVenta = rs.getDouble("pVenta_art");
                double precioCompra = rs.getDouble("pCompra_art");
                int existencias = rs.getInt("existencias_art");
                int idCategoria = rs.getInt("id_categorias");
                int idProveedor = rs.getInt("id_proveedor");

                art = new articulo(id, nombre, descripcion, stock, unidad, precioVenta, precioCompra, idCategoria, idProveedor, existencias, null);
                
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
//        finally {
//            try {
//                prepSt.close();
//                conn.close();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }

        return art;        
    }

    public ArrayList<personal> obtenerPersonalPorCriterio(String criterio) {
        ArrayList<personal> listaPersonal = new ArrayList<personal>();
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "SELECT * FROM personal"
                    //                    + " WHERE id_articulo LIKE '"+criterio+"%'"
                    //                    + " OR nombre_art LIKE '"+criterio+"%'"
                    + " WHERE nombre_per LIKE '" + criterio + "%'"
                    + " order by nombre_per";
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                int codigo = rs.getInt("id_personal");
                String nombre = rs.getString("nombre_per");
                String usuario = rs.getString("usuario_per");
                String contrasenia = rs.getString("contrasenia_per");
                String direccion = rs.getString("direccion_per");
                String domicilio = rs.getString("domicilio_fiscal_per");
                String lugarNac = rs.getString("lugar_nac_per");
                String fechaNac = rs.getString("fecha_nac_per");
                String sexo = rs.getString("sexo_per");
                int edad = rs.getInt("edad_per");
                String inicContra = rs.getString("inicio_contrrato_per");
                int tiempoLab = rs.getInt("tiempo_laborado_per");
                int dni = rs.getInt("dni_per");
                int ruc = rs.getInt("ruc_per");
                int celular = rs.getInt("celular_per");
                int telefono = rs.getInt("telf_per");

                personal persona = new personal(codigo, null, nombre, usuario, contrasenia, direccion, domicilio, lugarNac, sexo, fechaNac, edad, inicContra, tiempoLab, dni, ruc, celular, telefono);
                listaPersonal.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaPersonal;
    }

    public ArrayList<articulo> obtenerArticulos() {
        ArrayList<articulo> listaArticulos = new ArrayList<articulo>();
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "SELECT * FROM cat_articulos"
                    + " order by nombre_art";
            prepSt = conn.prepareStatement(sql);
            rs = prepSt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_articulo");
                String nombre = rs.getString("nombre_art");
                String descripcion = rs.getString("desc_art");
                int stock = rs.getInt("stock_art");
                double unidad = rs.getDouble("uMedida_art");
                double precioVenta = rs.getDouble("pVenta_art");
                double precioCompra = rs.getDouble("pCompra_art");
                int existencias = rs.getInt("existencias_art");
                int idCategoria = rs.getInt("id_categorias");
                int idProveedor = rs.getInt("id_proveedor");

                articulo articulo = new articulo(id, nombre, descripcion, stock, unidad, precioVenta, precioCompra, idCategoria, idProveedor, existencias, null);
                listaArticulos.add(articulo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaArticulos;
    }

    public ArrayList<categorias> obtenerCategorias() {
        ArrayList<categorias> listaCategorias = new ArrayList<categorias>();
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "SELECT * FROM cat_categorias";
            prepSt = conn.prepareStatement(sql);
            rs = prepSt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_categoria_art");
                String nombre = rs.getString("nombre_cat_art");
                String descripcion = rs.getString("desc_cat_art");

                categorias categoria = new categorias(id, nombre, descripcion);
                listaCategorias.add(categoria);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaCategorias;
    }

    public ArrayList<proveedor> obtenerProveedores() {
        ArrayList<proveedor> listaProveedores = new ArrayList<proveedor>();
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "SELECT * FROM cat_proveedor";
            prepSt = conn.prepareStatement(sql);
            rs = prepSt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_proveedor");
                String nombre = rs.getString("nombre_prov");
                String direccion = rs.getString("direccion_prov");
                int telefono = rs.getInt("telef_prov");
                String email = rs.getString("email_prov");
                String contacto = rs.getString("nombre_contacto");
                double precioCompra = rs.getDouble("pCompra_art");

                proveedor proveedor = new proveedor(id, nombre, direccion, telefono, email, contacto, precioCompra);
                listaProveedores.add(proveedor);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaProveedores;
    }

    public ArrayList<personal> obtenerPersonal() {
        ArrayList<personal> listaPersonal = new ArrayList<personal>();
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "SELECT * FROM personal"
                    + " order by nombre_per";
            prepSt = conn.prepareStatement(sql);
            rs = prepSt.executeQuery();

            while (rs.next()) {

                int codigo = rs.getInt("id_personal");
                String nombre = rs.getString("nombre_per");
                String usuario = rs.getString("usuario_per");
                String contrasenia = rs.getString("contrasenia_per");
                String direccion = rs.getString("direccion_per");
                String domicilio = rs.getString("domicilio_fiscal_per");
                String lugarNac = rs.getString("lugar_nac_per");
                String fechaNac = rs.getString("fecha_nac_per");
                String sexo = rs.getString("sexo_per");
                int edad = rs.getInt("edad_per");
                String inicContra = rs.getString("inicio_contrrato_per");
                int tiempoLab = rs.getInt("tiempo_laborado_per");
                int dni = rs.getInt("dni_per");
                int ruc = rs.getInt("ruc_per");
                int celular = rs.getInt("celular_per");
                int telefono = rs.getInt("telf_per");

                personal persona = new personal(codigo, null, nombre, usuario, contrasenia, direccion, domicilio, lugarNac, sexo, fechaNac, edad, inicContra, tiempoLab, dni, ruc, celular, telefono);
                listaPersonal.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaPersonal;

    }

//    public void insertarPersonal(personal personal) {
//        try {
//            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
//            File fileFoto = personal.getFotoPer();
//            FileInputStream fis = new FileInputStream(fileFoto);
//
////            String sql = "INSERT INTO personal (id_personal,foto_per,nombre_per,usuario_per,"
////                    + "contraseña_per,direccion_per,domicilio_fiscal_per,lugar_nac_per,sexo_per,fecha_nac_per,"
////                    + "edad_per,inicio_contrato_per,tiempo_laborado_per,DNI_per,RUC_per,celular_per,telef_per)"
//              String sql = "INSERT INTO personal (id_personal,foto_per,nombre_per,usuario_per,"
//                      + "contrasenia_per,direccion_per,domicilio_fiscal_per,lugar_nac_per,sexo_per,fecha_nac_per,"
//                      + "edad_per,inicio_contrrato_per,tiempo_laborado_per,dni_per,ruc_per,celular_per,telf_per)"
//                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//            prepSt = conn.prepareStatement(sql);
//
//            prepSt.setInt(1, personal.getIdPersonal());
//            long tamanoFoto = fileFoto.length();
//            prepSt.setBinaryStream(2, fis, tamanoFoto);
//            prepSt.setString(3, personal.getNombrePer());
//            prepSt.setString(4, personal.getUsuarioPer());
//            prepSt.setString(5, personal.getContraseniaPer());
//            prepSt.setString(6, personal.getDireccionPer());
//            prepSt.setString(7, personal.getDomicilioFiscalPer());
//            prepSt.setString(8, personal.getLugarNacPer());
//            prepSt.setString(9, personal.getSexoPer());
//            prepSt.setString(10, personal.getFechaNacPer());
//            prepSt.setInt(11, personal.getEdadPer());
//            prepSt.setString(12, personal.getInicioContratoPer());
//            prepSt.setInt(13, personal.getTiempoLaboradoPer());
//            prepSt.setInt(14, personal.getDNIper());
//            prepSt.setInt(15, personal.getRUCper());
//            prepSt.setInt(16, personal.getCelularPer());
//            prepSt.setInt(17, personal.getTelfPer());
//
//            prepSt.executeUpdate();
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(baseDatos.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                prepSt.close();
//                conn.close();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//
//    }
    public void insertarPersonal(personal persona) {
       
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
                          
            
            File fileFoto = persona.getFotoPer();
            FileInputStream fis = new FileInputStream(fileFoto);

//            String sql = "INSERT INTO personal (id_personal,foto_per,nombre_per,usuario_per,"
//                    + "contraseña_per,direccion_per,domicilio_fiscal_per,lugar_nac_per,sexo_per,fecha_nac_per,"
//                    + "edad_per,inicio_contrato_per,tiempo_laborado_per,DNI_per,RUC_per,celular_per,telef_per)"
            String sql = "INSERT INTO personal (id_personal,nombre_per,usuario_per,"
                    + "contrasenia_per,direccion_per,domicilio_fiscal_per,lugar_nac_per,sexo_per,fecha_nac_per,"
                    + "edad_per,inicio_contrrato_per,tiempo_laborado_per,dni_per,ruc_per,celular_per,telf_per,foto_per)"
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            prepSt = conn.prepareStatement(sql);

            prepSt.setInt(1, persona.getIdPersonal());
            prepSt.setString(2, persona.getNombrePer());
            prepSt.setString(3, persona.getUsuarioPer());
            prepSt.setString(4, persona.getContraseniaPer());
            prepSt.setString(5, persona.getDireccionPer());
            prepSt.setString(6, persona.getDomicilioFiscalPer());
            prepSt.setString(7, persona.getLugarNacPer());
            prepSt.setString(8, persona.getSexoPer());
            prepSt.setString(9, persona.getFechaNacPer());
            prepSt.setInt(10, persona.getEdadPer());
            prepSt.setString(11, persona.getInicioContratoPer());
            prepSt.setInt(12, persona.getTiempoLaboradoPer());
            prepSt.setInt(13, persona.getDNIper());
            prepSt.setInt(14, persona.getRUCper());
            prepSt.setInt(15, persona.getCelularPer());
            prepSt.setInt(16, persona.getTelfPer());
            long tamanioFoto = fileFoto.length();
            prepSt.setBinaryStream(17, fis, tamanioFoto);

            prepSt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(baseDatos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void insertarRolesPersonal(rolePersonal roles) {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "INSERT INTO roles_personal (nombre_per,rol_per)"
                    + "values(?,?)";
            prepSt = conn.prepareStatement(sql);
            prepSt.setString(1, roles.getNombrePer());
            prepSt.setString(2, roles.getRolPer());
            prepSt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void insertarContactosPersonal(contactosPersonal contactos) {
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/base_datos_TipTop", "postgres", "fiupla123");
            String sql = "INSERT INTO contactos_personal (id_contacto_per,tipo_parentezco,nombre_pariente,direccion_pariente,cel_pariente)"
                    + "values(?,?,?,?,?)";
            prepSt = conn.prepareStatement(sql);
            prepSt.setInt(1, contactos.getIdContactoPersonal());
            prepSt.setString(2, contactos.getTipoParentezco());
            prepSt.setString(3, contactos.getNombrePariente());
            prepSt.setString(4, contactos.getDireccionPariente());
            prepSt.setInt(5, contactos.getCelPariente());
            prepSt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                prepSt.close();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    //Metodo main para realizar prueba de conectividad
    public static void main(String[] args) {

//          articulo a=new articulo("123", "papaya", "grande peluda", 2, 3, 4, 5, 6, 7, 8, null);
//          baseDatos bd=new baseDatos();
//          bd.insertarArticulo(a);
//            detalleVentas detalle=new detalleVentas(345678, 1223, "PAPAYA442", 5, 24);
//            baseDatos bd=new baseDatos();
//            bd.insertarDetalleVenta(detalle);
//        categorias categoria = new categorias(344564, "HACHST", "Descripcion TU ABELA");
//        baseDatos base = new baseDatos();
//        base.insertarCategoriaArticulo(categoria);
//          personal p=new personal(666666,null,"Pancho perez","pablito24","1234","colombia","calle jauja","Huancayo","M","24-05-99",22,"Enero 2020",6,4,9,2,4);
//          baseDatos base=new baseDatos();
//          base.insertarPersonal2(p);
//        rolePersonal roles = new rolePersonal(551732, "Jose Ilizarbe", "Auxiliar logistica");
//        baseDatos bd = new baseDatos();
//        bd.insertarRolesPersonal(roles);
//        contactosPersonal contac = new contactosPersonal(123, "tio", "Jorge luis", "Avenida las flores", 996377053);
//        baseDatos bd = new baseDatos();
//        bd.insertarContactosPersonal(contac);
    }
}
