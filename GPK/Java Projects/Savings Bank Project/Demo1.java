import java.util.*;
import java.io.*;
class SavingsAccount1
{

	public double balance;
	public double interest;

	SavingsAccount1(double initialBalance,double initialInterest)
	{
	
		balance = initialBalance;
		interest = initialInterest;
		System.out.println("Initial Balance :" +balance);
		System.out.println("Initial Interest :" +interest);
	}

	void deposit(double amount)
	{
		System.out.println("Deposit Amount :" +amount);
		balance = balance + amount;
		System.out.println("Updated Balance :" +balance);
	}

	void withdraw(double amount)
	{
		System.out.println("Withdraw Amount :" +amount);
		balance = balance - amount;
		System.out.println("Updated Balance:" +balance);
	}

	void addInterest()
	{
		balance = balance + balance * interest;
	}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Balance and Interest : ");
double b=sc.nextDouble();
double r=sc.nextDouble();

SavingsAccount1 s1 = new SavingsAccount1(b,r);

System.out.println("Enter Amount To Deposit : ");
double n=sc.nextDouble();
s1.deposit(n);
		
System.out.println("Enter Amount To Withdraw : ");
double m=sc.nextDouble();
s1.withdraw(m);
s1.addInterest();
}
}