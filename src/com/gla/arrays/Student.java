import java.util.Scanner;
public class Student{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int stu[] = new int[10];
	for( int i=0; i<10; i++){
    System.out.println("enter the age");
    stu[i]=sc.nextInt();
	}
	for (int i=0; i<10; i++){
	if(stu[i]>=18){
		System.out.println("The student with age "+stu[i]+" can vote. " );
	}
	else{
	System.out.println("The student with age "+stu[i]+" cannot vote. " );
	}
	}
	}
}
		
		