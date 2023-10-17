import java.util.Scanner;
public class Factorial {
	void facttask(int n)
	{
		//task
		int fact =1;
		for(int i=1; i<=n ; i++)
		{
		   fact =fact*i;
		}
		System.out.println("The Factorial of a given number "+fact);
	}
	public static void main(String[] args) {
		System.out.println("Enter one number  to find its factorial");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Factorial ref = new Factorial();
		ref.facttask(num);
	}

}
