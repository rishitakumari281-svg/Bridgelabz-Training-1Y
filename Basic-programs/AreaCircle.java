import java.util.Scanner;
public class AreaCircle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r;
		double a;
		System.out.println("input radius of circle");
		r = sc.nextInt();
		a = 3.14 *r*r;
		System.out.println("area of circle ="+a);
}}