//creation of thread using runnable interface

class ThreadA implements Runnable  //step 1
{
 public void run()                 //step 2
 {
  System.out.println("Thread is created using Runnable Interface");
 }
}
class ThreadCreation
{
 public static void main(String s[])
 {
  ThreadA t1=new ThreadA();        //step 3
  Thread th=new Thread(t1);        //step 4
  th.start();                      //step 5
 }
}
