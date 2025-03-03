package ch5ex7_jobApplicant;

public class JobApplicant {
	private String name;
	private String phoneNum;
	private boolean wordProc;
	private boolean sheets;
	private boolean database;
	private boolean graphics;
	public JobApplicant(String name, String phoneNum, boolean wordProc, boolean sheets, boolean database,
			boolean graphics) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.wordProc = wordProc;
		this.sheets = sheets;
		this.database = database;
		this.graphics = graphics;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public boolean isWordProc() {
		return wordProc;
	}
	public boolean isSheets() {return sheets;}
	public boolean isDatabase() {
		return database;
	}
	public boolean isGraphics() {
		return graphics;
	}
	
	
}
