//creation of thread using Thread class

class ThreadA extends Thread             //step 1
{
 public void run()                       //step 2
 {
  System.out.println("Thread is created using Thread class");
 }
}
class ThreadCreation1
{
 public static void main(String s[])
 {
  ThreadA t1=new ThreadA();              //step 3
  t1.start();                            //step 4
 }
}