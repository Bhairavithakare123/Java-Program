import java.util.Scanner;

public class while_loop_Ex {

	
	public static void main(String[] args) {
		int num;
		System.out.print("Enter any Number: ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		System.out.println("Natural number from 1 to "+num);
		
		int i=1;
		while(i<=num)
		{
			System.out.print(i + " ");
			i++;
		}
	
	}

}
