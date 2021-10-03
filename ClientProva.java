/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientprova;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ClientProva {

     Socket client = null;
    
    int porta = 1025;
    
    DataOutputStream out;
    DataInputStream in;
    
    public Socket connetti(){
         try {
             System.out.println("Connessione al server...");
             Socket client = new Socket (InetAddress.getLocalHost(),porta);
             System.out.println("Connessione effettuata");
             in = new DataInputStream(client.getInputStream());
             out = new DataOutputStream(client.getOutputStream());
             
         } catch (IOException ex) {
             ex.getMessage();
         }
    
    return client;
    }
    
    public static void main(String[] args) {
        ClientProva y = new ClientProva();
        y.connetti();
    }
    
}
