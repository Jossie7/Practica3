package Practica3;

public class Direcciones {
    String tipoVia;
    String nombreVia;
    Integer numeroVia;
    String informacionAdicional;
    Integer codigoPostal;
    String localidad;
    String provincia;

    public String getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public Integer getNumeroVia() {
        return numeroVia;
    }

    public void setNumeroVia(Integer numeroVia) {
        this.numeroVia = numeroVia;
    }

    public String getInformacionAdicional() {
        return informacionAdicional;
    }

    public void setInformacionAdicional(String informacionAdicional) {
        this.informacionAdicional = informacionAdicional;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    //Ejercicio 6:
    void imprimirDireccionCompleta(String tipoVia, String nombreVia, String informacionAdicional, Integer codigoPostal,
                                   String localidad, String provincia){
        System.out.println(this.tipoVia + this.nombreVia + this.numeroVia + this.informacionAdicional +this.codigoPostal + this.localidad + this.provincia);
    }
    //Sobrecarga el método anterior:
    void imprimirDireccionCompleta(String tipoVia, String nombreVia, String localidad){
        System.out.println(this.tipoVia + this.nombreVia + this.localidad);
    }
    //Constructor por defecto:
    public Direcciones(){}
    //Sbrecargamos el constructor
    public Direcciones(String tipoVia, String  nombrevia, Integer numerovia, String informacionAdicional, String localidad){
        this.tipoVia = tipoVia;
        this.nombreVia = nombreVia;
        this.numeroVia = numeroVia;
        this.informacionAdicional = informacionAdicional;
        this.localidad = localidad;
    }
}
