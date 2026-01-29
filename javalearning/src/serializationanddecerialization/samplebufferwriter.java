package serializationanddecerialization;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class samplebufferwriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("good morning");
			writer.newLine();
			writer.write("my name is abhishek");
			writer.close();
			System.out.println("completed");
			
		}
		catch(IOException ex) {
			System.out.println("hiii");
		}

	}

}
