import java.util.Scanner;

public class ConditionIf {

	public static void main(String[] args) {
		int pwd;
		System.out.println("Enter password:= ");
        Scanner obj=new Scanner(System.in);
        pwd=obj.nextInt();
        if(pwd==2371)
        {
        	System.out.println("My Name:= Bhairavi");
        	System.out.println("My Age:= 26");	
        	System.out.println("My Contact:=9730388963 ");
        	System.out.println("My Address:=Gujari Ward,Civil line Bramhapuri ");
        }
	}

}
