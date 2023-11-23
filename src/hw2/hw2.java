package hw2;

public class hw2 {
	
	public static void main(String[] args) {
		//第一題
		int sum = 0;
		for(int count=0; count<=1000; count=count+2)
			sum += count;
		System.out.println(sum);
		//第二題
		int sum1 = 1;
		for(int count=1; count<=10; count++)
			sum1 = (sum1 * count);
		System.out.println(sum1);
		//第三題
		int sum2 = 1;
		int count = 1;
		while(count<=10) {
			sum2 = (sum2 * count);
			count++;}
		System.out.println(sum2);
		//第四題
		int i;
		for (i = 1; i <= 10 ; i++) {
			System.out.print((i*i)+" ");
		}
		//第五題
		int a;
		for (a = 1; a <= 49; a++) {
			if( a%10!=4 ) {
			System.out.println();
			System.out.println(a+" ");}
		}
		
		}

		}
				
	


