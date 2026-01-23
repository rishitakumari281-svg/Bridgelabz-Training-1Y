import java.util.Scanner;
public class Sum{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n=1;
		int sum=0;
		while(n!=0){
			System.out.println("enter number");
			n=sc.nextInt();
			sum=sum+n;
		}
		System.out.println("sum ="+sum);
		sc.close();
}}
		
		
		