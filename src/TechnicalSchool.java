/**
 * This class is where all the data from the given table is located, uses that information, and checks for the certification
 * of a student 
 * @author Patricia
 **/

public class TechnicalSchool 
{
	// instance variables
	private Module[] offerings; 
	
	
	//constructor 
	public TechnicalSchool() {
		this.offerings = TechnicalSchool.semesterOneModuleOfferings(); // calling its own method when assigning this
	}



	/**
	 * This private method has 13 Module objects as per the give data table.
	 * @return an array, offerings, containing the added objects.
	 */
	static private Module[] semesterOneModuleOfferings() {

		Module[] offerings = new Module[13];

		// each type comes from the type enum class
		offerings[0] = new Module(Type.TAUGHT, "Programming", "PROG101", Level.ONE);
		offerings[1] = new Module(Type.TAUGHT, "Statistics", "STAT102", Level.ONE);
		offerings[2] = new Module(Type.TAUGHT, "Database Design", "DATA222", Level.TWO);//
		offerings[3] = new Module(Type.TAUGHT, "Object-Oriented Programming", "PROG202", Level.TWO);
		offerings[4] = new Module(Type.TAUGHT, "Information Systems ", "INSY313", Level.THREE);
		offerings[5] = new Module(Type.TAUGHT, " Web Services ", "WEBS332", Level.THREE);
		offerings[6] = new Module(Type.SELF_STUDY, "Technology Applications  ", "TECH103", Level.ONE);
		offerings[7] = new Module(Type.SELF_STUDY, "Theory of Computation ", "THEO111", Level.ONE);
		offerings[8] = new Module(Type.SELF_STUDY, "Model Checking  ", "MODC233", Level.TWO);
		offerings[9] = new Module(Type.SELF_STUDY, "Topology", "TOPG233", Level.TWO);
		offerings[10] = new Module(Type.SELF_STUDY, "Logic", "LOGI321", Level.THREE);
		offerings[11] = new Module(Type.PROJECT, "Web App Dev", "PROJ399", Level.THREE);
		offerings[12] = new Module(Type.CLIENT_PROJECT, "Great Code Company", "EXTO396", Level.THREE);


		return offerings;
	}

	// get the offerings through this method
	public Module[] getOfferings() {
		return this.offerings;
	}

	/**
	 * Searches through the offerings' array using a for loop. An if statement to compare
	 * the string value located at i, to the object variable code
	 * 
	 * @return is a module object that matches with the passed code parameter
	 **/
	public Module lookup(String code) {
		
		for (int i = 0 ; i < offerings.length; i++) {
			if (offerings[i].getCode().equals(code)) {
				return offerings[i];
			}
		}
		return null;
		
	}



	/*****
	 * The purpose of this method is to act as "The Certification Algorithm"
	 * Criteria:
	 * • at least three modules passed at level 1, either taught or self-study AND
	 * • at least three modules passed at level 2, more than one must be self-study AND
	 * • at least four modules passed at level 3, at least two must be taught AND
	 * • at least one project module passed (either of project or client project).
	 * @param student
	 * @return
	 */
	public boolean isCertified(Student student)
	{
		int count1 = 0; // this count assists on the first condition (at level1) and gets incremented if the first if statement is true 
		int count2 = 0; // this count assists at checking on level 2 and if the student passed
		int count3 = 0;// this count assists with level2 self-study and pass
		int count4 = 0;// level 3 and passed
		int count5 = 0; //level 3 and passed and self-taught
		int count6 = 0; //this assists with either client project or just project
		
		Result[] results = student.getTranscript();// getting his/her transcript first so that we can check each result

		/*****
		 * this for-loop does check what is happening at i so that a count can be incremented accordingly
		 */
		for (int i=0; i < results.length; i++) {

			// first check if i is at level one
			if (results[i].getModule().getLevel() == Level.ONE) { // now check whether i is taught or self-study and that i has passed on it
				if((results[i].getModule().getType() == Type.TAUGHT || results[i].getModule().getType() ==Type.SELF_STUDY) && results[i].getGrade().isPass()) {
					count1++; // given the above is meet - do increment count 1
				}
			}

			//
			if (results[i].getModule().getLevel() == Level.TWO && results[i].getGrade().isPass() ) {
				count2++;
				if(results[i].getModule().getType() == Type.SELF_STUDY) {
					count3++;
				}
			}

			if(results[i].getModule().getLevel() == Level.THREE && results[i].getGrade().isPass() ){
				count4++;
				if(results[i].getModule().getType() == Type.TAUGHT)
				{
					count5++;
				}
			}
			
			if ((results[i].getModule().getType() == Type.PROJECT ||results[i].getModule().getType() == Type.CLIENT_PROJECT) && results[i].getGrade().isPass() ) {
				count6++;
			}
		}
		//System.out.println(student.getName()+ " "+count1 + " " + count2 + " " + count3 + " " + count4 + " " + count5 + " " + count6);
		if (count1 >= 3 && count2 >=3 && count3>1 && count4 >=4 && count5 >=2 && count6>=1) {
			return true;
		}
		else{
			return false;
		}
	}
}
