import java.util.Scanner;
public class Vote{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter age");
		n=sc.nextInt();
		if(n>18)
		{
			System.out.println("The person's age is "+n+" and can vote.");
		}
		else{
			System.out.println("The person's age is "+n+" and cannot vote.");
}}}
			