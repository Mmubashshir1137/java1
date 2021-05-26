package day1;
import java.util.Scanner;


public class Student {
	public int roll;
	public String name;
	private String grade;
	double totalMarks;
	
	public Student()
	{
		roll=10;
		totalMarks=500;		
		
	}
	
	public Student(int roll, String name, String grade, double totalMarks)
	{
		this.roll=roll;
		this.name=name;
		this.grade=grade;
		this.totalMarks=totalMarks;
	}
	
	
	
	public void acceptInfo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll number, Name, Grade, Total Marks: ");
		roll=sc.nextInt();
		name=sc.nextLine();
		grade=sc.next();
		totalMarks=sc.nextDouble();
		
	}
	
	public void setRoll(int roll)
	{
		this.roll=roll;
		
	}
	
	public int getRoll()
	{
		return roll;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void displayInfo()
	{
		System.out.println(" "+roll+" "+name+" ");
		System.out.println("Greade:"+grade);
		System.out.println("Total marks: "+totalMarks);
	}


}
