package pi;
public class Pi_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


double Pi,  divisor = 3, count = 0, preval = 0;



while (count < 999999999) {
	if (count % 2 == 0) 
		preval = preval + (1 / divisor);
		else preval = preval - (1 / divisor);
	
	count ++;
	divisor = divisor + 2;
		
	
		}
Pi = (1 - preval) * 4;
System.out.println(Pi);
	}

}
