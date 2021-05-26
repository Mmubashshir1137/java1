package day1;
import java.util.Scanner;

public class hellow {
	public static void sum(int a, int b, int c) 
	{
		int f=a+b+c;
		System.out.println("Sum is= "+f);
		
	}
	public static void sum(String name, int roll)
	{
		System.out.println("Roll numb is "+roll);
		System.out.println("Name is "+name);
	}

	public static void main(String[] args) 
	{
		int a =10, b =20, c =30, roll=1;
		String name;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		sum(a, b, c);
		sum(name, roll);
	}

	
		
			
			
		
		}
	
	
		
	

	


