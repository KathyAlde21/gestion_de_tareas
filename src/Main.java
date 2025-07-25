/*
 * Katherine Alderete
 */
import java.util.Scanner;

/**
 * Clase principal con menú para gestionar tareas.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestionTareas gestor = new GestionTareas();
        int opcion;

        do {
        	System.out.println(); //salto de linea
            System.out.println("\n MENÚ DE TAREAS");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Mostrar todas las tareas");
            System.out.println("5. Mostrar tareas pendientes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese descripción de la tarea: ");
                    String desc1 = scanner.nextLine();
                    gestor.agregarTarea(desc1);
                    break;
                case 2:
                    System.out.print("Ingrese descripción de la tarea a eliminar: ");
                    String desc2 = scanner.nextLine();
                    gestor.eliminarTarea(desc2);
                    break;
                case 3:
                    System.out.print("Ingrese descripción de la tarea a marcar como completada: ");
                    String desc3 = scanner.nextLine();
                    gestor.marcarTareaComoCompletada(desc3);
                    break;
                case 4:
                    gestor.mostrarTodasLasTareas();
                    break;
                case 5:
                    gestor.mostrarTareasPendientes();
                    break;
                case 6:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}
