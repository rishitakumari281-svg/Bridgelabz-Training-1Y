import java.util.Scanner;
public class Divisible2{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the no.");
		n=sc.nextInt();
		if(n>0){
		int i=1;
		while(i<=n){
					if(n%i==0){
			    System.out.println(i);
					}
					i++;	
		}}
		else{
			System.out.println("invalid input");
}}}