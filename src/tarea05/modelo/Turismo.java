package tarea05.modelo;

import java.util.regex.*;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 */
public class Turismo {

    private String matricula, marca, modelo;
    private int cilindrada;
    private boolean disponible;
    
    /*public Turismo(Turismo turismo) {
		matricula = turismo.getMatricula();
		marca = turismo.getMarca();
		modelo = turismo.getModelo();
		cilindrada = turismo.getCilindrada();
	}*/

    public Turismo(String matricula, String marca, String modelo, int cilindrada) {
        //this.propietario=propietario;
        //Matricula
        if (compruebaMatricula(matricula)) {
            this.matricula = matricula;
        } else {
            throw new ExcepcionAlquilerVehiculos("Matrícula incorrecta.");
        }
        //Marca
        this.marca = marca;
        //Modelo
        this.modelo = modelo;
        //Cilindrada
        if (cilindrada > 0) {
            this.cilindrada = cilindrada;
        } else {
            throw new ExcepcionAlquilerVehiculos("Cilindrada no válida");
        }
    }

    private boolean compruebaMatricula(String matricula) {
        Pattern patron = Pattern.compile("\\d{4}[B-DF-HJ-ÑP-TV-Z]{3}");
        Matcher emparejador = patron.matcher(matricula);
        return emparejador.matches();
    }
}
