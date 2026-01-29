package serializationanddecerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class test implements Serializable{
	public int a;
	public String b;
	
	public test(int a,String b) {
		this.a =a;
		this.b =b;
	}
}

public class sampleserialization {

	public static void main(String[] args) throws ClassNotFoundException  {
		// TODO Auto-generated method stub
		try {
		test obj = new test(1,"rashi");
		String filename = "file.ser";
		
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(obj);
		out.close();
		file.close();
		System.out.println("object has been serialaized");
		System.out.println("a=" + obj.a);
		System.out.println("b=" + obj.b);
		}
		catch(IOException ex) {
			System.out.println("IOExceotion is caught");
		}
		
		test obj1=null;
		 
		try {
			//String filename = null;
			//String filename;
			String filename = "file.ser";
			FileInputStream file =new FileInputStream(filename);
			ObjectInputStream in= new ObjectInputStream(file);
			obj1=(test) in.readObject();
			in.close();
			file.close();
			System.out.println("object has been deserialized");
			System.out.println("a=" + obj1.a);
			System.out.println("b=" + obj1.b);
		
		}catch(IOException ex) {
			System.out.println("IOExceotion is caught");
		}

	}

}
