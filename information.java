
/**
 * NAME         : MUHAMMAD AKRAM BIN AHMAD
 * MATRIC       : 2014873252
 * DESCRIPTION  : Get an information from  NIC (eg. MAC address)
 */


import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class information{
    
   public static void main(String[] args){
    
    System.out.print("Information from NIC\n");
    System.out.print("---------------------");
       
    InetAddress address;
    try {
            
        address = InetAddress.getLocalHost();
        System.out.println("\nCurrent IP address : " + address.getHostAddress());
        
        NetworkInterface network = NetworkInterface.getByInetAddress(address);
            
        byte[] mac = network.getHardwareAddress();
            
        System.out.print("Current MAC address : ");
        
        
            
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mac.length; i++) {
            sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));        
        }
        System.out.println(sb.toString());
        
        String hostname = address.getHostName();
        System.out.println("Name of hostname : " + hostname);
            } 
            
            catch (UnknownHostException e) {
        
        e.printStackTrace();
        
    } catch (SocketException e){
            
        e.printStackTrace();
            
    }
        
   }

}