/**
	 * This Module class maintains instance variables used in the TechnicalSchool class such as type, title, code & level. 
	 * It contains a constructor which initializes its values, as well as getter's and setter's methods
	 * @author Patricia
	 **/

	public class Module 
	{
		// declaring instance variables
		private String title;
		private String code;
		private Level level;
		private Type type;


		//The only constructor that initializes the values of the variables each time an Module object is created
		public Module(Type type, String title, String code, Level level)
		{
			this.title = title;
			this.code = code;
			this.level = level;
			this.type = type;
		}
		
		@Override 
		// getting a nice representation of the text 
		public String toString() {
			return this.getType()+ "       " + this.getTitle()+"       "+ this.getCode()+ "       "+ this.getLevel();
		}
		
		//Each variable has a get & a set method below
		public Type getType(){
			return type;
		}
		
		public void setType(Type type) {
			this.type = type;
		}
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title){
			this.title = title;
		}
		
		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
		
		public Level getLevel() {
			return level;
		}
		public void setLevel(Level level) {
			this.level = level;
		}
	}