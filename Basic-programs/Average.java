import java.util.Scanner;
public class Average{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		double av;
		System.out.println("input 1st no.");
		a = sc.nextInt();
		System.out.println("input 2nd no.");
		b = sc.nextInt();
		System.out.println("input 3rd no.");
		c = sc.nextInt();
		av=(a+b+c)/3;
		System.out.println("average of three no. ="+av);
}}