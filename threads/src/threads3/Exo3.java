package threads3;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedInputStream;

public class Exo3 
{
	public static void main(String[] args)
	{
		
		try {
			//Set up the pipe
			PipedOutputStream ps = new PipedOutputStream();
		    PipedInputStream is = new PipedInputStream(ps);
			
			//Create the printer and the reader 
			Printer printer = new Printer(is);
			Reader reader = new Reader(ps);
			
			//Start them
			printer.run();
			reader.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}
}
