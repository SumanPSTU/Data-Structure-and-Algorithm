package Others;

import java.net.InetAddress;
import javax.swing.JLabel;

public class IPAddressFinder {
    public static void main(String[] args) {
        String host = "www.google.com"; // You can replace this with any host name
        JLabel l = new JLabel(); // JLabel to display the result

        try {
            String ip = InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + " is: " + ip);
            System.out.println(l.getText()); // Print to console
        } catch (Exception e) {
            e.printStackTrace();
            l.setText("Unable to find IP address for " + host);
        }
    }
}
