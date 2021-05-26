package day1;
import java.util.Scanner;
public class ass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size= sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println("Enter elements of an array");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			
			System.out.println(arr[i]);
		}
		System.out.println("****");
		
		boolean flag=true;
		int temp=0;
		int[] arr1= new int[size];
		for(int i=0; i<size; i++)
		{
			for(int j=i+1;j<size;j++)
			{	
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}

			}
		}
		System.out.println("******");
		for(int i=0; i<size; i++)
		{
			System.out.println(arr[i]);
		}

		
		
	}
	
	}

