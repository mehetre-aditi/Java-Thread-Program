class UserThread extends Thread
{
 public void run()
 {
  System.out.println("Thread task:"+Thread.currentThread().getName());
 }
}
class ThreadName
{
 public static void main(String s[])
 {
  System.out.println("hello");
  Thread.currentThread().setName("Global");
  System.out.println("Current thread name is= "+Thread.currentThread().getName());
  
  UserThread t1=new UserThread();
  //t1.setName("Soft");
  t1.start();
  UserThread t2=new UserThread();
  //t2.setName("tech");
  t2.start();
 }
}