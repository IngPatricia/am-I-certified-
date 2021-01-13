/**
 * This class stores the Module and Grade objects. It contains a constructor as well as getters and setters methods & a toString() method
 *@author Patricia
 **/
public class Result 
{

	// Assigning a memory location to store the module and grade objects(called defining a variable)
	Module module;
	Grade grade;
	

	//constructor
	public Result(Module module, Grade grade) {
		this.module = module;
		this.grade = grade;
		
	}
	
	//getters and setters methods for each variable
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	@Override 
	public String toString() {
		return this.getModule()+ "     " + this.getGrade()+"      ";
	}

}
