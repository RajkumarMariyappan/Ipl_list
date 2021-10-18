package reader;
import java.io.FileWriter;  

public class WritingFile {
public static void main(String[] args) {
	  
	 
	   
	         try{    
	        	 String a="Hai everyone";
	           FileWriter fw=new FileWriter("D:\\testout.txt");    
	           fw.write(a);    
	           fw.close();    
	          }catch(Exception e){System.out.println(e);}    
	          System.out.println("Success...");    
	     }    
	 
}

