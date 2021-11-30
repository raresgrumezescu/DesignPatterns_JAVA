package laborator13;

import java.util.*;

public class Course {
	
	String name;
	Teacher teacher;
	ArrayList<Assistant> assistants;
	ArrayList<Student> students;
	TreeSet<Grade> grades;
	
    private Course(CourseBuilder builder) {
        this.name = builder.name;
        this.teacher = builder.teacher;
        this.assistants = builder.assistants;
        this.students = builder.students;
        this.grades = builder.grades;
    }
    
    public String getName() {
        return name;
    }
    
    public Teacher getTeacher() {
        return teacher;
    }
    
    public ArrayList<Assistant> getAssistants() {
        return assistants;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }
    
    public TreeSet<Grade> getGrades() {
        return grades;
    }
    
    public String toString() {
    	String s = "";
    	s = s + "Nume curs: " + name + "\n" + "Profesor titular: " + teacher.lastName + "\n";
    	Iterator<Assistant> jt = assistants.iterator();
    	s = s + "Asistenti: ";
    	while (jt.hasNext()) {
    		s = s + jt.next().firstName + " " + jt.next().lastName + "\n";
    	}
    	
    	Iterator<Student> it = students.iterator();
    	while (it.hasNext()) {
    		s = s + it.next().firstName + " " + it.next().lastName + " " + "\n";
    	}
    	
    	Iterator<Grade> kt = grades.iterator();
    	while (kt.hasNext()) {
    		s = s + kt.next().getTotal() + "\n";
    	}
    	
        return s;
    }
    
    public static class CourseBuilder {
    	String name;
    	Teacher teacher;
    	ArrayList<Assistant> assistants;
    	ArrayList<Student> students;
    	TreeSet<Grade> grades;
    	
        public CourseBuilder name (String name) {
            this.name = name;
            return this;
        }
        
        public CourseBuilder teacher (Teacher teacher) {
            this.teacher = teacher;
            return this;
        }
        
        public CourseBuilder assistants (ArrayList<Assistant> assistants) {
            this.assistants = assistants;
            return this;
        }
 
        public CourseBuilder students (ArrayList<Student> students) {
            this.students = students;
            return this;
        }
        
        public Course build() {
            return new Course(this);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
