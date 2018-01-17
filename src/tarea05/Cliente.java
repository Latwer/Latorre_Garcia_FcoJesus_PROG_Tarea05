package tarea05;

import java.util.regex.*;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class Cliente {

    private final String nombre, dni, direccion, localidad, codigoPostal;
    private int identificador, numClientes;

    public Cliente(String nombre, String dni, String direccion, String localidad, String codigoPostal) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.localidad = localidad;
        this.codigoPostal = nombre;
    }

    private boolean compruebaCodigoPostal(String codigoPostal) throws ExcepcionAlquilerVehiculos {
        Pattern patron = Pattern.compile("0[1-9][0-9]{3}|[1-4][0-9]{4}|5[0-2][0-9]{3}");
        Matcher emparejador = patron.matcher(codigoPostal);
        if (emparejador.matches()) {
            return emparejador.matches();
        } else {
            throw new ExcepcionAlquilerVehiculos();
        }
    }

    private boolean compruebaDni(String dni) throws ExcepcionAlquilerVehiculos {
        Pattern patron = Pattern.compile("\\d{8}[A-HJ-NP-TV-Z]");
        Matcher emparejador = patron.matcher(dni);
        if (emparejador.matches()) {
            return emparejador.matches();
        } else {
            throw new ExcepcionAlquilerVehiculos();
        }
    }

    public Cliente(Cliente cliente) {
        this.nombre = cliente.nombre;
        this.dni = cliente.dni;
        this.direccion = cliente.direccion;
        this.localidad = cliente.localidad;
        this.codigoPostal = cliente.codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String localidad() {
        return localidad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public int getIdentificador() {
        return identificador;
    }

    /*public int getNumClientes(){
        return numClientes;
    }*/
 /*public String getDni(){
        return dni;
    }*/
    //@Override
    public String toString() {
        return "Nombre: " + nombre + ", DNI: " + dni + ", Dirección: " + direccion + ", Localidad: " + localidad + ", Código postal: " + codigoPostal + ".";
    }

}
