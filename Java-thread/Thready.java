class Thready extends Thread
{
 public void run()
 {
  Thread.yield();
  for(int i=0;i<=5;i++)
  {
   System.out.println(i+" "+Thread.currentThread().getName());
  }
 }
}
class ThYield
{
 public static void main(String s[])
 {
  Thready t1=new Thready();
  t1.start();
  for(int i=0;i<=5;i++)
  {
   System.out.println(i+" "+Thread.currentThread().getName());
  }
 }
}