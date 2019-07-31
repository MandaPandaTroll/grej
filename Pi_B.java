package pi;

public class Pi_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double Pi = 0,  divisor1 = 2, divisor2 = 3, divisor3 = 4, count = 0, preval = 0, dividend = 4;



		while (count < 999999999) {
			if (count % 2 == 0) 
				preval = preval + (dividend / (divisor1 * divisor2 * divisor3));
				else preval = preval - (dividend / (divisor1 * divisor2 * divisor3));
			
			
			divisor1 = divisor1 + 2;
			divisor2 = divisor2 + 2;
			divisor3 = divisor3 + 2;
			count ++;
			
				}
		Pi = (3 + preval);
		System.out.println(Pi);
		
	}

}
