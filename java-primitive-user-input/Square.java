import java.util.Scanner;
public class Square{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double p;
		System.out.println("enter perimeter");
		p=sc.nextDouble();
		double s=p/4.0;
	System.out.println("The length of the side is "+s+" whose perimeter is "+p);
}}