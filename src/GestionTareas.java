
import java.util.ArrayList;

/**
 * Clase encargada de gestionar una lista de tareas.
 */

public class GestionTareas {
    private ArrayList<Tarea> tareas;

    /**
     * Constructor: inicializa la lista de tareas.
     */
    public GestionTareas() {
        tareas = new ArrayList<>();
    }

    /**
     * Agrega una nueva tarea a la lista.
     * @param descripcion Descripción de la tarea.
     */
    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
        System.out.println("Tarea agregada.");
    }

    /**
     * Elimina una tarea según su descripción.
     * @param descripcion Descripción de la tarea a eliminar.
     */
    public void eliminarTarea(String descripcion) {
        boolean encontrada = false;
        for (int i = 0; i < tareas.size(); i++) {
            if (tareas.get(i).getDescripcion().equalsIgnoreCase(descripcion)) {
                tareas.remove(i);
                System.out.println("Tarea eliminada.");
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Tarea no encontrada.");
        }
    }

    /**
     * Marca una tarea como completada.
     * @param descripcion Descripción de la tarea.
     */
    public void marcarTareaComoCompletada(String descripcion) {
        boolean encontrada = false;
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equalsIgnoreCase(descripcion)) {
                if (!tarea.estaCompletada()) {
                    tarea.marcarComoCompletada();
                    System.out.println("Tarea marcada como completada.");
                } else {
                    System.out.println("La tarea ya estaba completada.");
                }
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Tarea no encontrada.");
        }
    }

    /**
     * Muestra todas las tareas.
     */
    public void mostrarTodasLasTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
        } else {
            System.out.println("Lista de todas las tareas:");
            for (Tarea tarea : tareas) {
                System.out.println("- " + tarea);
            }
        }
    }

    /**
     * Muestra solo las tareas pendientes.
     */
    public void mostrarTareasPendientes() {
        boolean hayPendientes = false;
        for (Tarea tarea : tareas) {
            if (!tarea.estaCompletada()) {
                if (!hayPendientes) {
                    System.out.println("Tareas pendientes:");
                    hayPendientes = true;
                }
                System.out.println("- " + tarea);
            }
        }
        if (!hayPendientes) {
            System.out.println("No hay tareas pendientes.");
        }
    }
}
