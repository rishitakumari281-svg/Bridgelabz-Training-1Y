import java.util.Scanner;
public class AreaTriangle{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double b,h;
		System.out.println("enter base");
		b=sc.nextDouble();
		System.out.println("enter height");
		h=sc.nextDouble();
		double area=0.5*b*h;
		double foot=area/30.48;
		double inches=foot*12;
	System.out.println("Your area in cm is "+area+" while in feet is "+foot+" and inches is "+inches);
}}