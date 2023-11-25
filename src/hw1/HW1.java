package hw1;

public class HW1 {
	
    public static void main (String[]args) {
    	//第一題 計算12、6兩個數值的和與積
    	int a = 12 , b = 6;
    	    System.out.println(a*b);
    	    System.out.println(a+b);
    	//第二題 計算200顆蛋共是幾打幾顆
    	int dozen = 200 / 12; 
    	double eggs  = 200 % 12;
    	String c = "打";
    	String d = "顆";
    	    System.out.println(dozen + c + eggs + d);
    	//第三題 算出256559秒是多少天、多少小時、多少分與多少秒
    	int second = 256559 % 60 ;
        int minute = (256559 / 60);
        int hour = minute / 60;
        int day = hour / 24;
        String e = "秒";
        String f = "分鐘";
        String g = "小時";
        String h = "天";
        int minutes = (minute) - (hour * 60);
        int hours = (hour) - (day * 24);
            System.out.println(day + h + hours + g + minutes + f + second + e);

        //第四題 定義一個常數為3.1415(圓周率)
        //並計算半徑為5的圓周長及圓面積
        double pi = 3.1415 ;
        int r = 5;
            System.out.println((pi * r) * r);
            System.out.println((2*r) * pi);
        //第五題 在銀行存入150萬，銀行利率為2%，如果每年利息持續存入
        //請用複利計算10年後本金加利息共多少錢
        int principal = 1500000;
        double rate = 1+0.02;
        double year1 = principal * rate;
        double year2 = year1 * rate;
        double year3 = year2 * rate;
        double year4 = year3 * rate;
        double year5 = year4 * rate;
        double year6 = year5 * rate;
        double year7 = year6 * rate;
        double year8 = year7 * rate;
        double year9 = year8 * rate;
        double year10 = year9 * rate;
            System.out.println(year10);
        //第六題
        System.out.println(5+5);
        //結果顯示為數字5+5=10
        System.out.println(5+'5');
        //結果顯示為數字5+'5'的ASCII值53=58
        System.out.println(5+"5");
        //結果顯示為數字5+字串5=55
    }
}
