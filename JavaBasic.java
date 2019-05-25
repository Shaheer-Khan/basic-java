import java.util.*;
import java.io.*;


class global
{
	static Scanner sc = new Scanner(System.in); //Scanner Class	
}


class JavaBasic extends global
{
	public static void main(String args[])
	{
		int value = 0;
		do
		{
			// Menu 
		System.out.println("Enter a number from the list of options: ");
		System.out.println("1.Strings and array of char: "+
							"2.For loop logic: "+
							"3.Fibonacci series: "+"4.Factorial:"+"\n"+"5.Add numbers user input: 6. Exit");
		int options = sc.nextInt();
		switch(options)
		{
		
			
			default:
			
			System.out.println("Invalid Input");
			break;
			
			case 1:

			//Strings and array of char.
			
			String firstString  =  new String();
			System.out.println("Enter a string: ");
					firstString = sc.next();
						function(firstString);
			break;
			
			case 2:
			
			//For loop logic
			
			System.out.println("Enter a number: ");
			int firstNumber = sc.nextInt();
			System.out.println("Enter another number: ");
			int secondNumber = sc.nextInt();

			function1(firstNumber,secondNumber);
			
			break;
			
			case 3:
			
			//Fibonacci series

			System.out.println("Enter a number: ");
			int firstNumber1 = sc.nextInt();
			
			function2(firstNumber1);
			
			break;
			case 4:

			//Factorial

			System.out.println("Enter a number to find it's factorial");
			int factNumber = sc.nextInt();

			factorial(factNumber);

			break;

			case 5:

			//Add numbers user input

				System.out.println("Enter a number: ");
				int add1 = sc.nextInt();
				System.out.println("Enter another number: ");
				int add2 = sc.nextInt();
			 	
			 	add_Fun(add1,add2);
			break;

			case 6:
			 System.out.println("Thank You For Using My Platform.");
			break;
		}
		//Verification
		System.out.println("Do you want to continue Y/N");
		char choice = sc.next().charAt(0);	
		if(choice == 'Y')
		{
			value = 1;
		}
		else if(choice == 'N')
		{
			value = 0;
		}
		else
		{
			System.out.println("Invalid Input");
			break;
		}
	}while(value == 1);
		
	}
		
		//Strings and array of char
		static void function(String s1)
		{
			
			String[] array1 = new String[100];
			for (int i=0;i<s1.length();i++)
		 	{
				char c = s1.charAt(i);
				array1[i] = Character.toString(c);
			}
		
			System.out.println("The entered string was: "+s1);
			System.out.println("The entered string in the array: ");
		
			for (int i=0;i<s1.length();i++)
			{
				System.out.println(array1[i]);
			}
			
		}
		
		//For loop logic
		static void function1(int a, int b)
		{
			System.out.println("I'm in function1: ");
			
			
			for(int j =0;j<=a;j++)
			{
				for(int k=0;k<=b;k++)
				{
						
						System.out.println("The value of j: "+j+" The value of k: "+k);
				}
			}
			
		}
		
		//Fibonacci series
		static void function2(int d)
		{
			
			System.out.println("I'm in function2: ");
			System.out.println("Fibonacci series for: "+ d + " is: ");
			for(int l=1;l<=d;l++)
			{
				
				System.out.print(fibo(l) +" "); //Recurrent function call
			}
			 
		}
		
		//Recurrent function
		static int fibo(int f)
		{
			if(f == 1 || f == 2)
			{
				return 1; 
			}
			else
			{
				return fibo(f-1)+fibo(f-2);
			}
		}
		//Factorial
		static void factorial(int f)
		{
			int i, fact=1;
			for(i=1;i<=f;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial of "+f+" is: "+fact); 			
		}
		//Add numbers user input
		static void add_Fun(int a, int b)
		{
			int c = a+b;
			System.out.println("The added number is: "+c);
		}
}