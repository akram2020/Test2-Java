/**
 * NAME         : MUHAMMAD AKRAM BIN AHMAD
 * MATRIC       : 2014873252
 * DESCRIPTION  : Enhancement features (Software have a Threads features).
 */

public class thread extends Thread
{
 private int thread_number;
 
 public thread(int threadNumber)
 {
    thread_number = threadNumber;
 }
 
 public void run()
 {
    System.out.println("running thread " + thread_number);
    while(true)
    {
        try
        {
            Thread.sleep(1000); // do the real work here
            System.out.println("thread " + thread_number + " is running");
        }
        
        catch(InterruptedException e)
        {
            System.out.println("thread is not running");
        }
    }
 }
 
 public static void main(String[] args)
 { 
     // create two instances of the class
     thread process1 = new thread(1);
     thread process2 = new thread(2);
     // now run the threads
     
        process1.start();
        process2.start();
                   
 }
} 