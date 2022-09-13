public class Docente extends Persona implements Direccion{

    String titulo;

    public String getNombreCompleto(){
        return titulo +", "+apellido+", "+nombre;
    }

    @Override
    public String getDireccionCompleta() {
        return null;
    }
}
