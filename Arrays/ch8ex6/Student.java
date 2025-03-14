package ch8ex6;

public class Student {
    private int id;
    private CollegeCourse[] courses = new CollegeCourse[2];

    public int getId() {
        return id;
    }

    public Student(int id) {
		this.id = id;
	}

	public void setId(int id) {
        this.id = id;
    }

    public CollegeCourse getCollegeCourse(int index) {
        if (index < 0 || index >= 5) {
            System.out.println("Invalid index. Please enter a numeric value from 0 to 4.");
            return null;
        }
        return courses[index];
    }

    public void setCollegeCourse(CollegeCourse course, int index) {
        if (index < 0 || index >= 5) {
            System.out.println("Invalid index. Please enter a numeric value from 0 to 4.");
            return;
        }
        courses[index] = course;
    }
}