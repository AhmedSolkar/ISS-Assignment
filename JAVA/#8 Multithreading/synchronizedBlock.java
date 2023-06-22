// Synchronized Block

import java.io.*;
import java.util.*;

// A Class used to send a message
class Sender {
	public void send(String msg)
	{
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		}
		catch (Exception e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("\n" + msg + "Sent");
	}
}

// Class for send a message using Threads
class threadSend extends Thread {
	private String msg;
	Sender sender;

	// Receives a message object and a string message to be sent
	threadSend(String m, Sender obj)
	{
		msg = m;
		sender = obj;
	}

	public void run()
	{
		// Only one thread can send a message at a time.
		synchronized (sender)
		{
			// synchronizing the send object
			sender.send(msg);
		}
	}
}

class synchronizedBlock {
	public static void main(String args[])
	{
		Sender send = new Sender();
		threadSend S1 = new threadSend(" Hi ", send);
		threadSend S2 = new threadSend(" Bye ", send);

		// Start two threads of threadSend type
		S1.start();
		S2.start();

		// wait for threads to end
		try {
			S1.join();
			S2.join();
		}
		catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}
