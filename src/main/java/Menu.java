public class Menu {
    public void menu() {
        Scanner = new scanner(System.in);
        String opcion;
        do {
            System.out.println(" /n LAVADO LOCOSHÓN ");
            System.out.println("1. Crear Orden");
            System.out.println("2. Mostrar Ordenes");
            System.out.println("3. Completar Ordenes");
            System.out.println("4. Mostrar Ordenes Finalizadas");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    Persona persona = Persona.crearPersona();
                    System.out.println("Ingrese tipo de lavado: ");
                    String tipoLav = sc.nextLine();
                    System.out.println("Ingrese precio: ");
                    int precio = sc.nextInt();
                    Lavado lavado = new Lavado(tipoLav, precio);
                    Orden orden = new Orden(persona, lavado);
                    break;
                case "2":
                    Orden.mostrarOrdenes();
                    break;
                case "3":
                    Orden.completarOrden();
                    break;
                case "4":
                    Orden.mostrarOrdenesFinalizadas();
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            while (!opcion.equals("5")) ;
        }
    }
}
