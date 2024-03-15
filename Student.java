
public class Student {
	private String firstname;
	private String lastname;
	private int age;
	private String gender;
	//instance variables
	
	public Student() {
		this.firstname = "Justin";
		this.lastname = "Pongos";
		this.age = 17;
		this.gender = "male";
	}//end zero argument instructor
	
	public Student (String firstname, String lastname, int age, String gender) {//instantiated variables
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender=gender;
	}//end 2nd argument instructor
	
	public String toString() {
		String output;
		output = ("The students name is " + firstname + ", " + lastname + " and is a " + age +  " years old " + gender);
		return output;
	}//end toString
}//end class
