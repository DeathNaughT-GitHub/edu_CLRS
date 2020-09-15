class MULTITHREAD implements Runnable {
   private Thread thread;
   private String Name;
   
   MULTITHREAD( String x) {
      Name = x;
      System.out.println("Creating " +  Name );
   }
   
   public void run() {
      System.out.println("Running " +  Name );
      try {
         for(int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Name + ", " + i);
            Thread.sleep(50);
         }
      } catch (InterruptedException e) {
         System.out.println("Thread " + Name + " interrupted.");
      }
      System.out.println("Thread " + Name + " exiting.");
   }
   
   public void start () {
      System.out.println("Starting " +  Name );
      if (thread == null) {
         thread = new Thread (this,Name);
         thread.start ();
      }
   }
}

public class TestThread {

   public static void main(String args[]) {
      MULTITHREAD M1 = new MULTITHREAD( "Thread 1");
      M1.start();
      
      MULTITHREAD M2 = new MULTITHREAD( "Thread 2");
      M2.start();
   }   
}


/* 
MULTITHREDING DEMO OUTPUT
Creating Thread 1
Starting Thread 1
Creating Thread 2
Starting Thread 2
Running Thread 1
Running Thread 2
Thread: Thread 2, 4
Thread: Thread 1, 4
Thread: Thread 1, 3
Thread: Thread 2, 3
Thread: Thread 1, 2
Thread: Thread 2, 2
Thread: Thread 1, 1
Thread: Thread 2, 1
Thread Thread 2 exiting.
Thread Thread 1 exiting.
*/
