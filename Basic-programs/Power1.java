import java.util.Scanner;
public class Power1{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n,b;
		int p=1;
		System.out.println("enter a no.");
		n=sc.nextInt();
		System.out.println("enter the power");
		b=sc.nextInt();
		
			for(int i=1;i<=b;i++){
				p=p*n;
			}
		System.out.println(n+ " to the power of "+b+" = "+p);	
}}
			