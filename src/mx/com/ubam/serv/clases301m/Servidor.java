package mx.com.ubam.serv.clases301m;
import java.io.*;
import java.net.*;
import java.util.*;


public class Servidor {
	public Servidor() {
	
try {
	Scanner sc= new Scanner(System.in);
	ServerSocket ss = new ServerSocket(5001);
	Socket miSocket = ss.accept();
	InputStream is= miSocket.getInputStream();
	DataInputStream dis= new DataInputStream(is);
	String arraysev = dis .readUTF();
	System.out.println("Numeros recibidos: "+arraysev);
	int menu;
	System.out.println("Presiona 1 si lo que quieres es sumar");
	menu=sc.nextInt();
	System.out.println("Presiona 2 si lo que quieres es el seno");
	menu=sc.nextInt();
	System.out.println("Presiona 3 si lo que quieres es el coseno");
	menu=sc.nextInt();
	System.out.println("Presiona 1 si lo que quieres es la raiz cuadrada");
	menu=sc.nextInt();
	System.out.println("Presiona 1 si lo que quieres es elevar a potencia");
	menu=sc.nextInt();
	
	switch(menu) {
	case 1: 
		for(int i=0;1<arraysev.length();i++) {
		int sumas=Integer.parseInt(arraysev)+Integer.parseInt(arraysev);
		}
	case 2:
		for(int i=0;1<arraysev.length();i++) {
		double conv=Double.parseDouble(arraysev);
		double seno=Math.sin(conv);
		}
	case 3:
		for(int i=0;1<arraysev.length();i++) {
			double conv=Double.parseDouble(arraysev);
			double seno=Math.cos(conv);
			}
	case 4:
		for(int i=0;1<arraysev.length();i++) {
			double conv=Double.parseDouble(arraysev);
			double raiz=Math.sqrt(conv);
		}
	case 5:
		int potencia;
		System.out.println("Ingrese la potencia a a la que desea elevar:");
		potencia=sc.nextInt();
		for(int i=0;1<arraysev.length();i++) {
			double conv=Double.parseDouble(arraysev);
			double exp=Math.pow(conv,potencia);
		}
		
	
	
	Socket miSocket2= new Socket("localhost",5000);
	OutputStream os= miSocket2.getOutputStream();
	DataOutputStream dos = new DataOutputStream(os);
	dos.writeUTF(""+ menu);
	miSocket.close();
	dos.close();
	miSocket2.close();
	dis.close();
	}
}catch(Exception e) {System.err.print("Error dee conexion");}
}
public static void main(String args[]) {
	new Servidor();
}
}