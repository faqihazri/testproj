import java.io.*;
public class CopyFile {

   public static void main(String args[]) throws IOException {
	   
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
       System.out.println("Enter input File:");
       String input =br.readLine();
       System.out.println("Enter output File");
       String output=br.readLine();

	  
      FileReader in = null;
      FileWriter out = null;

      try {
         //in = new FileInputStream(".\\input.txt");
         
         //in = new FileInputStream("C:\\training\\SAMPLES3\\input.txt");
         //out = new FileOutputStream("C:\\training\\SAMPLES3\\output.txt");
    	  
    	    in = new FileReader("input");
            out = new FileWriter("output");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
         System.out.println("File Copied");
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}