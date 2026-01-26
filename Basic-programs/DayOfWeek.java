public class DayOfWeek{
	public static void main(String[] args){
		int d,m,y;
		d=Integer.parseInt(args[0]);
		m=Integer.parseInt(args[1]);
		y=Integer.parseInt(args[2]);
		int yo = y-(14 - m) /12;
		int x = yo+ yo/4 -yo/100 +yo/400;
		int mo = m+12*((14-m)/12)-2;
		int doo = (d+x+ 31*mo /12) %7;
		switch(doo){
			
    case 0:
        System.out.println("Sunday");
        break;
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
}
}}
