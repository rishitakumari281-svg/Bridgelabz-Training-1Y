import java.util.Scanner;
public class Yards{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double f;
		System.out.println("enter feets");
		f = sc.nextDouble();
		double y=f/3.0;
		double m=f/5280.0;
		System.out.println("Your distance in feet is "+f+" while in yards is "+y+" and miles is "+m);
}}