import java.util.Scanner;
public class Natural{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		float n;
		float sum;
		System.out.println("enter a no.");
		n=sc.nextFloat();
		if(n>0&&n%1==0)
		{
			sum=n * (n+1) / 2;
			System.out.printf("The sum of %.0f natural numbers is %.0f" ,n,sum);
		}
		else{
			System.out.printf("\n The number %.0f is not a natural number" ,n);
}}}
			