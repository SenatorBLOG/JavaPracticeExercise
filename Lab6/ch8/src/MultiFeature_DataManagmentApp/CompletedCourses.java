package MultiFeature_DataManagmentApp;

public class CompletedCourses {
	private int courseId;
	private int credit;
	private String letterGrade;
	
	public CompletedCourses(int courseId, int credit, String letterGrade) {
		this.courseId = courseId;
		this.credit = credit;
		this.letterGrade = letterGrade;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getLetterGrade() {
		return letterGrade;
	}
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}
	public void display() {
		System.out.printf("The course ID: %d,",courseId);
	}
	
}
