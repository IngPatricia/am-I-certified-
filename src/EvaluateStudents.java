/**
 * This class was provided as part of the assessment for testing purposes
 *
 * */
public class EvaluateStudents
{


	public static Student axel()
	{
		TechnicalSchool ts = new TechnicalSchool();
		Student rb = new Student("Axel");

		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.BPLUS);
		rb.addResultToTranscript(ts.lookup("STAT102"),Grade.C);
		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.A);
		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.AMINUS);
		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.A);
		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.D);
		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.B);
		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.B);
		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.CMINUS);
		rb.addResultToTranscript(ts.lookup("EXTO396"),Grade.C);

		return rb;
	}

//	public static Student kate()
//	{
//		TechnicalSchool ts = new TechnicalSchool();
//		Student rb = new Student("Kate");
//
//		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.APLUS);
//		rb.addResultToTranscript(ts.lookup("STAT102"),Grade.AMINUS);
//		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.BPLUS);
//		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.A);
//		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.C);
//		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.A);
//		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.BPLUS);
//		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.AMINUS);
//		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.B);
//		rb.addResultToTranscript(ts.lookup("EXTO396"),Grade.B);
//
//		return rb;
//	}

//	public static Student jim()
//	{
//		TechnicalSchool ts = new TechnicalSchool();
//		Student rb = new Student("Jim");
//
//		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.A);
//		rb.addResultToTranscript(ts.lookup("STAT102"),Grade.BPLUS);
//		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.CPLUS);
//
//		rb.addResultToTranscript(ts.lookup("PROG202"),Grade.C);
//		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.C);
//		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.CPLUS);
//		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.CMINUS);
//
//		rb.addResultToTranscript(ts.lookup("THEO111"),Grade.D);
//		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.APLUS);
//		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.A);
//		rb.addResultToTranscript(ts.lookup("LOGI321"),Grade.B);
//		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.BMINUS);
//		rb.addResultToTranscript(ts.lookup("EXTO396"),Grade.APLUS);
//		return rb;
//	}

//	public static Student robin()
//	{
//		TechnicalSchool ts = new TechnicalSchool();
//		Student rb = new Student("Robin");
//
//		rb.addResultToTranscript(ts.lookup("PROG101"),Grade.C);
//		rb.addResultToTranscript(ts.lookup("DATA222"),Grade.C);
//
//		rb.addResultToTranscript(ts.lookup("INSY313"),Grade.CPLUS);
//		rb.addResultToTranscript(ts.lookup("WEBS332"),Grade.CPLUS);
//		rb.addResultToTranscript(ts.lookup("TECH103"),Grade.CPLUS);
//
//		rb.addResultToTranscript(ts.lookup("MODC233"),Grade.CMINUS);
//		rb.addResultToTranscript(ts.lookup("TOPG233"),Grade.CMINUS);
//
//		rb.addResultToTranscript(ts.lookup("PROJ399"),Grade.APLUS);
//		return rb;
//	}

	public static void main(String[] args) 
	{
		// uncomment depending who is been tested for
		TechnicalSchool ar = new TechnicalSchool();
		//Student aStudent = EvaluateStudents.axel();
		//Student aStudent = EvaluateStudents.kate();
		Student aStudent = EvaluateStudents.axel();
		//Student aStudent = EvaluateStudents.robin();

		Result[] transcript = aStudent.getTranscript();

		for(int i = 0; i < transcript.length;i++) {
			Module module = transcript[i].getModule();
			Grade grade = transcript[i].getGrade();
			System.out.println(module.getCode() + " " + grade);
		}
		System.out.println(ar.isCertified(aStudent));

	}
		
	
	
	
}

