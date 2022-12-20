package Practica3;
import Paquete_raro.Persona; //Para usar de otro paquete (Ejercicio 7), para usar de otro paquete se tiene que importar
public class Alumno extends Persona{
    private String nombre;
    private String apellido;
    private Integer edad;
    private Boolean repetidor;
    private Double notamedia;
    private  String correo;

    private Casa casa;
    private Direcciones direccion; //Esto es del ejercicio 4- composicion

    public Direcciones getDireccion() {
        return direccion;
    }

    public void setDireccion(Direcciones direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Boolean getRepetidor() {
        return repetidor;
    }

    public Double getNotamedia() {
        return notamedia;
    }

    public String getCorreo() {
        return correo;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNotamedia(Double notamedia) {
        this.notamedia = notamedia;
    }

    public void setRepetidor(Boolean repetidor) {
        this.repetidor = repetidor;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    void MostrarNombreYEdad(){
        System.out.println("El nombre del alumno es: " + nombre + ". El apellido del alumno es : " + apellido + ". La edad del alumno es: " + edad );
    }
    Alumno(){}
    public Alumno (String nombre,String apellido, Integer edad ){
        this.nombre=nombre;
        this.edad=edad;
        this.apellido=apellido;
    }

    public void CompararNotaMedia(Alumno alumno1, Alumno alumno3) {
        double notamedia1=alumno1.getNotamedia();
        double notamedia2=alumno3.getNotamedia();

        if (notamedia1>notamedia2){
            System.out.println(alumno1.getNombre() + " es el que tiene la nota media más alta de los 2, porque tiene: "
                    + notamedia1 + " ,en cambio " + alumno3.getNombre() + "tiene: " + notamedia2);
        }
        if (notamedia2>notamedia1){
            System.out.println(alumno3.getNombre() + "  el que tiene la nota media más alta de los 2, porque tiene: "
                    + notamedia2 + " ,en cambio " + alumno1.getNombre() + " tiene: " + notamedia1);
        }
        else System.out.println(" Los dos tienen la misma nota");
    }
}
