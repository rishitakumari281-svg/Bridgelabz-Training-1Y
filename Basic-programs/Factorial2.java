import java.util.Scanner;
public class Factorial2{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		int f=1;
		System.out.println("enter a no.");
		n=sc.nextInt();
			for(int i=1;i<=n;i++){
				f=f*i;
			}
			System.out.println("factorial="+f);
}}
			