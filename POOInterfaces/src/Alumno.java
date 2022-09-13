public class Alumno extends Persona implements Entidad {

    @Override
    public String getNombreCompleto() {
        return apellido + ", " + nombre;
    }
}
