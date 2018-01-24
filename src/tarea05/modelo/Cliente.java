package tarea05.modelo;

import java.util.regex.*;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class Cliente {

    private String nombre, dni, direccion, localidad, codigoPostal;
    private int identificador;
    private static int numClientes=0;
    
    public Cliente(Cliente cliente) {
        this.nombre = cliente.nombre;
        this.dni = cliente.dni;
        this.direccion = cliente.direccion;
        this.localidad = cliente.localidad;
        this.codigoPostal = cliente.codigoPostal;
    }

    public Cliente(String nombre, String dni, String direccion, String localidad, String codigoPostal) {
        //Nombre
        this.nombre = nombre;
        //DNI
        if (compruebaDni(dni)) {
            this.dni = dni;
        } else {
            throw new ExcepcionAlquilerVehiculos("DNI incorrecto.");
        }
        //Dirección
        this.direccion = direccion;
        //Localidad
        this.localidad = localidad;
        //Codigo Postal
        if (compruebaCodigoPostal(codigoPostal)) {
            this.codigoPostal = codigoPostal;
        } else {
            throw new ExcepcionAlquilerVehiculos("Código postal incorrecto.");
        }
    }

    private boolean compruebaCodigoPostal(String codigoPostal) {
        Pattern patron = Pattern.compile("0[1-9][0-9]{3}|[1-4][0-9]{4}|5[0-2][0-9]{3}");
        Matcher emparejador = patron.matcher(codigoPostal);
        return emparejador.matches();
    }

    private boolean compruebaDni(String dni) {
        Pattern patron = Pattern.compile("\\d{8}[A-HJ-NP-TV-Z]");
        Matcher emparejador = patron.matcher(dni);
        return emparejador.matches();
    }

    

    public String getNombre() {
        return nombre;
    }
    
    public String getDni(){
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
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
    
    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + nombre + ", DNI=" + dni + ", Dirección=" + direccion + ", Localidad=" + localidad + ", Código postal=" + codigoPostal + '}';
    }
    
}
