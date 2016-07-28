package threads3;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.util.Scanner;

public class Reader implements Runnable{
	
	private volatile boolean running = true;
	private String text;

	
	public Reader(PipedOutputStream _ps)
	{
		text = _ps.toString();
	}
	
	//Read input stream when available
	//send it in the pipe
	public void run()
	{
		while(running)
			System.out.println(text);
	}
	

}