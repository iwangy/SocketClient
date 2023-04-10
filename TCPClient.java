import java.net.*;
import java.io.*;
import java.util.logging.*;

public class TCPClient {
    private static final Logger LOGGER = Logger.getLogger(TCPClient.class.getName());

    public static void main(String... args){
        String host = args[0];
        int port = Integer.valueOf(args[1]);
        String message = null;

        if (args.length>2) {
          message = args[2];
        }

        LOGGER.info("Connecting to " + host + " on port " + port);

        try {
            Socket sock = new Socket(host, port);
            InputStream in = sock.getInputStream();
            OutputStream out = sock.getOutputStream();
            PrintWriter output = new PrintWriter(out, true);

            LOGGER.info("Connected to " + host + " on port " + port);

            if (message != null) {
              LOGGER.info("Sending message: " + message);
              output.println(message);
            }

            LOGGER.info("Waiting for response");
            System.out.println("\n");

            int readChar = 0;
            while ((readChar = in.read()) != -1) {
                System.out.write(readChar);
            }
            LOGGER.info("Received response");
            sock.close();
        }
        catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}
