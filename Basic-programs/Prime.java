import java.util.Scanner;
public class Prime{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		int p=0;
		System.out.println("enter a no.");
		n=sc.nextInt();
for(int i=2;i<=n/2;i++)
{
if(n%i==0){
p=1;
break;
}}
if(p==1){
System.out.println("not a prime number");
}
else{
	System.out.println("prime number");
}
}}
			