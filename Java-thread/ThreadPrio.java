class Test extends Thread
{
 public void run()
 {
  System.out.println("Child Thread's current prority is="+Thread.currentThread().getPriority());
 }
}
class ThreadPrio
{
 public static void main(String s[])
 {
  System.out.println("Main Thread's current prority is="+Thread.currentThread().getPriority());
  Thread.currentThread().setPriority(7);
  Test t1=new Test();
  System.out.println("Main Thread's new prority is="+Thread.currentThread().getPriority());
  t1.start();
 }
}