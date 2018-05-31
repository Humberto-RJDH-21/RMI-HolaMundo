import java.rmi.*;
import java.rmi.server.*;
import java.lang.Thread;
import java.io.*;

/**
* Esta clase implementa la interfaz remota
 * HolaMundoInt.
	* @author M. L. Liu
	*/

public class HolaMundoImpl extends UnicastRemoteObject
 implements HolaMundoInt {

  	public HolaMundoImpl() throws RemoteException {
  		super();
  	}

 	public String decirHola(String nombre)
  	   throws RemoteException {

                for(int i=0;i<5;i++){
                    try{
                        Thread.sleep(1000);
                        System.out.println(""+i);
                    }catch(InterruptedException e){
                    System.out.println("erroror");
                    }
                }
            
  	   	return "Hola mundo: " + nombre;
  	}
 } //fin clase
