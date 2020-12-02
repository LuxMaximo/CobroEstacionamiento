package ar.edu.unju.fi.Aplicacion.model.dominio;

public class Calle interface AplicacionWEB{
    private boolean lugarDisponible;

    public void cobroEstacionamiento() {
    }

    boolean isLugarDisponible() {
        return this.lugarDisponible;
    }

    void setLugarDisponible(boolean value) {
       this.lugarDisponible = value;
    }
//agrego un comentario
}
