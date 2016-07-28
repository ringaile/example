package threads4;

public class Exo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		//Set up the table with random values
		int nb=4; //number of tables
		int size=10000;//Size of each table
		int[][] tab=new int[nb][size];
		for(int i=0;i<nb;i++)
			for(int j=0;j<size;j++)
				tab[i][j]=(int)(Math.random()*size);
		/*
		//Print the original tabs
		for(int i=0;i<nb;i++)
		{
			for(int j=0;j<size;j++)
				System.out.print(""+tab[i][j]);
			System.out.println("\n");
		}*/
		
		//Create the bubble sorters
		BubbleSorter bs = new BubbleSorter(tab[0]);
		BubbleSorter bs2 = new BubbleSorter(tab[1]);
		BubbleSorter bs3 = new BubbleSorter(tab[2]);
		BubbleSorter bs4 = new BubbleSorter(tab[3]);
		
		//Get the current time
		long start_time=System.currentTimeMillis();
		
		//Do bubble sorting
		bs.run();
		bs2.run();
		bs3.run();
		bs4.run();
		
		//Waiting for the Bubble sorters
		try {
			bs.wait();
			bs2.wait();
			bs3.wait();
			bs4.wait();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//Do the fusion
		Fusion fs = new Fusion(tab);
		fs.run();
		//Wait for the fusion to complete
		try {
			fs.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Print the total execution time
		  System.out.println("Total time="+(System.currentTimeMillis()-start_time)+" ms");
		
		/*
		//Print result
		int[] mergedTab=fusion.getResult();
		for(int i=0;i<mergedTab.length;i++)
			System.out.println(""+mergedTab[i]);
		*/
	}

}

