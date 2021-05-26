package day1;
import java.util.Scanner;

public class TestCustomer {
	private String name;
	private String emailId;
	private int age;
	private double creditLimit;
	
	public void acceptTestCustomer()
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Customer Name= ");
		name=sc.nextLine();
		
		System.out.println("Enter EmailID= ");
		emailId=sc.next();
		
		System.out.println("Enter Age= ");
		age=sc.nextInt();
		
		System.out.println("Enter Credit Limit= ");
		creditLimit=sc.nextDouble();
		
	}
	
	public void displayTestCustomer()
	{
		System.out.println("Name= "+name);
		System.out.println("EmailID= "+emailId);
		System.out.println("Age= "+age);
		System.out.println("Credit Limit= "+creditLimit);
	}

}
