package StudentDatabase;

public class Student {
	private int studentId;
	private String email;
	private Person person;
	private DegreeProgram program;
	private int gpa;
	public Student(int studentId, String email, Person person, DegreeProgram program, int gpa) {
		this.studentId = studentId;
		this.email = email;
		this.person = person;
		this.program = program;
		this.gpa = gpa;
	}
	
	public static boolean isValidEmail(String email) {
        return email.matches("^[a-zA-Z]+@domain\\.com$");
    }
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public DegreeProgram getProgram() {
		return program;
	}
	public void setProgram(DegreeProgram program) {
		this.program = program;
	}
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	
	
	
}
