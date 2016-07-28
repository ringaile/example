package threads2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Exo2 extends JFrame implements ActionListener, WindowListener {

	private static final long serialVersionUID = -2818867002346363736L;
	
	private RunnableButton button1, button2;

	private String textButton1, textButton2;
	
	public Exo2(String title)
	{
		//Set up the frame
		super(title);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener(this);
		textButton1="button1";
		textButton2="button2";
		this.setSize(300, 120);
		this.setLayout(new FlowLayout());
		JTextField tf1=new JTextField("Text1", 10);
		JTextField tf2=new JTextField("Text2", 10);
		
		//Set up button1
		RunnableButton button1 = new RunnableButton(title, tf1);
		
		//Set up button 2
		RunnableButton button2 = new RunnableButton(title, tf2);
		
		//Add button 1 and 2 to the frame
		this.add(tf1);
		this.add(button1);
		this.add(tf2);
		this.add(button2);
		
		
	}
	
	//This method is called when any of the button is clicked
	//At the first click, the corresponding thread is started
	//At the subsequent, the state of the thread is changed
	//from active to inactive or vice versa 
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() instanceof RunnableButton)
		{
			RunnableButton button=(RunnableButton)e.getSource();
			
			//Identify the button 
			if (e.getSource() == button1){
				//Start the thread or switch its status
				button1.run();
			}
			if (e.getSource() == button2){
				button2.run();
			}
			
		}
		
	}
	
	public static void main(String[] arg)
	{
		Exo2 main=new Exo2("Exo1b");
		main.setVisible(true);
	}
	
	//Kill the thread before closing the windows
	@Override
	public void windowClosing(WindowEvent e) 
	{
		try {
			wait();
			this.setVisible(false);
			System.exit(0);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowOpened(WindowEvent e) {}

}

