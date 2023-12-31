// Multi Threading using Runnable Interface

class threadDemo extends Thread
{
   private Thread t;
   private String threadName;
   
   threadDemo( String name ) 
   {
      threadName = name;
      System.out.println("Creating " +  threadName );
   }
   
   public void run() 
   {
      System.out.println("Running " +  threadName );
      try 
      {
         for(int i = 4; i > 0; i--) 
         {
            System.out.println("Thread: " + threadName + ", Job: " + i);
            // Let the thread sleep for a while.
            Thread.sleep(50);
         }
      } 
      catch (InterruptedException e) 
      {
         System.out.println("Thread " +  threadName + " interrupted.");
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }
   
   public void start () 
   {
        System.out.println("Starting " +  threadName );
        if (t == null) 
        {
            t = new Thread (this, threadName);  
            t.start ();
        }
   }
}

public class threadClass
{
   public static void main(String args[]) 
   {
    
      threadDemo T1 = new threadDemo( "Thread-1");
      T1.start();
      
      threadDemo T2 = new threadDemo( "Thread-2");
      T2.start();
   }   
}
