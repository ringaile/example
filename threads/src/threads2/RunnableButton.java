package threads2;


import javax.swing.JButton;
import javax.swing.JTextField;

public class RunnableButton extends JButton implements Runnable{
	
	//Please ignore that
	private static final long serialVersionUID = 7453535863156182464L;
	
	JTextField textfield;
	String text;

	
	public RunnableButton(String text, JTextField _tf)
	{
		//super(text);
		this.textfield=_tf;
		this.text = text;

	}
	
	public void run() 
	{
		//Print the content of the text field on the output stream
		textfield.setText(text);
	}
	

}
