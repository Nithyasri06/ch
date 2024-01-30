
					
package collegeApplication;

import java.util.Scanner;

public class OOPSApplication 
{

	public static void main(String[] args) 
	{
		//class object polymorphism encapsulation abstraction inheritance
		Customer customer=new Customer();
		customer.m1();
		customer.m2();
		
		
	}

}
class Bank
{
	String bank_name="--------------STATE BANK OF INDIA(SBI)------------------------";
	String branch1="KPHB";
	String branch2="GACHIBOWLI";
	String branch3="AMEERPET";
	String Accno;
	int deposit;
	int withdrawl;
	int bankaccount=100000;
	int mobile_update;
	String name;
	String openabankaccount;
	int balanceenquiry=100000;
	private String loan1="House";
	private String loan2="car";
	public String getloan1()
	{
		return "House if you take house loan your rate of interest is \"10%\" per one lakh";
	}
	public String getloan2()
	{
		return "car if you take car loan your rate of interest is \"5%\" per one lakh";
	}
	public void m1()
	{
		System.out.println("Bank will provide loans and you can open bank accounts performs withdraw and deposit operations");
	}
}
class Customer extends Bank
{
	Bank o=new Bank();

		public void m1()
		{
			System.out.println(bank_name);
			System.out.println("we are available at different locations : ");
			System.out.println(branch1);
			System.out.println(branch2);
			System.out.println(branch3);
		}
		public void m2()
		{
			System.out.println("welcome to our bank!!! what help you required from us");
			System.out.println("Deposit");
			System.out.println("Withdrawl");
			System.out.println("OpenABankAccount");
			System.out.println("Loans");
			System.out.println("DisplayDetails");
			System.out.println("Aboutus");
			Scanner s=new Scanner(System.in);
			System.out.println("Enter your choice");
			String choice=s.next();
			if(choice.equalsIgnoreCase("deposit"))
			{
				System.out.println("Please Enter your details");
				System.out.println("Enter your name");
				name=s.next();
				System.out.println("Enter your Account no");
				Accno=s.next();
				if(Accno.length()==12)
				{	
					System.out.println("your balance amount in your account: "+balanceenquiry);
					System.out.println("Enter amount to Deposit");
					deposit=s.nextInt();
					System.out.println("Amount Deposited Successfully");
					System.out.println("Do you want to display your balance press yes or no ");
					String decision=s.next();
					if(decision.equalsIgnoreCase("yes"))
					{
						int b1=deposit+bankaccount;
						System.out.println("After deposit balance amount"+b1);
					}
					else if(decision.equalsIgnoreCase("No"))
					{
						System.out.println("Thank you visit again");
					}
				}
				else
				{
					System.out.println("Account no should be 12 numbers");
				}
			}
			else if(choice.equalsIgnoreCase("withdrawl"))
			{
				System.out.println("Enter your name");
				name=s.next();
				System.out.println("Enter your Account no");
				Accno=s.next();
				if(Accno.length()==12)
				{
					System.out.println("your balance amount in your account: "+balanceenquiry);
					System.out.println("Enter your withdraw amount");
					withdrawl=s.nextInt();
					if(withdrawl<=bankaccount)
					{
						
						System.out.println("Amount withdraw successfully");
						System.out.println("Do you want to display your balance press yes or no");
						String display=s.next();
						if(display.equalsIgnoreCase("yes"))
						{
							int w1=bankaccount-withdrawl;
							System.out.println("After withdraw your balance amount "+w1);
						}
						else if(display.equalsIgnoreCase("No"))
						{
							System.out.println("Thank you please visit again!!!!");
						}
						else
						{
							System.out.println("Enter valid input");
						}


					}
					else
					{
						System.out.println("your amount is greater than your saving!!! please enter valid amount");
					}
				}
				else
				{
					System.out.println("Account no should be 12 numbers");
				}
				
			}
			else if(choice.equalsIgnoreCase("openabankaccount"))
			{
				System.out.println("Enter your age");
				int age=s.nextInt();
				if(age>=18)
				{
					System.out.println("you are a major you are eligible for open bank account");
					System.out.println("Enter your name");
					String n=s.next();
					System.out.println("Enter your mobile number");
					String mobile=s.next();
					if(mobile.length()==10)
					{
						System.out.println("Enter the numbers of govt id proof");
						String gid=s.next();
						if(gid.length()==12)
						{
							System.out.println("Verified successfully");
							System.out.println("Successfully opened your bank account");
						}
						else
						{
							System.out.println("Enter a valid one!!!!");
						}
							
						
					}
					else
					{
						System.out.println("The mobile number should be 10 digits");
					}
				}
				else
				{
					System.out.println("sorry!!!! you are minor you are not eligible for open bank account");
				}
				
				
			}
			else if(choice.equalsIgnoreCase("Displaydetails"))
			{
				Display display=new Display();
				display.details();
				Details details2=new Details('a');
			}
			else if(choice.equalsIgnoreCase("Aboutus"))
			{
				About about=new About();
				about.m1('g');
			}
			else if(choice.equalsIgnoreCase("Loans"))
			{
				System.out.println(o.getloan1());
				System.out.println(o.getloan2());
			}
		
			
		}		
}
interface i2
{
	public void details();
}
class Display implements i2
{
	String name;
	int age;
	long phone;
	String bankno;
	String IFSC;
	String address;
	public void details()
	{
		name="Nithya";
		age=21;
		phone=1234567890;
		bankno="123456789012";
		IFSC="SBIN1234567";
		address="Adagutta society,kukatpally-Hyderabad";
		
	}
}
class Details extends Display
{
	Details()
	{
		details();
		System.out.println("-----STATE BANK OF BANK(SBI)-------");
		System.out.println("Name Of Account Holder : "+name);
		System.out.println("Age :"+age);
	}
	Details(int x)
	{
		this();
		System.out.println("Mobile Number : "+phone);
	}
	Details(char c)
	{
		this(10);
		System.out.println("Bank Account Number : "+bankno);
		System.out.println("Bank IFSC : "+IFSC);
		System.out.println("Address "+address);
	}
}
class About extends Display
{
	void m1()
	{
		System.out.println("State Bank of India (SBI) is an Indian multinational public sector bank and financial services statutory body headquartered in Mumbai, Maharashtra.\nSBI is the 48th largest bank in the world by total assets and ranked 221st in the Fortune Global 500 list of the world's biggest corporations of 2020, being the only Indian bank on the list. ");
	}
	void m1(int x)
	{
		m1();
		System.out.println("it is a public sector bank and the largest bank in India with a 23% market share by assets and a 25% share of the total loan and deposits market.");
	}
	void m1(char c)
	{
		m1(10);
		System.out.println("It is also the tenth largest employer in India with nearly 250,000 employees.\nOn 14 September 2022, State Bank of India became the third lender (after HDFC Bank and ICICI Bank) and seventh Indian company to cross the ₹ 5-trillion market capitalisation on the Indian stock exchanges for the first time.");
	}
	
}
