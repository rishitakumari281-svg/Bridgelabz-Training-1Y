import java.util.Scanner;
public class Largest
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		String r="No";
		String p="No";
		String q="No";
		System.out.println("enter three number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b&&a>c){
		r = "Yes";
		}
		else if(b>c&&b>a){
         p = "Yes";
		}
		 else {
			 q = "Yes";
		}
		System.out.println("Is the first number largest?" +r);
		System.out.println("Is the second number largest?" +p);
		System.out.println("Is the third number largest?" +q);
	}
}	
			