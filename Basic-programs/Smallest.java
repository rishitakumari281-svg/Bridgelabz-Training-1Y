import java.util.Scanner;
public class Smallest
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		String r;
		System.out.println("enter three number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a<b&&a<c){
		r = "Yes";
		}
		else{
         r = "No";
		}
		System.out.println("Is the first number smallest?" +r);
	}
}	
			