import java.util.Scanner;

public class dowhile_loop {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter  number : ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		System.out.println("Natural number from  ");
		do
		{
			++num;
		}
		while (num<=10);
			
	
	
	}

}
