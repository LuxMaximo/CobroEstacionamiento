package ar.edu.unju.fi.Aplicacion.model.dominio;

import java.util.Date;

public interface AplicacionWEB {
    void cobroEstacionamiento(Calle calle, String patente, Date dia, Date hora);

}
