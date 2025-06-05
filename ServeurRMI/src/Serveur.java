import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Serveur {
    public static void main(String[] args) {




        System.out.println(" demarage serveur ");
        try {
            LocateRegistry.createRegistry(9004);

        String IP="127.0.0.1:9004";
        String URL="rmi://"+IP+"/chatapp";
        ChatImplementation chat= null;
        try {
            chat = new ChatImplementation();
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
        Naming.rebind(URL,chat);
        } catch (RemoteException e) {

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}