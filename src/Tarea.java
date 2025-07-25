
/**
 * Clase que representa una tarea con una descripción y su estado de completada.
 */
public class Tarea {
    private String descripcion;
    private boolean completada;

    /**
     * Constructor de la clase Tarea.
     * @param descripcion Descripción de la tarea.
     */
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    /**
     * Marca la tarea como completada.
     */
    public void marcarComoCompletada() {
        this.completada = true;
    }

    /**
     * Retorna la descripción de la tarea.
     * @return Descripción de la tarea.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Retorna el estado de completada.
     * @return true si está completada, false en caso contrario.
     */
    public boolean estaCompletada() {
        return completada;
    }

    /**
     * Representación en texto de la tarea.
     * @return Descripción con estado (✓ o ✗).
     */
    @Override
    public String toString() {
        return descripcion + " [" + (completada ? "✓ Completada" : "✗ Pendiente") + "]";
    }
}
