
package sistema_TipTop.pojos;

public class rolePersonal {
    private int idRolesPersonal;
    private String nombrePer;
    private String rolPer;
    
    public rolePersonal(int idRolesPersonal, String nombrePer, String rolPer) {
        this.idRolesPersonal = idRolesPersonal;
        this.nombrePer = nombrePer;
        this.rolPer = rolPer;
    }


    public String getRolPer() {
        return rolPer;
    }

    public void setRolPer(String rolPer) {
        this.rolPer = rolPer;
    }

    public int getIdRolesPersonal() {
        return idRolesPersonal;
    }

    public void setIdRolesPersonal(int idRolesPersonal) {
        this.idRolesPersonal = idRolesPersonal;
    }

    public String getNombrePer() {
        return nombrePer;
    }

    public void setNombrePer(String nombrePer) {
        this.nombrePer = nombrePer;
    }
}
