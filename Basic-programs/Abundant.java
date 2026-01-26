import java.util.Scanner;
public class Abundant{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n,sum=0;
		System.out.println("enter a no.");
		n=sc.nextInt();
		for(int i=1; i<n ; i++){
			if(n%i==0){
				sum=sum+i;
		}}
	if(sum>n){
		System.out.println("Abundant number");
	}
	else
	{
		System.out.println("not Abundant number");
}}}
			