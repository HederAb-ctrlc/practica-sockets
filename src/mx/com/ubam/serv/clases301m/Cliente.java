package mx.com.ubam.serv.clases301m;
import java.io.*;

import java.net.*;
import java.util.*;

public class Cliente {
	public Cliente(){
	try {
		Scanner sc = new Scanner(System.in);
		ServerSocket ss= new ServerSocket (5000);
		Socket miSocket = new Socket("localhost",5001);
		
		System.out.println("Ingrese los numero que desea operar");
	    String miAray = sc.next();
	    OutputStream os = miSocket.getOutputStream();
	    DataOutputStream dos =new DataOutputStream(os);
	    dos.writeUTF(miAray);
	   
	    Socket miSocket2= ss.accept();
	    InputStream is = miSocket2.getInputStream();
	    DataInputStream dis = new DataInputStream(is);
	    System.out.println("Los numeros recibidos"+ dis.readUTF());
	    miSocket.close();
	    dis.close();
	    miSocket2.close();
	    
  
		
		
	}catch(Exception e) {System.err.print("Error de conexion");}
}
	public static void  main(String args[]) {
		new Cliente();
	}
}

