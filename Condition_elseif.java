import java.util.Scanner;

public class Condition_elseif {
	public static void main(String[] args) {
		
	int marks;
	System.out.print("Enter Marks: ");
	Scanner obj=new Scanner(System.in);
	marks =obj.nextInt();
	if(marks>=60 && marks<=100)
	{
		System.out.print("First Division");	
	}
	else if(marks>=45 && marks<60)
	{
		System.out.print("Second Division");
	}
	else 
		if(marks>=35 && marks<45)
	{
		System.out.print("Third Division");
	}
	else
	{
		System.out.print("Failed");
	}
				
		
	}
}
