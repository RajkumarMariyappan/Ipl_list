package reader;
import java.io.FileReader;  
import java.io.BufferedReader;
import java.io.IOException;  
public class File {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("D:\\database.txt");
		BufferedReader br=new BufferedReader(fr);
		String a;
		while((a=br.readLine())!=null) 
			//System.out.println("Enter the player "+i+" score ");
		
		
		System.out.println(a);
		
	
	}

}
