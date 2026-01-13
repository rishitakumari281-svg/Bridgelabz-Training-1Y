import java.util.Scanner;
public class IntOp{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		System.out.println("enter three no.");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int aa=a + b *c;
		int bb=a * b +c;
		int cc=c + a /b;
		int dd=a % b +c;
		System.out.println("The results of Int Operations are "+aa+" , "+bb+" , "+cc+" and "+dd);
	}
}
		