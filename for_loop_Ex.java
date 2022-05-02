import java.util.Scanner;

public class for_loop_Ex {

	public static void main(String[] args) {
		int num;
		System.out.print("Enter any Number: ");
		Scanner s =new Scanner(System.in);
		num=s.nextInt();
		System.out.println("Natural number from 1 to "+num);	
		for( int i=1;i<=num;i++)		
		{
			System.out.print(i+" ");	
		}
	}

}
