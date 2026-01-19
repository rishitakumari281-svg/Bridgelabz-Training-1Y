import java.util.Scanner;
public class Positive{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter number");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("Positive");
		}
		else if (n==0){
			System.out.println("Zero");
}
else{
	System.out.println("Negative");
}}}
			