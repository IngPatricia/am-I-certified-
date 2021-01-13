/**
 * @author Patricia
 ***/

public class Student {

	//instance variables
	String studentName;
	public int numberOfResults;
	private Result[] transcript;
	private final static int MAX_TRANSCRIPT_LENGTH = 20; // making a constant

	
	
	//constructor that initialises the value for the declared variables
	public Student(String studentName) {
		this.studentName = studentName;
		transcript = new Result[MAX_TRANSCRIPT_LENGTH]; // the max length of each students transcript is 20
		this.numberOfResults = 0; // no results to start with
	}
	
	
	
	/**The purpose here is to add up a result object into the transcript(an array), and to increment
	 * the numberOfResults(the count that keeps track of how many results there are
	 * @return none
	 * */
	public void addResultToTranscript(Module module, Grade grade)
	{
		int count = numberOfResults;
		Result result = new Result(module, grade);
		if (count <= MAX_TRANSCRIPT_LENGTH){ // as long as the transcript's length has not been exceeded
			transcript[count] = result; // allocating the result on an specific position - the end of the transcript
			count++;
		}
		numberOfResults = count;
	}

	/***The purpose here is to have the transcript of this particular student with no null values on it.
	 * @return an array of Results object
	 **/
	public Result[] getTranscript(){

		Result[] array = new Result[numberOfResults]; //this is my array that will be filled up with the size of the numberOfResults
		for (int i =0; i < numberOfResults; i++) {
			array[i] = transcript[i];
		}	
		return array;
	}

	// just to obtain the student's name
	public String getName() {
		String name = this.studentName;
		return name;
	}
}

