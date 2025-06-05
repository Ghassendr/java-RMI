import javax.swing.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;

public class Client {
    public static void main(String args[]) {
        System.out.println("lance client !!");
        String ipserveur = "127.0.0.1:9004";
        String url = "rmi://" + ipserveur + "/chatapp";

        try {
            ChatRemote r = (ChatRemote) Naming.lookup(url);
            System.out.println(r.getMsj());
            r.setMsj("hi how are u");
            System.out.println(r.getMsj());

            // Thread pour envoyer
            Thread send = new Thread(() -> {
                while (true) {
                    try {
                        String msg2 = JOptionPane.showInputDialog(null, "saisir un msg");

                        Message m = new Message("ghassen", msg2, new Date());
                        r.setdescution(m);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });


            Thread receaver = new Thread(() -> {
                while (true) {
                    try {
                        System.out.println(r.getdescution());
                        Thread.sleep(2000);
                        JFrame jf=new JFrame();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
            // Lancer les deux threads
            send.start();
            receaver.start();

        } catch (NotBoundException | MalformedURLException | RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
