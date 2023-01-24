package lectures.test_example_3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080)){
            while (true){
                Socket client = server.accept();
                ClientResolver clientResolver = new ClientResolver(client);
                new Thread(clientResolver).start();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
