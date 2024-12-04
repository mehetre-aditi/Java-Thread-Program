class SumThread implements Runnable
{
 int i,sum=0;
 public void run()
 {
  for(i=1;i<=5;i++)
  {
   sum=sum+i;
   System.out.println("Sum of numbers from 1 upto"+i+"="+sum);
  }
 }
}
class FactThread implements Runnable
{
 int i,fact=1;
 public void run()
 {
  for(i=1;i<=5;i++)
  {
   fact=fact*i;
   System.out.println("Factorial of"+i+"="+fact);
  }
 }
}
class ThreadPriority
{
 public static void main(String s[])
 {
  SumThread st=new SumThread();
  FactThread ft=new FactThread();
  
  Thread sumt=new Thread(st,"Sum thread");
  Thread factt=new Thread(ft,"Factorial thread");

  sumt.setPriority(Thread.NORM_PRIORITY-2);
  factt.setPriority(7);

  System.out.println("\nThe thread created is :"+sumt.getName());
  System.out.println("\nThe thread created is :"+factt.getName());
  System.out.println("\nthe priority value of "+sumt.getName()+" is="+sumt.getPriority());
  System.out.println("\nthe priority value of "+factt.getName()+" is="+factt.getPriority());
  
  sumt.start();
  factt.start();
 }
}




  