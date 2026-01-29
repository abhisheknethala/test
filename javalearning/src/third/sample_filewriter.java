package third;

import java.io.FileWriter;
import java.io.IOException;

public class sample_filewriter {
	//static String s="my name is abhishek";
	public static void main(String[] args){
		String s="my name is abhishek";
	try( FileWriter fw = new FileWriter("newfile.txt")){
	//fw.write("my name is abhishek");
	for(int i = 0; i<s.length(); i++) {
		fw.write(s.charAt(i));}
	
	System.out.println("completed");
	}
	catch(IOException e){
		e.printStackTrace();
	}
	//}
	//fw.close();
	
	
	
	
	}

}


