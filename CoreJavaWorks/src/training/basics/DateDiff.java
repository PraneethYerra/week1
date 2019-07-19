package training.basics;

public class DateDiff {

	/**
	 * *
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		int a = 01;
		int b = 01;
		int c = 2016;
		int count=0;

		// check if year is a a leap year
		for(int x = 0;x<=c;x++)
		if(c%400==0||c%4==0 && c%100 ==1 ) {
			//condition to count leap yaer only if date exceeded feb 29
			count++;
			if(c==c &&(b<2||b==2&&a<=28))
				count--;
		}
		
		int total = 365*c+count;
		
		int a1 = 29;
		int b1 = 02;
		int c1 = 2020;
		int count1=0;

		
		for(int x = 0;x<=c1;x++)
			if(c1%400==0||c1%4==0 && c1%100 ==1 ) {
				count1++;
				if(c1==c1 &&(b1<2||b1==2&&a1<=28))
					count1--;
			
			}
		int total1 = 365*c1+count1;
			
		System.out.println(total1-total);
		
	}

}
