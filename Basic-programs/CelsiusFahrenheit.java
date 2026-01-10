import java.util.Scanner;
public class CelsiusFahrenheit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int c,f;
		System.out.println("input celsius temperature");
		c = sc.nextInt();
		f = (c * 9/5)+32;
		System.out.println("fahrenheit ="+f);
}}
		