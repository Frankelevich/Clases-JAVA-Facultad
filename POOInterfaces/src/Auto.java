public class Auto implements Entidad { /* implemento entidad porque me sirven sus metodos (y ademas al auto lo considero una entidad) */

    public String nombre; /* podria heredar este atributo de Persona, pero no tendría sentido que un auto sea una persona. lo mejor es
    repetir codigo */

    @Override
    public String getNombreCompleto() {
        return nombre;
    }
}
