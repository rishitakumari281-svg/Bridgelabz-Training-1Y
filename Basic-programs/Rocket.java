import java.util.Scanner;
public class Rocket{
	public static void main(String...args)throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("countdown starts with ?");
		n=sc.nextInt();
		System.out.println("countdown begins");
		while(n>0){
			System.out.println(n);
		Thread.sleep(1000);
		n--;
		}
		System.out.println("launch!!!!");
		sc.close();
}}
		
		
		