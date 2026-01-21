public class Var{
		static int a=15;
		int b=14;
		void m(){
			System.out.println(a);
			System.out.println(b);
		}
		public static void m1(){
			int y=20;
			System.out.println(y);
			System.out.println("hello");
		}
		public static void main(String[] args){
			m1();
			Var obj = new Var();
			obj.m();
			System.out.println(obj.b);
}}