package codsingleton;

/**
 *
 * @author lromerofajar
 */
public class Persona {

    private static Persona laUnica;
    static String nombre;
    static String apellido;
    static int edad;

    private Persona() {
    }

    private Persona(String nombre, String apellido, int edad) {
        laUnica.nombre = nombre;
        laUnica.apellido = apellido;
        laUnica.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        laUnica.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        laUnica.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        laUnica.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

    public static Persona getSingletonInstance(String nombre, String apellido, int edad) {
        if (laUnica==null){
            laUnica= new Persona(nombre,apellido,edad);
           
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre+apellido+edad);
        }
        return laUnica;
    }

}
