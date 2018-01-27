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

    public Cliente getCliente(String dni) {
        int posicion = 0;
        boolean encontrado = false;
        while (posicion < clientes.length && !encontrado) {
            if (clientes[posicion] != null && clientes[posicion].getDni().equals(dni)) {
                encontrado = true;
            } else {
                posicion++;
            }
        }
        if (encontrado) {
            return clientes[posicion];
        } else {
            return null;
        }
    }

    public void addCliente(Cliente cliente) {
        int posicion = 0;
        boolean posicionEncontrada = false;
        while (posicion < clientes.length && !posicionEncontrada) {
            if (clientes[posicion] == null) {
                posicionEncontrada = true;
            } else if (clientes[posicion].getDni().equals(cliente.getDni())) {
                throw new ExcepcionAlquilerVehiculos("Ya existe un cliente con ese DNI");
            } else {
                posicion++;
            }
        }
        if (posicionEncontrada) {
            clientes[posicion] = cliente;
        } else {
            throw new ExcepcionAlquilerVehiculos("El array de clientes está lleno.");
        }
    }

    public void delCliente(String dni) {
        int posicion = 0;
        boolean encontrado = false;
        while (posicion < clientes.length && !encontrado) {
            if (clientes[posicion] != null && clientes[posicion].getDni().equals(dni)) {
                encontrado = true;
            } else {
                posicion++;
            }
        }
        if (encontrado) {
            for (int i = posicion; i < clientes.length - 1; i++) {
                clientes[i] = clientes[i + 1];
            }
            clientes[clientes.length - 1] = null;
        } else {
            throw new ExcepcionAlquilerVehiculos("El cliente a borrar no existe");
        }
    }
}
