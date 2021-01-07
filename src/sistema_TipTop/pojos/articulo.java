
package sistema_TipTop.pojos;

import java.io.File;

public class articulo {
    private int idArticulo;
    private String nombreArt;
    private String descArticulo;
    private int stockArticulo;
    private double uMedidaArticulo;
    private double pVentaArticulo;
    private double pCompraArticulo;
    private int idCategorias;
    private int idProveedor;
    private int existenciasArticulo;
    private File fotoArticulo;

    public articulo(int idArticulo, String nombreArt, String descArticulo, int stockArticulo, double uMedidaArticulo, double pVentaArticulo, double pCompraArticulo, int idCategorias, int idProveedor, int existenciasArticulo,File foto) {
        this.idArticulo = idArticulo;
        this.nombreArt = nombreArt;
        this.descArticulo = descArticulo;
        this.stockArticulo = stockArticulo;
        this.uMedidaArticulo = uMedidaArticulo;
        this.pVentaArticulo = pVentaArticulo;
        this.pCompraArticulo = pCompraArticulo;
        this.idCategorias = idCategorias;
        this.idProveedor = idProveedor;
        this.existenciasArticulo = existenciasArticulo;
        this.fotoArticulo = foto;
    }

    public articulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public File getFotoArticulo() {
        return fotoArticulo;
    }

    public void setFotoArticulo(File fotoArticulo) {
        this.fotoArticulo = fotoArticulo;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombreArt() {
        return nombreArt;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public String getDescArticulo() {
        return descArticulo;
    }

    public void setDescArticulo(String descArticulo) {
        this.descArticulo = descArticulo;
    }

    public int getStockArticulo() {
        return stockArticulo;
    }

    public void setStockArticulo(int stockArticulo) {
        this.stockArticulo = stockArticulo;
    }

    public double getuMedidaArticulo() {
        return uMedidaArticulo;
    }

    public void setuMedidaArticulo(double uMedidaArticulo) {
        this.uMedidaArticulo = uMedidaArticulo;
    }

    public double getpVentaArticulo() {
        return pVentaArticulo;
    }

    public void setpVentaArticulo(double pVentaArticulo) {
        this.pVentaArticulo = pVentaArticulo;
    }

    public double getpCompraArticulo() {
        return pCompraArticulo;
    }

    public void setpCompraArticulo(double pCompraArticulo) {
        this.pCompraArticulo = pCompraArticulo;
    }

    public int getIdCategorias() {
        return idCategorias;
    }

    public void setIdCategorias(int idCategorias) {
        this.idCategorias = idCategorias;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getExistenciasArticulo() {
        return existenciasArticulo;
    }

    public void setExistenciasArticulo(int existenciasArticulo) {
        this.existenciasArticulo = existenciasArticulo;
    }
    @Override
    public String toString(){
        return String.valueOf(idArticulo);
    }
}
