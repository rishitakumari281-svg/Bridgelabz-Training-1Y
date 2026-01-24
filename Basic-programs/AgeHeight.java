import java.util.Scanner;
public class AgeHeight{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		int d,e,f;
		int h=0;
		int age=0;
		System.out.println("enter the age of Amar, Akbar, and Anthony");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println("enter the height of Amar, Akbar, and Anthony");
		d=sc.nextInt();
		e=sc.nextInt();
		f=sc.nextInt();
		if(a<b&&a<c){
		age=a;}
		else if(b<a&&b<c){
		age=b;}
		else{
		age=c;}
		if(d>e&&d>f){
		h=d;}
		else if(e>d&&e>f){
		h=e;}
		else{
		h=f;}
		System.out.println("smallest age="+age);
		System.out.println("tallest height="+h);
}}