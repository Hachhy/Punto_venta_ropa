
package sistema_TipTop.pojos;

import java.sql.Date;

public class ventas {
    private int idVentas;
    private double montoVenta;
    private Date fechaVenta;

    public ventas(int idVentas, double montoVenta, Date fechaVenta) {
        this.idVentas = idVentas;
        this.montoVenta = montoVenta;
        this.fechaVenta = fechaVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(int idVentas) {
        this.idVentas = idVentas;
    }

    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }
}
