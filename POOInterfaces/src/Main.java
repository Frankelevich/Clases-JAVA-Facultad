public class Main {

    public static void main(String[] args) {
	    Alumno a1= new Alumno();
	    a1.getNombreCompleto();

	    Docente d1= new Docente();
	    d1.getNombreCompleto();

	    printEntidad(a1);
	   //  printEntidad(d1); /* esta linea nos va a dar error. Esto ocurre porque la clase Docente no implementa a Entidad (leer abajo)*/


        // printDireccion(a1); /* como Alumno no implementa Direccion, no puede usar el método de la interfaz en cuestión */
        printDireccion(d1);

    }

    /* Si, para este caso, yo quiero imprimir los nombres completos, en vez de que, por cada clase me creo un metodo (o sea, hacer sobrecarga),
    tomamos ventaja de la interfaz Entidad, y le pedimos al método que ingrese una clase que tenga implementado el/los método/s de la interfaz Entidad */

    public static void printEntidad(Entidad entidad){
        System.out.println(entidad.getNombreCompleto());
    }

    public static void printDireccion(Direccion direccion){
        System.out.println(direccion.getDireccionCompleta());
    }

}
