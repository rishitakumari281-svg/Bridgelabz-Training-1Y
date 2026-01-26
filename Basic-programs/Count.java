import java.util.Scanner;
public class Count{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter a no.");
		n=sc.nextInt();
		int c=0;
		int t=n;
		while(t!=0){
			t=t/10;
			c++;
}
	System.out.println("The no of digits="+c);
	}}