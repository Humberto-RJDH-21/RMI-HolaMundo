// Un ejemplo sencillo de interfaz RMI - M. Liu
import java.rmi.*;

/**
* Interfaz remota.
* @author M. L. Liu
*/

public interface HolaMundoInt extends Remote {
    /**
* Este método remoto devuelve un mensaje.
* @para name – una cadena de caracteres con un nombre.
* @return - una cadena de caracteres.
*/
    public String decirHola(String nombre)
        throws java.rmi.RemoteException;

}
