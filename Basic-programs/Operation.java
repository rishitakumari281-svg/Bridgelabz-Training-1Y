import java.util.Scanner;
public class Operation{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double a,b,c;
		System.out.println("enter three no.");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		double aa=a + b *c;
		double bb=a * b +c;
		double cc=c + a /b;
		double dd=a % b +c;
		System.out.println("The results of Int Operations are "+aa+" , "+bb+" , "+cc+" and "+dd);
	}
}
		