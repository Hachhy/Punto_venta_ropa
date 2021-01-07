
package sistema_TipTop.pojos;

public class contactosPersonal {
    private int idContactoPersonal;
    private String tipoParentezco;
    private String nombrePariente;
    private String direccionPariente;
    private int celPariente;

    public contactosPersonal(int idContactoPersonal, String tipoParentezco, String nombrePariente, String direccionPariente, int celPariente) {
        this.idContactoPersonal = idContactoPersonal;
        this.tipoParentezco = tipoParentezco;
        this.nombrePariente = nombrePariente;
        this.direccionPariente = direccionPariente;
        this.celPariente = celPariente;
    }

    public int getCelPariente() {
        return celPariente;
    }

    public void setCelPariente(int celPariente) {
        this.celPariente = celPariente;
    }

    public int getIdContactoPersonal() {
        return idContactoPersonal;
    }

    public void setIdContactoPersonal(int idContactoPersonal) {
        this.idContactoPersonal = idContactoPersonal;
    }

    public String getTipoParentezco() {
        return tipoParentezco;
    }

    public void setTipoParentezco(String tipoParentezco) {
        this.tipoParentezco = tipoParentezco;
    }

    public String getNombrePariente() {
        return nombrePariente;
    }

    public void setNombrePariente(String nombrePariente) {
        this.nombrePariente = nombrePariente;
    }

    public String getDireccionPariente() {
        return direccionPariente;
    }

    public void setDireccionPariente(String direccionPariente) {
        this.direccionPariente = direccionPariente;
    }
}
