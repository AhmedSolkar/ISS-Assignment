// Thread Pool Executor

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
class workerThread implements Runnable
{  
    private String message;  
    public workerThread(String s)
    {  
        this.message=s;  
    }  
    public void run() 
    {  
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);  

        //call doJob method that sleeps the thread for 2 seconds  
        doJob();

        //Printing thread name  
        System.out.println(Thread.currentThread().getName()+" (End)");
    }  
    private void doJob() {  
        try 
        {  
            Thread.sleep(2000);
        } 
        catch (InterruptedException e) 
        { 
            e.printStackTrace(); 
        }  
    }  
} 

public class threadPool 
{  
     public static void main(String[] args) 
     {  
        // Creating a pool of 5 threads  
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++)
        {  
            Runnable worker = new workerThread("" + i);  
            
            // Calling execute method of ExecutorService  
            executor.execute(worker);
        }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");  
    }  
 }  