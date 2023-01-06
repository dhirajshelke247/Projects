public class SavingsAccount1
{
	public double balance;
	public double interest;

	public SavingsAccount1(double initialBalance, double initialInterest)
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
		System.out.println("Updated Balance:" +balance);
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
}
public class Demo1
{
public static void main(String args[])
{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

double b=Double.parseDouble(br.readLine());
double r=Double.parseDouble(br.readLine());
SavingsAccount1 s1 = new SavingsAccount1(b,r);

System.out.println("Enter Amount To Deposit : ");
double n=Double.parseDouble(br.readLine());
s1.deposit(n);

System.out.println("Enter Amount To Withdraw : ");
double m= Double.parseDouble(br.readLine());
s1.withdraw(m);
}
}