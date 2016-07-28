package threads1;

import java.util.Random;

public class MyThread extends Thread {

    public void run(){
    	Random randomGenerator = new Random();
    	for (int i=0; i < 10000; i++){
    		int randomInt = randomGenerator.nextInt(10);
    		System.out.println(randomInt);
    	}
    }
  }
