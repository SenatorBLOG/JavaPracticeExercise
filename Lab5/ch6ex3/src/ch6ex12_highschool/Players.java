package ch6ex12_highschool;

public class Players {
private String name;
private int scores;


public Players(String name, int scores) {
	super();
	this.name = name;
	this.scores = scores;
}
public Players(String name) {
	super();
	this.name = name;
	this.scores=0;
	
}

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getScores() {
	return scores;
}


public void setScores(int scores) {
	this.scores = scores;
}


public void display() {
	System.out.println(name + scores);
}
}
