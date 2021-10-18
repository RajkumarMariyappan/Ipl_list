package reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputstreamReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		int i=1;
		while(i<=10) {
			
			System.out.println("Enter the player "+i+" score ");
		String a=br.readLine();
		
		System.out.println(a);
		i++;
	}
	}

}
