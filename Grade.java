package laborator13;

public class Grade {
	
	private Double partialScore, examScore;
	private Student student;
	private String course;
 
	public Grade(String course, Student student) {
			partialScore = 0.0;
			examScore = 0.0;
			this.course = course;
			this.student = student; 
    }
 
	public Grade(String course, Student student,Double partialScore, Double examScore ) {
			this.partialScore = partialScore;
			this.examScore = examScore;
			this.course = course;
			this.student = student; 
    }
 
	public void setPartialScore(Double score) {
		partialScore = score;
	}
	
	public void setExamScore(Double score) {
		examScore = score;
	}
	
	public Double getTotal() {
		return partialScore + examScore;
	}
}