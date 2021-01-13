/**
 * 
 */

/**
 * @author Patricia
 * enumerated type class which sets the set in the values for the grading system.
 */
public enum Grade 
{
	APLUS(100, 90, true), A(89, 85, true), AMINUS(84, 80, true), BPLUS(79, 75, true), B(74, 70, true),
	BMINUS(69, 65, true), CPLUS(64, 60, true), C(59, 55, true), CMINUS(54, 50, true), D(49, 0, false) ;
	
	// instance variables 
	private int max;
	private int min;
	private boolean pass; 
	
	//constructor
	private Grade(int max, int min, boolean pass) {
		this.max = max;
		this.min = min;
		this.pass = pass;
		
	}

	//getters and setters methods for each of the variables 
	public int getMax() {
		return max;
	}


	public void setMax(int max){
		this.max = max;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	public boolean isPass() {
		return pass;
	}


	public void setPass(boolean pass) {
		this.pass = pass;
	}
}
