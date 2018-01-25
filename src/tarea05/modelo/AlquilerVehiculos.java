package tarea05.modelo;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class AlquilerVehiculos {

    private Cliente[] clientes;
    private Turismo[] turismos;
    private Alquiler[] alquileres;

    private final int MAX_CLIENTES = 25;
    private final int MAX_TURISMOS = 25;
    private final int MAX_ALQUILERES = 25;

    public AlquilerVehiculos() {
        clientes = new Cliente[MAX_CLIENTES];
        turismos = new Turismo[MAX_TURISMOS];
        alquileres = new Alquiler[MAX_ALQUILERES];
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public Turismo[] getTurismos() {
        return turismos;
    }

    public Alquiler[] getAlquileres() {
        return alquileres;
    }
    
}
