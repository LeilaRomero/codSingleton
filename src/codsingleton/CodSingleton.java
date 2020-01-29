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

       Persona Luis= Persona.getSingletonInstance("Luis", "Perez", 21);
       Persona Ana=Persona.getSingletonInstance("Ana", "Lopez", 20);
        System.out.println(Luis.getNombre());
        System.out.println(Ana.getNombre());
    }

}
