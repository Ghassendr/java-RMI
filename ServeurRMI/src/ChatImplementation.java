import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ChatImplementation  extends UnicastRemoteObject implements ChatRemote
{
    String msj;
    ArrayList<Message> Descution=new ArrayList<>();
ChatImplementation()throws RemoteException {}
void addMsj (Message m){
    Descution.add(m);
}
     public ArrayList getdescution ( ){
      return  Descution ;
    }

    @Override
    public void setdescution(Message msj) throws RemoteException {
        Descution.add(msj);
    }

    @Override
    public void setMsj(String msj) {
        this.msj=msj;
    }

    @Override
    public String getMsj() {
    return msj;

    }
}
