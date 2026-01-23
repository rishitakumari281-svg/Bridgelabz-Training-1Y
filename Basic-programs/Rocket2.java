import java.util.Scanner;
public class Rocket2{
	public static void main(String...args)throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("countdown starts with ?");
		n=sc.nextInt();
		System.out.println("countdown begins");
		for(int i=n;i>0;i--){
			System.out.println(i);
		Thread.sleep(1000);
		}
		System.out.println("launch!!!!");
		sc.close();
}}
		
		
		