package mx.com.ubam.serv.clases301m;
import java.io.*;
import java.net.*;
import java.util.*;

public class Cliente {
	Scanner sc = new Scanner(System.in);
	try {
		
		ServerSocket ss= new ServerSocket (5050);
		Socket miSocket = new Socket("localhost",5001);
		
		System.out.println("Ingrese los numero que desea operar");}
	    String miAray = sc.next();
	    InputStream is =miSocket.getOutputStream();
	    OutputStream os = miSocket2.getInputStream();
	    DataOutputStream dos = DataOutputStream(os);
	    dos.writeUT(miArray);
	    
		
		
	}catch() {}
	

}
