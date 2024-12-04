class SumThread implements Runnable
{
 public void run()
 {
  int i,sum=0;
  for(i=1;i<=5;i++)
  {
   sum=sum+i;
   System.out.println("\nSum of numbers from1 upto "+i+"="+sum);
  }
 }
}
class ThreadCreate
{
 public static void main(String s[])
 {
  SumThread t=new SumThread();
  Thread th=new Thread(t);
  System.out.println("\nThe thread crated is:"+th.getName());
  System.out.println("\nBefore starting the thread \n is the thread alive?:"+th.isAlive());
  th.start();
  System.out.println("\nAfter starting the thread \n is the thread alive?:"+th.isAlive());
 }
}
