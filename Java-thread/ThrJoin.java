class ThrJoin extends Thread
{
 static Thread mn;
 public void run()
 {
 try
 {
  mn.join();
  for(int i=0;i<=5;i++)
  {
   System.out.println("Child Thread "+i);
   Thread.sleep(1000);
  }
 }
 catch(InterruptedException e)
 {
  System.out.println(e);
 }
}
public static void main(String s[]) throws InterruptedException
{
 mn=Thread.currentThread();
 ThrJoin t=new ThrJoin();
 t.start();
 try
 {
  for(int i=0;i<=5;i++)
  {
   System.out.println("Main Thread "+i);
   Thread.sleep(1000);
  }
 }
 catch(InterruptedException e)
 {
  System.out.println(e);
 }
}
}