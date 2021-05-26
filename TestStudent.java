package day1;

public class TestStudent {

	public static void main(String[] args) {
		Student stud1 = new Student();
		
		stud1.displayInfo();
		
		stud1.setRoll(500);
		String name;
		stud1.setName("Samit");
		System.out.println("Updated Roll Number is"+stud1.getRoll());
		System.out.println("Updated Name is: "+stud1.getName());
		
		
		Student stud2=new Student(10, "Rupesh", "b" ,400);
		stud2.displayInfo();


	}

}
