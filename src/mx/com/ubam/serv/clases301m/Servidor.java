package mx.com.ubam.serv.clases301m;
import java.io.*;
import java.net.*;
import java.util.*;


public class Servidor {
try {
	ServerSocket ss = new ServerSocket(5001);
	Socket miSocket = ss.accept();
	InputStream is= miSocket.getInputStream();
	DataInputStream dis= new DataInputStream(is);
	String a = dis .readUTF();
	String b= dis.readUTF();
	System.out.println("Numeros recibidos: "+a);
	
	
}
}
