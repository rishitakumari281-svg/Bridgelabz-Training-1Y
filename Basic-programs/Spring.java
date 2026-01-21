import java.util.Scanner;
public class Spring{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		String m;
		int d;
		System.out.println("enter the date");
		d= sc.nextInt();
		sc.nextLine();
		System.out.println("enter the month");
		m= sc.nextLine().toLowerCase();
		if(d>20&&m.equals("march")){
		System.out.println("Spring");}
	else if(m.equals("april")||m.equals("may")){
				System.out.println("Spring");
			}
			else if(d<20&&m.equals("june")){
			System.out.println("Spring");}
				else{
				System.out.println("not spring");
				}
}
}
	