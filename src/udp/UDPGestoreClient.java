package udp;

public class UDPGestoreClient {
    public static void main(String[] args){
        UDPClient client = new UDPClient(2000);
        
        client.send("RICHIESTA DATA E ORA");
        
        client.receive();
    }
}
