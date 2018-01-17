package tarea05;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class ExcepcionAlquilerVehiculos extends RuntimeException {

    public ExcepcionAlquilerVehiculos() {
        this("Excepción de alquiler de vehículos.");
    }

    public ExcepcionAlquilerVehiculos(String mensaje) {
        super(mensaje);
    }
}
