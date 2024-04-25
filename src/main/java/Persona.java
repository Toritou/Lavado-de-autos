import java.util.Scanner;

public class Persona {
        private String nombre;
        private String rut;
        private String telefono;
        private String patente;
        private String modelo;

        //Constructor vacio pera crear la persona//
        public Persona() {
        }
        //Constructor//
        public Persona(String nombre, String rut, String telefono, String patente, String modelo) {
            this.nombre = nombre;
            this.rut = rut;
            this.telefono = telefono;
            this.patente = patente;
            this.modelo = modelo;
        }

        //Metodos getters//}
        public String getNombre() {
            return nombre;
        }

        public String getRut() {
            return rut;
        }

        public String getTelefono() {
            return telefono;
        }

        public String getPatente() {
            return patente;
        }

        public String getModelo() {
            return modelo;
        }

    //Metodos setters//
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public void setRut(String rut) {
            this.rut = rut;
        }
        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public void setPatente(String patente) {
            this.patente = patente;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        //Metodo toString//
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", telefono='" + telefono + '\'' +
                ", patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    //Crear persona//
    public static Persona crearPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese rut: ");
        String rut = sc.nextLine();
        System.out.println("Ingrese telefono: ");
        String telefono = sc.nextLine();
        System.out.println("Ingrese patente: ");
        String patente = sc.nextLine();
        System.out.println("Ingrese modelo: ");
        String modelo = sc.nextLine();
        return new Persona(nombre, rut, telefono, patente, modelo);
    }
}
