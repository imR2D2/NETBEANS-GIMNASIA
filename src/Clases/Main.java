
package Clases;
import Login.Login;

public class Main {

    public static void main(String[] args) {
        Login vent = new Login(); 
        vent.setVisible(true); //muestro la ventana
        vent.setLocationRelativeTo(null); //para que aparezca en medio de la pantalla
        vent.setResizable(false); //para que no la puedan agrandar
    }
    
}
