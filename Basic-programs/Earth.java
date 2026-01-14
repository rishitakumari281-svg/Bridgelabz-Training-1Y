public class Earth{
	public static void main(String[] args){
		double r=6378.0;
		double volume=(4.0/3.0)*3.14*r*r*r;
		double mile=1.6*volume;
		System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f",volume,mile);
}}		