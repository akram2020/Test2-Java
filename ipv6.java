/**
 * NAME         : MUHAMMAD AKRAM BIN AHMAD
 * MATRIC       : 2014873252
 * DESCRIPTION  : Get information about IPV6 (Company A)
 */


import java.util.ArrayList;
import java.util.List;
import java.net.*;
import java.net.InetAddress;
import java.net.NetworkInterface;


public class ipv6 
{

  public static void main(String[] args)  
  {
     
    try {
     
          InetAddress address = InetAddress.getLocalHost();
          NetworkInterface network = NetworkInterface.getByInetAddress(address);
          String hostName = address.getHostName();
          
          String addr = address.getHostAddress();
          InetAddress[] totaladd= address.getAllByName(hostName);
          System.out.println("\nAll address has been detected (including IPv6):");
          
          for(int i=0; i<totaladd.length; i++)
          {
              System.out.println(totaladd[i]);
            }
      
          
      System.out.println("\nInformation about IPv4 address:");
            
      if (address.isAnyLocalAddress()) 
      {
        System.out.println(address + " is a wildcard address.");
      }
      if (address.isLoopbackAddress()) 
      {
        System.out.println(address + " is loopback address.");
      }

      if (address.isLinkLocalAddress()) 
      {
        System.out.println(address + " is a link-local address.");
      } 
        else if (address.isSiteLocalAddress()) 
        {
            System.out.println(address + " is a site-local address.");
        } 
            else 
            {
                System.out.println(address + " is a global address.");
            }

      if (address.isMulticastAddress()) 
      {
        if (address.isMCGlobal()) 
        {
          System.out.println(address + " is a global multicast address.");
        } 
            else if (address.isMCOrgLocal()) 
            {
                System.out.println(address
           + " is an organization wide multicast address.");
            }
            else if (address.isMCSiteLocal()) 
            {
                System.out.println(address + " is a site wide multicast address.");
            } 
            else if (address.isMCLinkLocal()) 
            {
                System.out.println(address + " is a subnet wide multicast address.");
            } 
            else if (address.isMCNodeLocal()) 
            {
                System.out.println(address
           + " is an interface-local multicast address.");
            } 
                else 
                {
                    System.out.println(address + " is an unknown multicast address type.");
                }
      } 
        
        else 
        {
        System.out.println(address + " is a unicast address.");
        }
      }
    
    catch (SocketException e){
            
        e.printStackTrace();
   }
    
    catch (UnknownHostException ex) 
    {
      System.err.println("Could not resolve " + args[0]);
    }   
  }  
}