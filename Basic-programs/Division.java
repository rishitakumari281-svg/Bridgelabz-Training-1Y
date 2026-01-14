import java.util.Scanner;
public class Division{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("enter two no.");
		a = sc.nextInt();
		b = sc.nextInt();
		int rem=a%b;
		int d=a/b;
		System.out.println("The Quotient is "+d+" and Reminder is "+rem+" of two number "+a+ " and "+b);
	}
}
		