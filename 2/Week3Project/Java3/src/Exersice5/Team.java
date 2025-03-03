package Exersice5;

public class Team {
	private String schoolName;
	private String sport;
	private String teamName;
	public final static String MOTTO = "Sportsmanship!";
	public Team(String schoolName, String sport, String teamName) {
		this.schoolName = schoolName;
		this.sport = sport;
		this.teamName = teamName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	@Override
	public String toString() {
		return "Team [schoolName=" + schoolName + ", sport=" + sport + ", teamName=" + teamName + "]";
	}
}
