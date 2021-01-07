
package sistema_TipTop.pojos;


public class proveedor {
    private int idProveedor;
    private String nombreProv;
    private String direccionProv;
    private int telefonoProv;
    private String emailProv;
    private String nombreContactoProv;
    private double pCompraAriculo;

    public proveedor(int idProveedor, String nombreProv, String direccionProv, int telefonoProv, String emailProv, String nombreContactoProv, double pCompraAriculo) {
        this.idProveedor = idProveedor;
        this.nombreProv = nombreProv;
        this.direccionProv = direccionProv;
        this.telefonoProv = telefonoProv;
        this.emailProv = emailProv;
        this.nombreContactoProv = nombreContactoProv;
        this.pCompraAriculo = pCompraAriculo;
    }

    public double getpCompraAriculo() {
        return pCompraAriculo;
    }

    public void setpCompraAriculo(double pCompraAriculo) {
        this.pCompraAriculo = pCompraAriculo;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public String getDireccionProv() {
        return direccionProv;
    }

    public void setDireccionProv(String direccionProv) {
        this.direccionProv = direccionProv;
    }

    public int getTelefonoProv() {
        return telefonoProv;
    }

    public void setTelefonoProv(int telefonoProv) {
        this.telefonoProv = telefonoProv;
    }

    public String getEmailProv() {
        return emailProv;
    }

    public void setEmailProv(String emailProv) {
        this.emailProv = emailProv;
    }

    public String getNombreContactoProv() {
        return nombreContactoProv;
    }

    public void setNombreContactoProv(String nombreContactoProv) {
        this.nombreContactoProv = nombreContactoProv;
    }
    
    @Override
    public String toString(){
        return this.nombreProv;
    }
}
