import java.util.Scanner;
public class Feet{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double cm;
		System.out.println("enter centimeter");
		cm = sc.nextDouble();
		double foot=cm/30.48;
		double inches=foot*12;
		System.out.println("Your Height in cm is "+cm+" while in feet is "+foot+" and inches is "+inches);
}}