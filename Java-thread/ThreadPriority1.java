class SumThread extends Thread
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
class FactThread extends Thread
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
class ThreadPriority1
{
 public static void main(String s[])
 {
  SumThread st=new SumThread();
  FactThread ft=new FactThread();
  
  st.setName("Sum of nos");
  ft.setName("Factorial");

  st.setPriority(7);
  ft.setPriority(4);

  System.out.println("\nThe thread created is :"+st.getName());
  System.out.println("\nThe thread created is :"+ft.getName());
  System.out.println("\nthe priority value of "+st.getName()+" is="+st.getPriority());
  System.out.println("\nthe priority value of "+ft.getName()+" is="+ft.getPriority());
  
  st.start();
  ft.start();
 }
}