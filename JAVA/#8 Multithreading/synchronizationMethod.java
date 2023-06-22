// Synchronized method 

import java.io.*;

class Test {
	synchronized void testFunction(int n)
	{
		// synchronized method
		for (int i = 1; i <= 3; i++) {
			System.out.println(n + i);
			try {
				Thread.sleep(500);
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}


public class synchronizationMethod {
	// Main function
	public static void main(String args[])
	{
		// only one object
		final Test obj = new Test();

		Thread a = new Thread() {
			public void run() { obj.testFunction(15); }
		};

		Thread b = new Thread() {
			public void run() { obj.testFunction(30); }
		};

		a.start();
		b.start();
	}
}
