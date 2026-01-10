import java.util.Scanner;
public class VolumeCylinder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r,h;
		double v;
		System.out.println("input radius of cylinder");
		r = sc.nextInt();
		System.out.println("input height of cylinder");
		h = sc.nextInt();
		v = 3.14 *r*r*h;
		System.out.println("volume of cylinder ="+v);
}}