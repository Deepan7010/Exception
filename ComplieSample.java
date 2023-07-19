package day16Exception;
import java.io.*;

public class ComplieSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
		File f=new File("C:\\Users\\deepa\\Desktop\\.test.txt");

		FileReader fr=new FileReader(f);
		int temp=0;
		
		while((temp=fr.read())!=-1) {
			System.out.print((char)(temp));
		}
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
