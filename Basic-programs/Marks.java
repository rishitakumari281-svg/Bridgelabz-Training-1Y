import java.util.Scanner;
public class Marks{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		double f,a,b,c,avg,per;
		System.out.println("enter the full marks for one subject");
		f=sc.nextInt();
		System.out.println("enter the marks of physics");
		a=sc.nextInt();
		System.out.println("enter the marks of maths");
		b=sc.nextInt();
		System.out.println("enter the marks of chemistry");
		c=sc.nextInt();
		avg=(a+b+c)/3;
		per=(avg/f)*100;
		if(per>=80){
			System.out.println("Average marks ="+avg);
			System.out.println("Grade =A");
			System.out.println("Remarks = (Level 4), above agency normalised students");
		}
			else if(per>=70&&per<=79){
				System.out.println("Average marks ="+avg);
			System.out.println("Grade =B");
			System.out.println("Remarks = (Level 3), at agency normalised students");
			}
			else if(per>=60&&per<=69){
				System.out.println("Average marks ="+avg);
			System.out.println("Grade =C");
			System.out.println("Remarks = (Level 2), below, but approaching agency normalised students");
			}
			else if(per>=50&&per<=59){
				System.out.println("Average marks ="+avg);
			System.out.println("Grade =D");
			System.out.println("Remarks = (Level 1), well below agency normalised students");
			}
			else if(per>=40&&per<=49){
				System.out.println("Average marks ="+avg);
			System.out.println("Grade =E");
			System.out.println("Remarks = (Level 1), too below agency normalised students");
			}
			else if(per<=39){
				System.out.println("Average marks ="+avg);
			System.out.println("Grade =F");
			System.out.println("Remarks = remedial standards");
			}
			else{
				System.out.println("invalid input");
			}
}}
				
			
				
			
		
		