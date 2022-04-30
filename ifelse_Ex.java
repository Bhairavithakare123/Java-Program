
    
   import java.util.Scanner;

   public class ifelse_Ex {

	public static void main(String[] args) {
		
	int age;
	System.out.println("Enter Age := ");
    Scanner obj=new Scanner(System.in);
    age=obj.nextInt();
    if(age>=18)
    {
    	System.out.println("Eligible for voting");
    }
   
    else
    {
    	System.out.println("Not Eligible for voting ");	
    }
}

}