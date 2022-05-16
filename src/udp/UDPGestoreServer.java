package udp;

public class UDPGestoreServer {
    public static void main(String[] args){
        UDPServer server = new UDPServer(2000);
        
        while(true){
            server.receiver();
            
            server.sender();
        }
    }
}
