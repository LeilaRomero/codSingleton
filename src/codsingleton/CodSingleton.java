package codsingleton;

import javax.swing.JOptionPane;

/**
 *
 * @author lromerofajar
 */
public class CodSingleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona Luis = Persona.getSingletonInstance();
        Luis.setNombre("Luis");
        Luis.setApellido("Lopez");
        Luis.setEdad(20);
        JOptionPane.showMessageDialog(null, Luis);
        Persona Yo = Persona.getSingletonInstance();
        Yo.setNombre("Ana");
        Yo.setApellido("Perez");
        Yo.setEdad(21);
        JOptionPane.showMessageDialog(null, Yo);
    }

}
