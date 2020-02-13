package edu.elsmancs.Bici_palma.domain;

public class TarjetaUsuario {
    private String id = null; // 9 dígitos
    private Boolean activada = false;

    public TarjetaUsuario(String id, Boolean activada) {
        this.id = id;
        this.activada = activada;
    }
    //GETTER Y SETTER BOOLEANO para solicitas si la tarjeta está activada en la clase Estacion

    public Boolean getActivada() {
        return this.activada;
    }

    public void setActivada(Boolean activada) {
        this.activada = activada;
    }

    public String getId() {
        return this.id = id;
    }

 //Comprobar longitud de la id
    public Boolean getTamañoId() {
        if (getId().length() != 9) {
            return false;
        }else {
            return true;
        }
    }


}
