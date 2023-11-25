package hw1;

public class HW1Q5V1 {
	
	public static void main (String[]args) {
		//第五題 在銀行存入150萬，銀行利率為2%，如果每年利息持續存入
        //請用複利計算10年後本金加利息共多少錢
		
		double cash = 1500000;
		double rate = 1.02;
		double sum = Math.pow(rate,10)*cash;
		System.out.println("10年後本金加利息為"+Math.round(sum));
	}

}
