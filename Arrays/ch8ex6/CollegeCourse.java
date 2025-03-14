package ch8ex6;

public class CollegeCourse {
	private String courseId;
	private int creditHours;
	private String letterGrade;
	
	public CollegeCourse(String courseId, int creditHours, String letterGrade) {
		this.courseId = courseId;
		this.creditHours = creditHours;
		this.letterGrade = letterGrade;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public String getLetterGrade() {
		return letterGrade;
	}
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}
	
}
