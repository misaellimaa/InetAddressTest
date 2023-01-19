package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "www.google.com";
            InetAddress address[] = InetAddress.getAllByName(name); 
            int i = 0;
            System.out.println( "Name:      "+ name);
            
            while (i < address.length){
                System.out.println( "Address:   "+ address[i].getHostAddress());
                i = i + 1;
            }
            
        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}
