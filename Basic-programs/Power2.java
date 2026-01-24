import java.util.Scanner;
public class Power2{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n,b;
		int p=1;
		System.out.println("enter a no.");
		n=sc.nextInt();
		System.out.println("enter the power");
		b=sc.nextInt();
		
			int i=1;
			while(i<=b){
				p=p*n;
				i++;
			}
		System.out.println(n+ " to the power of "+b+" = "+p);	
}}
			