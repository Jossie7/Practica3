package Practica3;

public class Casa {
    //Para que sea público tenemos que poner public.
        //Vamos a crear nuestros campos:
        private Integer precio;
        private  Character  energía;
        private String catastral;

        final static Integer Iva=21;
        final static Integer Ivareducido=16;
        private Direcciones direccion; //Ejercicio 4


    public Direcciones getDireccion() {
        return direccion;
    }

    public void setDireccion(Direcciones direccion) {
        this.direccion = direccion;
    }

    public Integer getPrecio() {
            return precio;
        }

        public String getCatastral() {
            return catastral;
        }

        public Character getEnergía() {
            return energía;
        }

        public void setCatastral(String catastral) {
            this.catastral = catastral;
        }

        public void setEnergía(Character energía) {
            this.energía = energía;
        }

        public void setPrecio(Integer precio) {
            this.precio = precio;
        }



    void MostrarPrecioConIva(){
            System.out.println("El precio con el IVA es: "  +  (precio + precio*Iva/100));
        }

        void MostrarPrecioConIvareducido () {
            System.out.println("El precio con IVA reducido es: " + (precio + precio * Ivareducido / 100));
        }
        void MostrarCatastral_Y_Precios(){
            System.out.println("La referencia catastral es: " + catastral + " | El precio sin Iva es: " + precio + " | El precio con IVA es:" + (precio += precio*Iva/100)
                    + " | El precio con IVA reducido es: " + (precio += precio * Ivareducido / 100));
        }
    }

