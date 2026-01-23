import java.util.Scanner;
public class FizzBuzz{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("enter the no.");
		n=sc.nextInt();
		if(n>0){
			if(n%3==0&&n%5==0){
				for(int i=0; i<n;i++){
					System.out.println("FizzBuzz");
			}}
				else if(n%3==0){
					for(int i=0; i<n;i++){
					System.out.println("fizz");
				}}
					else if(n%5==0){
						for(int i=0; i<n;i++){
					System.out.println("Buzz");
					}}
						else{
							for(int i=0; i<n;i++){
					System.out.println(n);
		}}}
		else{
					System.out.println("invalid number");
}}}