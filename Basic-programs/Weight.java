import java.util.Scanner;
public class Weight{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double w,h;
		System.out.println("input weight in kgs");
		w=sc.nextDouble();
		System.out.println("input height in cms");
		h=sc.nextDouble();
		double he = h/100;
		double bms= w/(he*he);
		if(bms<=18.4){
			System.out.println("Underweight");
		}
		else if(bms>18.4&&bms<=24.9){
			System.out.println("Normal");
		}
		else if(bms>24.9 && bms<=39.9){
			System.out.println("Overweight");
		}
		else if(bms>39.9){
			System.out.println("Obese");
		}
		else{
			System.out.println("Invalid input");
		}
	}
}
		
		