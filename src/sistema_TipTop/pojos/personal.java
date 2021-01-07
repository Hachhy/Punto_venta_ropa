
package sistema_TipTop.pojos;

import java.io.File;

public class personal {
    private int idPersonal;
    private File fotoPer;
    private String nombrePer;
    private String usuarioPer;
    private String contraseniaPer;
    private String direccionPer;
    private String domicilioFiscalPer;
    private String lugarNacPer;
    private String sexoPer;
    private String fechaNacPer;
    private int edadPer;
    private String inicioContratoPer;
    private int tiempoLaboradoPer;
    private int DNIper;
    private int RUCper;
    private int celularPer;
    private int telfPer;

    public personal(int idPersonal, File fotoPer , String nombrePer, String usuarioPer, String contraseniaPer, String direccionPer, String domicilioFiscalPer, String lugarNacPer, String sexoPer, String fechaNacPer, int edadPer, String inicioContratoPer, int tiempoLaboradoPer, int DNIper, int RUCper, int celularPer, int telfPer) {
        this.idPersonal = idPersonal;
        this.fotoPer = fotoPer;
        this.nombrePer = nombrePer;
        this.usuarioPer = usuarioPer;
        this.contraseniaPer=contraseniaPer;
        this.direccionPer = direccionPer;
        this.domicilioFiscalPer = domicilioFiscalPer;
        this.lugarNacPer = lugarNacPer;
        this.sexoPer = sexoPer;
        this.fechaNacPer = fechaNacPer;
        this.edadPer = edadPer;
        this.inicioContratoPer = inicioContratoPer;
        this.tiempoLaboradoPer = tiempoLaboradoPer;
        this.DNIper = DNIper;
        this.RUCper = RUCper;
        this.celularPer = celularPer;
        this.telfPer = telfPer;
    }

    public int getTelfPer() {
        return telfPer;
    }

    public void setTelfPer(int telfPer) {
        this.telfPer = telfPer;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }

    
    public File getFotoPer() {
        return fotoPer;
    }

    public void setFotoPer(File fotoPer) {
        this.fotoPer = fotoPer;
    }

    public String getNombrePer() {
        return nombrePer;
    }

    public void setNombrePer(String nombrePer) {
        this.nombrePer = nombrePer;
    }

    public String getUsuarioPer() {
        return usuarioPer;
    }

    public void setUsuarioPer(String usuarioPer) {
        this.usuarioPer = usuarioPer;
    }
    
    public String getContraseniaPer(){
        return contraseniaPer;
    }
    
    public void setContraseniaPer(String contraseniaPer){
        this.contraseniaPer=contraseniaPer;
    }

    public String getDireccionPer() {
        return direccionPer;
    }

    public void setDireccionPer(String direccionPer) {
        this.direccionPer = direccionPer;
    }

    public String getDomicilioFiscalPer() {
        return domicilioFiscalPer;
    }

    public void setDomicilioFiscalPer(String domicilioFiscalPer) {
        this.domicilioFiscalPer = domicilioFiscalPer;
    }

    public String getLugarNacPer() {
        return lugarNacPer;
    }

    public void setLugarNacPer(String lugarNacPer) {
        this.lugarNacPer = lugarNacPer;
    }

    public String getSexoPer() {
        return sexoPer;
    }

    public void setSexoPer(String sexoPer) {
        this.sexoPer = sexoPer;
    }

    public String getFechaNacPer() {
        return fechaNacPer;
    }

    public void setFechaNacPer(String fechaNacPer) {
        this.fechaNacPer = fechaNacPer;
    }

    public int getEdadPer() {
        return edadPer;
    }

    public void setEdadPer(int edadPer) {
        this.edadPer = edadPer;
    }

    public String getInicioContratoPer() {
        return inicioContratoPer;
    }

    public void setInicioContratoPer(String inicioContratoPer) {
        this.inicioContratoPer = inicioContratoPer;
    }

    public int getTiempoLaboradoPer() {
        return tiempoLaboradoPer;
    }

    public void setTiempoLaboradoPer(int tiempoLaboradoPer) {
        this.tiempoLaboradoPer = tiempoLaboradoPer;
    }

    public int getDNIper() {
        return DNIper;
    }

    public void setDNIper(int DNIper) {
        this.DNIper = DNIper;
    }

    public int getRUCper() {
        return RUCper;
    }

    public void setRUCper(int RUCper) {
        this.RUCper = RUCper;
    }

    public int getCelularPer() {
        return celularPer;
    }

    public void setCelularPer(int celularPer) {
        this.celularPer = celularPer;
    }
    
    @Override
    public String toString(){
        return String.valueOf(idPersonal);
    }
}
