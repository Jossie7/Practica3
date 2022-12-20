package Practica3;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 5. Vamos a utilizar las 3 clases
        Direcciones direccion1 = new Direcciones();
        direccion1.setTipoVia("Calle");
        direccion1.setNombreVia("El Prado");
        direccion1.setNumeroVia(19);
        direccion1.setInformacionAdicional("1ªA");
        direccion1.setCodigoPostal(11600);
        direccion1.setLocalidad("Ubrique");
        direccion1.setProvincia("Cádiz");

        Casa casa1=new Casa();
        casa1.setPrecio(600);
        casa1.setCatastral("452CDF");
        casa1.setEnergía('a');
        casa1.setDireccion(direccion1);

        Alumno alumno1=new Alumno();
        alumno1.setNombre("Juan");
        alumno1.setApellido("Dominguez");
        alumno1.setEdad(18);
        alumno1.setCorreo("jdom@hotmail.com");
        alumno1.setRepetidor(false);
        alumno1.setNotamedia(9.63);
        alumno1.setDireccion(direccion1);
        alumno1.setCasa(casa1);

        Alumno alumno2=new Alumno(); //Hereda de Persona, es del ejercicio 7
        alumno2.setNombre("Pepe");
        alumno2.setPrimerApellido("Juarez");
        alumno2.setSegundoApellido("Ramirez");
        alumno2.setEdad(9);
        alumno2.setCorreo("pepe@gmail.com");
        alumno2.setRepetidor(false);
        alumno2.setCasa(casa1);
        alumno2.setDireccion(direccion1);
        alumno2.setNotamedia(9.6);

        Alumno alumno3=new Alumno(); //Ejercicio 7
        alumno3.setNombre("Mario");
        alumno3.setPrimerApellido("Caceres");
        alumno3.setSegundoApellido("Guerrero");
        alumno3.setEdad(19);
        alumno3.setCorreo("Macag@gmail.com");
        alumno3.setRepetidor(true);
        alumno3.setCasa(casa1);
        alumno3.setDireccion(direccion1);
        alumno3.setNotamedia(7.6);

//Ejercicio 8, crear método para comparar las notas medias:
        alumno1.CompararNotaMedia(alumno1, alumno3);
        alumno1.CompararNotaMedia(alumno2,alumno3);
        alumno1.CompararNotaMedia(alumno1,alumno2);
        alumno2.CompararNotaMedia(alumno3,alumno1);



        }
    }

