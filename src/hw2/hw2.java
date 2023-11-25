package hw2;

public class hw2 {
	
	public static void main(String[] args) {
		//第一題 計算1~1000的偶數和
		int sum = 0;
		for(int count=0; count<=1000; count=count+2)
			sum += count;
		System.out.println(sum);
		//第二題 計算1~10的連乘積(用for迴圈)
		int sum1 = 1;
		for(int count=1; count<=10; count++)
			sum1 = (sum1 * count);
		System.out.println(sum1);
		//第三題 計算1~10的連乘積(用While迴圈)
		int sum2 = 1;
		int count = 1;
		while(count<=10) {
			sum2 = (sum2 * count);
			count++;}
		System.out.println(sum2);
		//第四題 輸出結果為1 4 9 16 25 36 49 64 81 100
		int i;
		for (i = 1; i <= 10 ; i++) {
			System.out.println((i*i));
		}
		//第五題 輸出1~49中不含4的數字結果、共幾個
		int a, sum5 = 0;
		for (a = 1; a <= 49; a++) {
			if( a%10!=4 ) {
			System.out.print(a+" ");
			sum5++;}
		}
		System.out.println();
		System.out.println("共"+sum5+"個數字");
		//第六題 輸出12345678910並逐行少去最後一個數字
		
		int b, c;
		for (b=10; b>0;b--) {
			for(c=1; c<=b; c++) {
			System.out.print(c);
		}
			System.out.println();
		}
		
		//第七題 輸出A BB CCC 以此類推至FFFFFF
		int d, e;
		char abc = 'A';
		for (d=1; d<=6; d++) {
			for (e=1; e<=d; e++) {
			System.out.print(abc);
			}
			System.out.println();
			abc++;
			}
		}

		}

	


