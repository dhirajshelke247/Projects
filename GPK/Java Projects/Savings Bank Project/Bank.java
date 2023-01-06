import java.util.Scanner;

class Bank
{
	private String accno;
	private String name;
	private double balance;

	Scanner KB=new Scanner(System.in);
	
	//method to open an account
	void openAccount()
	{ 
	System.out.print("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/\n");
		System.out.println("Enter Account No: ");
		accno=KB.next();
		System.out.println("Enter Name: ");
		name=KB.next();
		System.out.println("Enter Balance: ");
		balance=KB.nextDouble();
		if(balance<500)
		{
		System.out.println("\nBALANCE VERY LOW !! PLEASE DEPOSIT SOME MONEY\n");}
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/\n");	
	}

	//method to display account details
	void showAccount()
	{ 
	System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/\n");
		System.out.println("Account Number : "+accno+"\nAccount Name : "+name+"\nBalance : "+balance);
	}

	//method to deposit money
	void deposit()
	{
		long amt;
		System.out.println("Enter Amount U Want to Deposit : ");
		amt=KB.nextLong();
		balance=balance+amt;
	}

	//method to withdraw money
	void withdrawal()
	{
		
		if(balance<500){
		System.out.println("\t\t\nBALANCE LOW !! CANNOT WITHDRAW\n ");
		System.out.print("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/\n");
		}
		else
		{
		long amt;
		System.out.println("Enter Amount U Want to withdraw : ");
		amt=KB.nextLong();
		if(balance>=amt)
		{ 
			balance=balance-amt;
			if(balance<500)
			System.out.println("\t\t\nBALANCE LOW !! TIME TO DEPOSIT MONEY\n");
		System.out.print("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/\n");
		}
		else
		{
			System.out.println("Less Balance..Transaction Failed..");
		}
		}
	}

	//method to search an account number
	boolean search(String acn)
	{ 
		if(accno.equals(acn))
		{ 
			showAccount();
			return(true);
		}
		return(false);
	}
}

class ExBank
{  
	public static void main(String arg[])
	{
		Scanner KB=new Scanner(System.in);
		try{
		//create initial accounts
		System.out.print("How Many Customer U Want to Input : ");
		int n=KB.nextInt();
		Bank  C[]=new Bank[n];
		for(int i=0;i<C.length;i++)
		{   
			C[i]=new Bank();
			C[i].openAccount();
		}
		
		//run loop until menu 5 is not pressed
		int ch;
		do
		{
			System.out.print("\n/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/\n");
			System.out.println("\tMain Menu");
			System.out.println("\t\t1.Display All");
			System.out.println("\t\t2.Search By Account");
			System.out.println("\t\t3.Deposit");
			System.out.println("\t\t4.Withdrawal");
			System.out.println("\t\t5.Exit");
			System.out.println("\nEnter Your Choice :");
			ch=KB.nextInt();
			
			switch(ch)
			{ 
				case 1:
					for(int i=0;i<C.length;i++)
					{
						C[i].showAccount();
					}
					break;

				case 2:
					System.out.print("Enter Account No U Want to Search...: ");
					String acn=KB.next();
					boolean found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 3:
					System.out.print("Enter Account No : ");
					acn=KB.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].deposit();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 4:
					System.out.print("Enter Account No : ");
					acn=KB.next();
					found=false;
					for(int i=0;i<C.length;i++)
					{  
						found=C[i].search(acn);
						if(found)
						{
							C[i].withdrawal();
							break;
						}
					}
					if(!found)
					{
						System.out.println("Search Failed..Account Not Exist..");
					}
					break;

				case 5:
					System.out.println("Good Bye !! See You Later");
					break;
			}		}
		while(ch!=5);
}
catch(Exception e){}
	}
}