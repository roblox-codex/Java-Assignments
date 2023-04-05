import java.util.*;
import java.util.Scanner;


class Calculator
{
  System sc=new Scanner(System.in);
  public void print() 
  {

   System.out.print("Enter  number 1:");
   int  a=sc.nextInt();
   int  b=sc.nextInt();


    System.out.println("The values of a and b are "+a+"  "+b);
    System.out.println("Enter the operation to be performed");
    System.out.println("1. Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
    
    
   int n=sc.nextInt();
    System.out.println("The operation chose by you is ..." +n);


    bool y;
    y=sc.nextBool();
    System.out.println("Please confirm to proceed: \n Enter value 1 to confrim or else 0 to exit the program");
    if(y==1)
 
    {
        continue;
    }
    else
    {
        exit();
    }
 public class Calculator{int a;int b;int n;}
    {
        this.a=a;
        this.b=b;
        this.n=n;

    }
    void display(int a,int b,int n)
    {
        switch(n)
        {
            case 1:
            {
                int sum=a+b;
                System.out.println("The sum of the given numbers and b is :" +sum);
            }
            case 2:
            {
                int sub=a-b;
                System.out.println("The difference between a and b is " +sub);

            }
            case 3:
            {
                int mul=a*b;
                System.out.println("The product of the given numbers a and b is : "+mul);
            }
            case 4:
            {
                int div=a/b;
                System.out.println("The ratio of th given numbers a and  b is :"+div);

            }
            default:
            {
                exit();
            }
        }
    }
    class TestInput
    {
        public static void main(String args[])
        {
            Calculator c=new Calculator(a, b, n);
            c.display();
        }
    }
  }
