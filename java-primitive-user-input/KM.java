import java.util.Scanner;
public class KM{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double k ;
		System.out.println("enter km");
		k = sc.nextDouble();
		double m=1.6*k;
		System.out.println("The total miles is "+m+" mile for the given "+k);
}}		