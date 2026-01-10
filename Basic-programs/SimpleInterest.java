import java.util.Scanner;
public class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int p,r,t;
		double i;
		System.out.println("input principle");
		p = sc.nextInt();
		System.out.println("input rate");
		r = sc.nextInt();
		System.out.println("input time");
		t = sc.nextInt();
		i=(p*r*t)/100;
		System.out.println("simple interest ="+i);
}}