package guipackage;

public class Student {
	private String name;
	private double score;
	private String status;
	private String StudStat;


	public String getStudStat() {
		return StudStat;
	}

	public void setStudStat(String studStat) {
		StudStat = studStat;
	}

	public Student(String name, double score, String status) {
		this.name = name;
		this.score = score;
		this.status = status;
	}

	public double calculateFee() {
		if(status.equals("grad") && StudStat.equals("International")) {
			return 900;
		}
		else
			return 700;
	}

	public String calculateLetterGrade() {
		if(score > 90)
			return "A+";
		else
			return  "B";
	}
}
