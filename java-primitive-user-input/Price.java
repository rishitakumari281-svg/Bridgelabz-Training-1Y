import java.util.Scanner;
public class Price{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double p,q;
		System.out.println("enter price");
		p = sc.nextDouble();
		System.out.println("enter quantity");
		q = sc.nextDouble();
		double t=p*q;
		System.out.println("The total purchase price is INR "+t+ " if the quantity "+q+" and unit price is INR "+p);
}}