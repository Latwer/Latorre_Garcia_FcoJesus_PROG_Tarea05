package tarea05.modelo;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class ExcepcionAlquilerVehiculos extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ExcepcionAlquilerVehiculos(String mensaje) {
        super(mensaje);
    }
}
