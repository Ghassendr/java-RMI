import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
    String pseudo ,body ;

    @Override
    public String toString() {
        return "Message{" +
                "pseudo='" + pseudo + '\'' +
                ", body='" + body + '\'' +
                ", date=" + date +
                '}';
    }

    public Message(String pseudo, String body, Date date) {
        this.pseudo = pseudo;
        this.body = body;
        this.date = date;
    }

    Date date;

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getBody() {
        return body;
    }

    public Date getDate() {
        return date;
    }

    public Message() {
    }
}
