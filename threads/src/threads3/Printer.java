package threads3;

import java.awt.FlowLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PipedInputStream;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Printer extends JFrame implements WindowListener, Runnable {

	private static final long serialVersionUID = 4835711038057686272L;
	private volatile boolean running = true;
	
	private JTextArea textarea;
	private int value;
	
	public Printer(PipedInputStream _pipe)
	{

		
		//Set up the window
		this.setSize(250, 200);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.addWindowListener(this);
		
		//Set up the text area
		textarea=new JTextArea(9,20);
		textarea.setEditable(false);
		this.add(textarea);
		
		this.setVisible(true);
		try {
		value = _pipe.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Read when available
	//And print in the Text area
	@Override
	public void run() 
	{
		while(running)
			textarea.setText(Integer.toString(value));
	}

	//Kill the thread before killing the program
	@Override
	public void windowClosing(WindowEvent arg0) 
	{
		
		running = false;
		this.setVisible(false);
		System.exit(0);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {}

	@Override
	public void windowClosed(WindowEvent arg0) {}

	@Override
	public void windowDeactivated(WindowEvent arg0) {}

	@Override
	public void windowDeiconified(WindowEvent arg0) {}

	@Override
	public void windowIconified(WindowEvent arg0) {}

	@Override
	public void windowOpened(WindowEvent arg0) {}

}

