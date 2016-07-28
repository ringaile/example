package threads1;

public class ThreadMainClass {

	public static void main (String[] args){
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		
		thread1.run();
		thread2.run();
	}
}



