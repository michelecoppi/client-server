/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverprova;
import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerProva {

    ServerSocket server = null;   
    Socket client = null;
    
    int porta = 1025;
    
    DataOutputStream out;
    DataInputStream in;    
    
    public Socket attendi(){
    
        try {
            System.out.println("Server attivo");
            server = new ServerSocket(porta);
            System.out.println("Server in ascolto sulla porta "+porta);
            client = server.accept();
            System.out.println("Connessione stabilita");
            server.close();
            
            in = new DataInputStream(client.getInputStream());
            out = new DataOutputStream(client.getOutputStream());
            
        } catch (IOException ex) {
           ex.getMessage();
        }
    return client;
    }
    
    public static void main(String[] args) {
        ServerProva x = new ServerProva ();
        x.attendi();
    }
    
}
