import java.util.Scanner;

public class Account
{

 public static void main(String[] args)
 {
  Scanner input= new Scanner( System.in);
  double acc1, acc2;
  double wd1, wd2;
  double choice;
  double choice3 = 0;
  
  System.out.print("input Account1 balance\n");
   acc1=input.nextDouble();
  
  System.out.print("input Account2 balance\n");
   acc2=input.nextDouble();
  
  Account account1 = new Account(acc1);
  Account account2 = new Account(acc2);
  
  while(choice3!=2)
  {
  System.out.printf("Account1 balance is :%.2f$\n", account1.getmoney());
  System.out.printf("Account1 balance is :%.2f$\n", account2.getmoney());
  System.out.print("choice(1:deposit/2:withdraw)\n");
   choice=input.nextDouble();
  
  if( choice==1)
  {
   double choice2;
   System.out.print("Which account do you want to deposit?");
   choice2=input.nextDouble();
   if(choice2==1)
   {
   System.out.print("input amount deposit of Account1\n");
   wd1=input.nextDouble();
   account1.deposit(wd1);
   System.out.printf("Account1 balance is :%.2f$\n", account1.getmoney());
   }
   else if(choice2==2)
   {
   System.out.print("input amount deposit of Account2\n");
   wd2=input.nextDouble();
   account2.deposit(wd2);
   System.out.printf("Account2 balance is :%.2f$\n", account2.getmoney());
   }
  }
  
  else if(choice==2)
  {
   double choice2;
   System.out.print("Which Account do you want to withdraw?");
   choice2=input.nextDouble();
   if(choice2==1)
   {
   System.out.print("input amount withdraw of Account1\n");
   wd1=input.nextDouble();
   account1.withdraw(wd1);
   System.out.printf("Account1 balance is :%.2f$\n", account1.getmoney());
   }
   else if(choice2==2)
   {
   System.out.print("input amount withdraw of Account2\n");
   wd2=input.nextDouble();
   account2.withdraw(wd2);
   System.out.printf("Account2 balance is :%.2f$\n", account2.getmoney());
   }
  }
  System.out.print("continue?y:1,n:2");
  choice3=input.nextDouble();
  }
 
 }
} 


