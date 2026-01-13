import java.util.Scanner;
public class Handshake{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		double n;
		System.out.println("enter total no. of students");
		n = sc.nextDouble();
		double p= (n * (n - 1)) / 2;
		System.out.println("The number of possible handshakes "+p);
}}