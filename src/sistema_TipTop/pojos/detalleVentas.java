
package sistema_TipTop.pojos;


public class detalleVentas {
    private int idDetalleVentas;
    private int idVentas;
    private String idArticulo;
    private int cantidadArticulo;
    private double importeVenta;

    public detalleVentas(int idDetalleVentas, int idVentas, String idArticulo, int cantidadArticulo, double importeVenta) {
        this.idDetalleVentas = idDetalleVentas;
        this.idVentas = idVentas;
        this.idArticulo = idArticulo;
        this.cantidadArticulo = cantidadArticulo;
        this.importeVenta = importeVenta;
    }

    public double getImporteVenta() {
        return importeVenta;
    }

    public void setImporteVenta(double importeVenta) {
        this.importeVenta = importeVenta;
    }

    public int getIdDetalleVentas() {
        return idDetalleVentas;
    }

    public void setIdDetalleVentas(int idDetalleVentas) {
        this.idDetalleVentas = idDetalleVentas;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public String getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(String idArticulo) {
        this.idArticulo = idArticulo;
    }

    public int getCantidadArticulo() {
        return cantidadArticulo;
    }

    public void setCantidadArticulo(int cantidadArticulo) {
        this.cantidadArticulo = cantidadArticulo;
    }
}
