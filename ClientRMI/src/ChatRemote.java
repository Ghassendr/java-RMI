import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ChatRemote  extends Remote {
    public void setMsj(String msj)throws RemoteException;
    public String getMsj() throws RemoteException;
    public ArrayList getdescution() throws RemoteException;
    public  void  setdescution(Message msj) throws RemoteException;

}
