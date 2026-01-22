public class Increament{
	public static void main (String...args){
		int q=0;
		System.out.println("val:"+q);
		q++;		
		System.out.println("val:"+q++);
		System.out.println("val:"+q);
		++q;
		System.out.println("val:"+q++);
		System.out.println("val:"+q++);
		int z = q + q++ + ++q + q + ++q + q++;
		System.out.println("val:"+q);
		int y = q - q++ - --q + q - ++q + q++;
		System.out.println("val:"+q);
		System.out.println(z);
		System.out.println(y);
		for(int i=0; i<10; i++){
			System.out.println("i :" +i);
		}
		int j=10;
		while(j>0){
			System.out.println("j :"+j);
			j--;
		}
		int k=10;
		do{
			System.out.println("k :"+k);
			k--;
}while(k>0);}}