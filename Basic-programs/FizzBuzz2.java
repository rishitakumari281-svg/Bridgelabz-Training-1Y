import java.util.Scanner;
public class FizzBuzz2{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the no.");
		n=sc.nextInt();
		if(n>0){
			if(n%3==0&&n%5==0){
				int i=0;
				while(i<n){
					System.out.println("FizzBuzz");
					i++;
			}}
				else if(n%3==0){
					int j=0;
					while(j<n){
					System.out.println("fizz");
					j++;
				}}
					else if(n%5==0){
						int k=0;
						while(k<n){
					System.out.println("Buzz");
					k++;
					}}
						else{
							int w=0;
							while(w<n){
					System.out.println(n);
					w++;
		}}}
		else{
					System.out.println("invalid number");
}}}