import java.util.Scanner;
public class PerimeterRectangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int l,w;
		double p;
		System.out.println("input length of rectangle");
		l = sc.nextInt();
		System.out.println("input width of rectangle");
		w = sc.nextInt();
		p=2*(l+w);
		System.out.println("perimeter of rectangle ="+p);
}}