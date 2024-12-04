import java.util.*;
class Factorial implements Runnable
{
 public void run()
 {
  int n,f=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the factorial range");
  n=sc.nextInt();
  for(int i=1;i<=n;i++)
  {
   f=i*i;
   System.out.println("Factorial of number "+n+" is "+f);
  }
 }
}
class Sum implements Runnable
{
 public void run()
 {
  int n,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the sum range");
  n=sc.nextInt();
  for(int i=1;i<=n;i++)
  {
   sum=sum+i;
   System.out.println("Sum of number from 1 to "+i+" is "+sum);
  }
 }
}
class ThreadMath
{
 public static void main(String s[])
 {
  Factorial f1=new Factorial();
  Thread th1=new Thread(f1);
  th1.start();
  Sum s1=new Sum();
  Thread th2=new Thread(s1);
  th2.start();
 }
}
  
