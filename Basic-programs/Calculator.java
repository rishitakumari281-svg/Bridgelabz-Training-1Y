import java.util.Scanner;
	public class Calculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double a,b;
		System.out.println("input first number");
		a=sc.nextDouble();
		System.out.println("input second number");
		b=sc.nextDouble();
		int n;
		System.out.println(" press 1 for + , 2 for - , 3 for * , 4 for /");
		n=sc.nextInt();
		switch (n) {
			case 1:
			double add = a+b;
			System.out.println("addition="+add);
			break;
			case 2:
			double substract= a-b;
			System.out.println("substraction="+substract);
			break;
			case 3:
			double multiplication = a*b;
			System.out.println("multiplication="+multiplication);
			break;
			case 4:
			double division =a/b;
			System.out.println("Division="+division);
			break;
			default:
			System.out.println("invalid input");
}}}
		

		