//When you think "Thread" think "process" that can run alongside other processes at the same time
//AKA... CONCURRENTLY
//by extending the Thread Class, this Class now IS a Thread as well. (Can also implement Runnable interface)
//this means we can override the run() method (which gives a thread its functionality)
public class MyThread extends Thread{

    //we can now define whatever process we want our thread to have
    @Override
    public void run(){

        //this will repeatedly print out "thread is working so we can see it our thread work"
        for(int i = 0; i < 10; i++){

            //StringBuffer is considered thread safe! StringBuilder for instance, is not
            StringBuffer threadName = new StringBuffer(Thread.currentThread().getName());

            System.out.println(threadName + " is working");

            //Thread.sleep() forces a thread to wait x milliseconds
            //it potentially throws an InterruptedException so we need to wrap it in a try/catch
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }

        }

        System.out.println(Thread.currentThread().getName() + " is done!");

    }

}
